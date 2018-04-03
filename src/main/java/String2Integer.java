public class String2Integer {

    public int convert(String str) {
        int index = 0, sign = 1, total = 0;

        if (str == null || str.length() == 0) {
            return 0;
        }
        //remove spaces
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }

        if (index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = str.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;


            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;

        }


        return total * sign;
    }
}
