import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {
    @Test
    public void testSolution() {
        assertTrue(new PalindromeNumber().solution(0));
    }

    @Test
    public void testSolution2() {
        assertTrue(new PalindromeNumber().solution(1));
    }
    @Test
    public void testSolution3() {
        assertTrue(new PalindromeNumber().solution(121));
    }
    @Test
    public void testSolution4() {
        assertTrue(new PalindromeNumber().solution(11));
    }
    @Test
    public void testSolution5() {
        assertFalse(new PalindromeNumber().solution(112));
    }
    @Test
    public void testSolution6() {
        assertFalse(new PalindromeNumber().solution(-121));
    }
    @Test
    public void testSolution7() {
        assertFalse(new PalindromeNumber().solution(Integer.MAX_VALUE));
    }
    @Test
    public void testSolution8() {
        assertFalse(new PalindromeNumber().solution(Integer.MIN_VALUE));
    }


}