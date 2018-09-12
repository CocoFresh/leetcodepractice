package leetcode;

/**
 * @author xintao.feng
 * @date 2018/9/10.
 */
public class solution {

    private Integer INT_MAX = 2147483647;
    private Integer INT_MIN = -2147483648;

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {

                    result[0] = nums[i];
                    result[1] = nums[j];
                }
            }
        }
        return result;
    }

    public int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
//            if (rev > INT_MAX/10 || (rev == INT_MAX / 10 && pop > 7)) return 0;
//            if (rev < INT_MIN/10 || (rev == INT_MIN / 10 && pop < -8)) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;
        char symbol = '-';
        Integer y = x;
        String m = y.toString();
        char[] num = new char[m.length()];
        String n = new String();
        for (int i = 0; i < num.length; i++) {
            num[i] = m.charAt(i);
        }
        if (x < 0) {
            n += symbol;
            for (int i = num.length - 1; i >= 1; i--) {
                n += num[i];
            }
        } else {
            for (int i = num.length - 1; i >= 0; i--) {
                n += num[i];
            }
        }
        Long y1 = Long.parseLong(n);
        if (y1 > INT_MAX || y1 < INT_MIN) {
            return 0;
        }
        y = Integer.parseInt(n);
        return y;
    }
//字符串转整数
    public int myAtoi(String str) {
        String n = "";
        if (str.equals(n) || str.equals("-")) {
            return 0;
        }
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (i != str.length() - 1) {
                if (str.charAt(i) == ' ') {
                    continue;
                } else if ((ch < 48 && ch != 45 && ch != 43) || ch > 57 || (str.charAt(i) == 45 && (str.charAt(i + 1) > 57 || str.charAt(i + 1) < 48)) || (str.charAt(i) == 43 && (str.charAt(i + 1) > 57 || str.charAt(i + 1) < 48))) {
                    break;
                }
                if ((str.charAt(i) <= 57 && str.charAt(i) >= 48) && (str.charAt(i + 1) <= 57 && str.charAt(i + 1) >= 48)) {
                    n += str.charAt(i);
                } else if (str.charAt(i) == 45 || str.charAt(i) == 43) {
                    n += str.charAt(i);
                } else {
                    n += str.charAt(i);
                    break;
                }
            } else {
                if (str.charAt(i) <= 57 && str.charAt(i) >= 48) {
                    n += str.charAt(i);
                }
            }
        }
        String m = "";
        if (n.equals(m)) {
            return 0;
        }
        try {
            return Integer.parseInt(n);
        }catch (Exception e){
            if (n.charAt(0) == '-') {
                if (n.length() > INT_MIN.toString().length()) {
                    return INT_MIN;
                } else if (n.length() == INT_MIN.toString().length()) {
                    if (Long.parseLong(n) < INT_MIN) {
                        return INT_MIN;
                    }
                }
            } else {
                if (n.length() > INT_MAX.toString().length()) {
                    return INT_MAX;
                } else if (n.length() == INT_MAX.toString().length()) {
                    if (Long.parseLong(n) > INT_MAX) {
                        return INT_MAX;
                    }
                }
            }
        }
        return Integer.parseInt(n);
    }

    public static void main(String[] args) {


        solution solution = new solution();
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        int[] result = solution.twoSum(nums,target);
//        System.out.println(
//                result
//        );
        int x = solution.myAtoi("    000000000000000    ");
//        int x = solution.reverse(-2147483648);
        System.out.println(x);
    }

}

