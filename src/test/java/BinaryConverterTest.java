import org.junit.Assert;
import org.junit.Test;

public class BinaryConverterTest {

    @Test
    public void toDecimalTest(){
        BinaryConverter binaryConverter = new BinaryConverter();
        int decimal = binaryConverter.toDecimal("1111");
        int decimal_1 = binaryConverter.toDecimal("1100");
        int decimal_2 = binaryConverter.toDecimal("1000");
        Assert.assertEquals(decimal, 15);
        Assert.assertEquals(decimal_1, 12);
        Assert.assertEquals(decimal_2, 8);
    }

    @Test
    public void toBinaryTest(){
        BinaryConverter binaryConverter = new BinaryConverter();
        String binary = Integer.toBinaryString(15);
        String binary_1 = Integer.toBinaryString(12);
        String binary_2 = Integer.toBinaryString(8);
        Assert.assertEquals(binary, "1111");
        Assert.assertEquals(binary_1, "1100");
        Assert.assertEquals(binary_2, "1000");
    }
}
