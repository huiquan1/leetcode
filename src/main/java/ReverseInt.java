/**
 * Created by huiquan on 18-3-31.
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
