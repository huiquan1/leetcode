/**
 * convert int to roman 0-3999
 */
public class Integer2Roman {

    public String solution(int num) {
        String[][] arr = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };

        StringBuilder res = new StringBuilder();
        res.append(arr[3][num / 1000 % 10]);
        res.append(arr[2][num / 100 % 10]);
        res.append(arr[1][num / 10 % 10]);
        res.append(arr[0][num % 10]);
        return res.toString();
    }
}
