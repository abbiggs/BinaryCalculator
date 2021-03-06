import java.lang.Math;

public class BinaryConverter {
    String[] storage;
    //stores first number entered and function pressed
    // comment for commit test, since it doesn't want to work

    public int toDecimal(String binary){
        //Takes binary string input, converts to decimal.
        String binaryString = binary;
        int decimal = Integer.parseInt(binaryString, 2);
        return decimal;
    }

    public String toBinary(int decimal){
        //Takes int decimal as input, converts to binary string.
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    public void store(String binary, String function){
        // stores the first number and what function button was pushed
        // runs on any function button push,
        // binary is the result of calcDisplay.getText
        // function is the button pushed
        // binary and function should be pushed from UI
        // remove useless comments later...
        storage = new String[]{binary,function};
    }

    public void clearStorage(){
        storage = new String[2];
    }

    public String execute(String binary) throws Exception {
        // runs on clicking equals button
        if (storage[1].equals("multiply")) {
            return multiply(storage[0], binary);
        }
        else if (storage[1].equals("add")) {
            return add(storage[0], binary);
        }
        else if (storage[1].equals("subtract")) {
            return subtract(storage[0], binary);
        }
        else if (storage[1].equals("divide")){
            return divide((storage[0]), binary);
        }
        else if (storage[1].equals("square")){
            return square(storage[0] );
        }
        else if (storage[1].equals("root")){
            return squareRoot(storage[0]);
        }
        else {
            throw new Exception();
        }
    }

    public String multiply(String binary1, String binary2) {
        int dec1 = toDecimal(binary1);
        int dec2 = toDecimal(binary2);
        int result = dec1 * dec2;
        return toBinary(result);
    }

    public String divide(String binary1, String binary2) {
        try {
            int dec1 = toDecimal(binary1);
            int dec2 = toDecimal(binary2);
            int result = dec1 / dec2;
            return toBinary(result);
        } catch (ArithmeticException e) {
            return "Divide by Zero Err.";
        }
    }

    public String add(String binary1, String binary2) {
        int dec1 = toDecimal(binary1);
        int dec2 = toDecimal(binary2);
        int result = dec1 + dec2;
        return toBinary(result);
    }

    public String subtract(String binary1, String binary2) {
        int dec1 = toDecimal(binary1);
        int dec2 = toDecimal(binary2);
        int result = dec1 - dec2;
        if(result > 0) {
            return toBinary(result);
        }else{
            return "Negative Num Err.";
        }
    }

    public String square(String binary1) {
        int dec1 = toDecimal(binary1);
        int result = dec1 * dec1;
        return toBinary(result);
    }

    public String squareRoot (String binary1) {
        int dec1 = toDecimal(binary1);
        int result = (int) Math.sqrt(dec1);
        return toBinary(result);
    }
}
