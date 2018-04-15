import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefix() throws Exception {
        String[] a = {"leets","leetcode","leet","leeds"};
        String res = new LongestCommonPrefix().longestCommonPrefix(a);
        assertEquals("lee",res);
    }

}