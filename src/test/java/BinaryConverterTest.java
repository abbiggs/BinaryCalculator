import org.junit.Assert;
import org.junit.Test;

public class BinaryConverterTest {

    @Test
    public void toDecimalTest(){
        BinaryConverter binaryConverter = new BinaryConverter();
        int decimal = binaryConverter.toDecimal("1111");
        int decimal_1 = binaryConverter.toDecimal("110011111");
        int decimal_2 = binaryConverter.toDecimal("11111111111111111");
        Assert.assertEquals(decimal, 15);
        Assert.assertEquals(decimal_1, 415);
        Assert.assertEquals(decimal_2, 131071);
    }

    @Test
    public void toBinaryTest(){
        BinaryConverter binaryConverter = new BinaryConverter();
        String binary = Integer.toBinaryString(15);
        String binary_1 = Integer.toBinaryString(1047);
        String binary_2 = Integer.toBinaryString(142500);
        Assert.assertEquals(binary, "1111");
        Assert.assertEquals(binary_1, "10000010111");
        Assert.assertEquals(binary_2, "100010110010100100");
    }
}
