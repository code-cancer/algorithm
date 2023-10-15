package main.common;

public class PrintHelper {
    
    public static String toString(int[] arr) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if(i < arr.length - 1) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

}
