/**
 * Given a 32-bit signed integer, reverse digits of an integer.

 Example 1:

 Input: 123
 Output:  321

 Example 2:

 Input: -123
 Output: -321

 Example 3:

 Input: 120
 Output: 21

 Note:
 Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 */
public class ReverseInt {
    public int reverse(int n) {
        int res = 0;
        while (n != 0) {

            int t = res * 10 + n % 10;
            if (t / 10 != res) return 0;
            res = t;
            n /= 10;
        }
        System.out.println("result = [" + res + "]");
        return res;
    }
}
