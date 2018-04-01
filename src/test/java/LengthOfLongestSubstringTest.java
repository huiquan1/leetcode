import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LengthOfLongestSubstringTest {
    @Test
    public void lengthOfLongestSubstring() throws Exception {

        assertEquals(wrapper("abca"),3);
    }

    private int wrapper(String str) {
        return new LengthOfLongestSubstring().lengthOfLongestSubstring(str);
    }
}