package util;

public class ArrayUtil {
    public static void print(int[] a) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int k : a) {
            sb.append(k).append(",");
        }
        sb.append("]");
        System.out.println(sb.toString().replace(",]", "]"));
    }
}
