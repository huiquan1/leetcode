import org.junit.Test;

import static org.junit.Assert.*;

public class Integer2RomanTest {
    @Test
    public void solution() throws Exception {
        assertEquals("",new Integer2Roman().solution(0));
    }
    @Test
    public void solution1() throws Exception {
        assertEquals("I",new Integer2Roman().solution(1));
    }

    @Test
    public void solution2() throws Exception {
        assertEquals("MMMCMXCIX",new Integer2Roman().solution(3999));
    }
}