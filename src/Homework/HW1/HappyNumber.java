package Homework.HW1;

public class HappyNumber {
    public static boolean isHappy(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be 0 or greater");
        } else {
            int out = n;
            while(extractNum(out).length > 1) {
                int[] ex = extractNum(out);
                out = 0;
                for (int i : ex) {
                    out += Math.pow(i, 2);
                }
            }
            return (out == 1);
        }
    }

    //splits n into its digit(s) as an array
    private static int[] extractNum(int n) {
        String in = Integer.toString(n);
        String[] strings = in.split("");
        int[] out = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            out[i] = Integer.parseInt(strings[i]);
        }
        return out;
    }
}
