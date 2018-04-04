import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {
    @Test
    public void testSolution() {
        assertTrue(new PalindromeNumber().isPalindrome(0));
    }

    @Test
    public void testSolution2() {
        assertTrue(new PalindromeNumber().isPalindrome(1));
    }
    @Test
    public void testSolution3() {
        assertTrue(new PalindromeNumber().isPalindrome(121));
    }
    @Test
    public void testSolution4() {
        assertTrue(new PalindromeNumber().isPalindrome(11));
    }
    @Test
    public void testSolution5() {
        assertFalse(new PalindromeNumber().isPalindrome(112));
    }
    @Test
    public void testSolution6() {
        assertFalse(new PalindromeNumber().isPalindrome(-121));
    }
    @Test
    public void testSolution7() {
        assertFalse(new PalindromeNumber().isPalindrome(Integer.MAX_VALUE));
    }
    @Test
    public void testSolution8() {
        assertFalse(new PalindromeNumber().isPalindrome(Integer.MIN_VALUE));
    }


}