import org.junit.Assert;
import org.junit.Test;

public class BinaryConverterTest {

    @Test
    public void toDecimalTest() {
        BinaryConverter binaryConverter = new BinaryConverter();
        int decimal = binaryConverter.toDecimal("1111");
        int decimal_1 = binaryConverter.toDecimal("110011111");
        int decimal_2 = binaryConverter.toDecimal("11111111111111111");
        Assert.assertEquals(decimal, 15);
        Assert.assertEquals(decimal_1, 415);
        Assert.assertEquals(decimal_2, 131071);
    }

    @Test
    public void toBinaryTest() {
        BinaryConverter binaryConverter = new BinaryConverter();
        String binary = Integer.toBinaryString(15);
        String binary_1 = Integer.toBinaryString(1047);
        String binary_2 = Integer.toBinaryString(142500);
        Assert.assertEquals(binary, "1111");
        Assert.assertEquals(binary_1, "10000010111");
        Assert.assertEquals(binary_2, "100010110010100100");
    }

    @Test
    public void multiplyTest() {
        BinaryConverter binaryConverter = new BinaryConverter();
        String binary1 = binaryConverter.multiply("010","101");
        String binary2 = binaryConverter.multiply("10101010","11001100");
        String binary3 = binaryConverter.multiply("010110","101011");
        String binary4 = binaryConverter.multiply("11010","11011");
        Assert.assertEquals(binary1, "1010");
        Assert.assertEquals(binary2, "1000011101111000");
        Assert.assertEquals(binary3, "1110110010");
        Assert.assertEquals(binary4, "1010111110");
    }

    @Test
    public void addTest() {
        BinaryConverter binaryConverter = new BinaryConverter();
        String binary1 = binaryConverter.add("010","101");
        String binary2 = binaryConverter.add("10101010","11001100");
        String binary3 = binaryConverter.add("010110","101011");
        String binary4 = binaryConverter.add("11010","11011");
        Assert.assertEquals(binary1, "111");
        Assert.assertEquals(binary2, "101110110");
        Assert.assertEquals(binary3, "1000001");
        Assert.assertEquals(binary4, "110101");
    }
    @Test
    public void subtractTest() {
        BinaryConverter binaryConverter = new BinaryConverter();
        String binary1 = binaryConverter.subtract("010","101");
        String binary2 = binaryConverter.subtract("10101010","11001100");
        String binary3 = binaryConverter.subtract("010110","101011");
        String binary4 = binaryConverter.subtract("11010","11011");
        Assert.assertEquals(binary1, "11111111111111111111111111111101");
        Assert.assertEquals(binary2, "11111111111111111111111111011110");
        Assert.assertEquals(binary3, "11111111111111111111111111101011");
        Assert.assertEquals(binary4, "11111111111111111111111111111111");
    }



}
