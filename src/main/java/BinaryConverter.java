public class BinaryConverter {
    String[] storage;
    //stores first number entered and function pressed

    public int toDecimal(String binary){
        String binaryString = binary;
        int decimal = Integer.parseInt(binaryString, 2);
        return decimal;
    }

    public String toBinary(int decimal){
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
        return toBinary(result);
    }
}
