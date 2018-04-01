import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by huiquan on 18-3-31.
 */
public class ReverseIntTest {

    @Test
    public void testReverse(){
        assertEquals(new ReverseInt().reverse(123),321);

    }
    @Test
    public void testReverse2(){
        assertEquals(new ReverseInt().reverse(1),1);

    }
    @Test
    public void testReverse4(){
        assertEquals(new ReverseInt().reverse(12000),21);
    }

    @Test
    public void testReverse5(){
        assertEquals(new ReverseInt().reverse(-12),-21);
    }

    @Test
    public void testReverse6(){
        assertEquals(new ReverseInt().reverse(1534236469),0);
    }
    @Test
    public void testReverse7(){
        assertEquals(new ReverseInt().reverse(32768),86723);
    }



}