package test1;

public class Index {
    public static String findMinusMinus(String value) {
        int count = 1;
        String temp = "";
        for (int i = 0; i < value.length() - 1; i++) {
            if (value.charAt(i) == '-' && value.charAt(i + 1) == '-') {
                System.out.println("start = " + i + ", end = " + (i + 1));
                temp = value.substring(0, i + 1* count) + "(" + value.substring(i + 1);
                count++;
            }
        }

        temp += ")";
        return temp;
    }

    public static void main(String[] args) {
        String temp = "9--6";
        System.out.println(findMinusMinus(temp));
    }
}
