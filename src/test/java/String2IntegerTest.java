import org.junit.Test;

import static org.junit.Assert.*;

public class String2IntegerTest {

    @Test
    public void testConvert(){
        assertEquals(0,new String2Integer().convert("0"));
    }
    @Test
    public void testConvert1(){
        assertEquals(1,new String2Integer().convert("1"));
    }

    @Test
    public void testConvert2(){
        assertEquals(0,new String2Integer().convert(" "));
    }
    @Test
    public void testConvert3(){
        assertEquals(0,new String2Integer().convert("a"));
    }
    @Test
    public void testConvert4(){
        assertEquals(Integer.MAX_VALUE,new String2Integer().convert("2147483647"));
    }
    @Test
    public void testConvert5(){
        assertEquals(Integer.MIN_VALUE,new String2Integer().convert("-2147483648"));
    }
    @Test
    public void testConvert6(){
        assertEquals(Integer.MAX_VALUE,new String2Integer().convert("2147483648"));
    }
    @Test
    public void testConvert7(){
        assertEquals(Integer.MIN_VALUE,new String2Integer().convert("-2147483649"));
    }

    @Test
    public void testConvert8(){
        assertEquals(2147483646,new String2Integer().convert("2147483646"));
    }
    @Test
    public void testConvert9(){
        assertEquals(-2147483647,new String2Integer().convert("-2147483647"));
    }
}