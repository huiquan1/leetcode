import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntTest {
    @Test
    public void solution() throws Exception {
        assertEquals(4, new RomanToInt().solution("IV"));
    }
    @Test
    public void solution1() throws Exception {
        assertEquals(0, new RomanToInt().solution(""));
    }
    @Test
    public void solution2() throws Exception {
        assertEquals(1, new RomanToInt().solution("I"));
    }
    @Test
    public void solution3() throws Exception {
        assertEquals(3999, new RomanToInt().solution("MMMCMXCIX"));
    }

}