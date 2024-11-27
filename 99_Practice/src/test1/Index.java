package test1;

import java.util.ArrayList;
import java.util.Scanner;

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

    public static boolean isPalindrome(int x) {
        String temp = String.valueOf(x);

        for (int i = 0; i < temp.length() / 2; i++) {
            if (temp.charAt(i) != temp.charAt(temp.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Start = 0;
        int num2Start = 0;
        ArrayList<Integer> addingBoth = new ArrayList<>();

        for (;num1Start < nums1.length || num2Start < nums2.length;) {
            if (num1Start > nums1.length) {
                addingBoth.add(nums2[num2Start]);
                num2Start++;
            } else  if (num2Start > nums2.length) {
                addingBoth.add(nums1[num1Start]);
                num1Start++;
            } else if (nums1[num1Start] < nums2[num2Start]) {
                addingBoth.add(nums1[num1Start]);
                num1Start++;
            } else if (nums2[num2Start] < nums1[num1Start]) {
                addingBoth.add(nums2[num2Start]);
                num2Start++;
            } else {
                addingBoth.add(nums1[num1Start]);
                addingBoth.add(nums2[num2Start]);
                num1Start++;
                num2Start++;
            }
        }

        if (addingBoth.size() % 2 == 0) {
            return (double)addingBoth.get(addingBoth.size() / 2) + (double)addingBoth.get(addingBoth.size() / 2 - 1);
        }
        return (double)addingBoth.get(addingBoth.size() / 2);



    }

    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int row = 0;
        int col = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    row = i;
                    col = j;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            char direction = routes[i].charAt(0);
            int routesDirection = (int)routes[i].charAt(1);
            switch (direction) {
                case 'N' : // 북쪽
                    if (row - routesDirection < 0) {
                        break;
                    }
                    for (int j = 0; j < routesDirection; j++) {
                        if (park[row - j].charAt (col) == 'X') {
                            break;
                        }
                    }
                    row -= routesDirection;
                    break;
                case 'S' : // 남쪽
                    if (row + routesDirection > park.length) {
                        break;
                    }
                    for (int j = 0; j < routesDirection; j++) {
                        if (park[row + j].charAt (col) == 'X') {
                            break;
                        }
                    }
                    row += routesDirection;
                    break;
                case 'E' : // 동쪽
                    if (col + routesDirection > park[i].length()) {
                        break;
                    }
                    for (int j = 0; j < routesDirection; j++) {
                        if (park[row].charAt (col + j) == 'X') {
                            break;
                        }
                    }
                    col += routesDirection;
                    break;
                case 'W' : // 서쪽
                    if (col - routesDirection < 0) {
                        break;
                    }
                    for (int j = 0; j < routesDirection; j++) {
                        if (park[row].charAt (col - j) == 'X') {
                            break;
                        }
                    }
                    col -= routesDirection;
                    break;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
