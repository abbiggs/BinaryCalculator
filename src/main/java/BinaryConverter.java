public class BinaryConverter {

    public int toDecimal(String binary){
        String binaryString = binary;
        int decimal = Integer.parseInt(binaryString, 2);
        return decimal;
    }

    public String toBinary(int decimal){
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }
}
