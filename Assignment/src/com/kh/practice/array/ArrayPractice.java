package com.kh.practice.array;

import java.util.*;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//cmd랑 console은 같은 개념
public class ArrayPractice {
    Scanner sc = new Scanner(System.in);
    static int index = 0;
    public void practice1() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice2() {
        int[] arr = new int[10];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice3() {
        try {
            System.out.print("양의 정수 : ");
            int arrLength = Integer.parseInt(sc.nextLine());
            if (arrLength <= 0) {
                throw new Exception();
            }
            int[] arr = new int[arrLength];
            for (int i = 0; i < arrLength; i++) {
                arr[i] = i + 1;
                System.out.print(arr[i] + " ");
            }

        } catch (NumberFormatException e) {
            System.out.println("정수만 입력해주세요");
            practice3();
        } catch (Exception e) {
            System.out.println("양수를 입력해주세요");
            practice3();
        }
    }

    public void practice4() {
        String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};

        System.out.println(fruit[1]);
    }

    public void practice5() {
        System.out.print("문자열 : ");
        String input = sc.nextLine();
        System.out.print("문자 : ");
        char ch = sc.next().charAt(0);
        int count = 0;
        String index = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
                index += i + " ";
            }
        }
        System.out.println(input + "에 " + ch + "가 존재하는 위치(인덱스) : " + index);
        System.out.println(ch + " 개수 : " + count);
    }

    public void practice6() {
        try {
            System.out.print("0 ~ 6 사이 숫자 입력 : ");
            int num = Integer.parseInt(sc.nextLine());
            if (num < 0 || num > 7) {
                throw new Exception();
            }
            String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
            System.out.println(week[num]);

        } catch (NumberFormatException e) {
            System.out.println("정수로 입력해주세요");
            practice6();
        } catch (Exception e) {
            System.out.println("잘못 입력하셨습니다.");
            practice6();
        }
    }

    public void practice7() {
        try {
            System.out.print("정수 : ");
            int num = Integer.parseInt(sc.nextLine());
            if (num <= 0) {
                throw new Exception();
            }
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            int total = 0;
            for (int i = 0; i < num; i++) {
                System.out.print(arr[i] + " ");
                total += arr[i];
            }
            System.out.println("\n총 합 : " + total);
        } catch(NumberFormatException e) {
            System.out.println("정수로 입력해주세요.");
            practice7();
        } catch(Exception e) {
            System.out.println("양의 정수만 입력하세요");
            practice7();
        }
    }

    public void practice8() {
        try {
            System.out.print("정수 : ");
            int num = Integer.parseInt(sc.nextLine());
            if (num <= 0 || num % 2 == 0) {
                throw new Exception();
            }
            int[] arr = new int[num];
            int total = 0;
            int input = 1;
            for (int i = 0; i < num / 2; i++) {
                arr[i] = input;
                arr[num - i - 1] = input;
                input++;
            }
            arr[(num/2)] = input;
            for (int i = 0; i < num - 1; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println(arr[num - 1]);

        } catch(NumberFormatException e) {
            System.out.println("정수로 입력해주세요.");
            practice7();
        } catch(Exception e) {
            System.out.println("다시 입력하세요");
            practice8();
        }
    }

    public void practice9() {
        String[] chicken = {"후라이드", "양념", "마늘", "간장"};
        System.out.print("치킨 이름을 입력하세요 : ");
        String input = sc.nextLine();

        List<String> chickenList = Arrays.asList(chicken);
        boolean matchResult = chickenList.contains(input);
        if (matchResult) {
            System.out.println(input + "치킨 배달 가능");
            return;
        }
        System.out.println(input + "치킨은 없는 메뉴입니다.");
    }

    public void practice10() {
        String REGEX_IDENTIFICATION = "\\d{6} \\- [1-4]\\d{6}";
        try {
            System.out.print("주민등록번호(-포함) : ");
            String input = sc.nextLine();
            if (input.matches(REGEX_IDENTIFICATION)) {
                throw new Exception();
            }
            char[] identificationArray = new char[14];
            for (int i = 0; i < input.length(); i++) {
                if (i < 6 || i == 7) {
                    identificationArray[i] = input.charAt(i);
                } else if (i == 6) {
                    identificationArray[i] = '-';
                } else {
                    identificationArray[i] = '*';
                }
            }
            for (int i = 0; i < identificationArray.length; i++) {
                System.out.print(identificationArray[i]);
            }

        } catch (Exception e) {
            System.out.println("******-******* 형식으로 작성해주세요.");
            practice10();
        }
    }

    public void practice11() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
            System.out.print(arr[i] + " ");
        }
    }

    public void practice12() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(arrList);
        arr = arrList.stream().mapToInt(i -> i).toArray();
        int max = arr[9];
        int min = arr[0];
        System.out.println("\n최대값 : " + max);
        System.out.println("최소값 : " + min);
    }

    public void practice13() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            boolean checking = false;
            while (!checking) {
                int temp = new Random().nextInt(10) + 1;
                if (!arrayList.contains(temp)) {
                    arrayList.add(temp);
                    checking = true;
                }
            }
        }
        int[] arr = arrayList.stream().mapToInt(i -> i).toArray();
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public void practice14() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            boolean checking = false;
            while (!checking) {
                int temp = new Random().nextInt(100) + 1;
                if (!arrayList.contains(temp)) {
                    arrayList.add(temp);
                    checking = true;
                }
            }
        }
        Collections.sort(arrayList);
        int[] arr = arrayList.stream().mapToInt(i -> i).toArray();
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public void practice15() {
        System.out.print("문자열 : ");
        String input = sc.nextLine();
        Map<Integer, String> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            if (!map.containsValue(Character.toString(input.charAt(i)))) {
                map.put(index, Character.toString(input.charAt(i)));
                index++;
            }
        }
        String[] result = new String[map.size()];
        System.out.print("문자열에 있는 문자 : ");
        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(i);
            System.out.print(result[i] + " ");
        }
        System.out.println("\n문자 개수 : " + result.length);
    }

    public void practice16() {
        ArrayList<String> arrayList = new ArrayList<>();

        boolean checking = true;
        do {
            //arraylist 생성 후 문자열 초기화
            arrayList = practice16DefiningArray(arrayList);
            //y or n 를 입력 받아 arraylist 추가 여부 확인
            checking = practice16CheckingYesOrNo(arrayList);
        } while(checking);
        for (String j : arrayList) {
            System.out.print(j + " ");
        }
    }

    public ArrayList<String> practice16DefiningArray(ArrayList<String> arrayList) {
        try {
            if (index == 0) {
                System.out.print("배열의 크기를 입력하세요 : ");
            } else {
                System.out.print("더 입력하고 싶은 개수 : ");
            }
            int size = Integer.parseInt(sc.nextLine());
            if (size <= 0) {
                throw new NumberFormatException();
            }
            for (int i = 0; i < size; i++) {
                System.out.print((index+1) + "번째 문자열 : ");
                arrayList.add(sc.nextLine());
                index++;
            }
            return arrayList;

        } catch (NumberFormatException e) {
            System.out.println("질린다.. 정수만 입력하라고! 양수만!");
            return practice16DefiningArray(arrayList);
        }
    }

    public boolean practice16CheckingYesOrNo(ArrayList<String> arrayList) {
        try {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            String input = sc.nextLine();
            if (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
                throw new NumberFormatException();
            }
            if (input.equalsIgnoreCase("Y")) {
                return true;
            }
            return false;
        } catch (Exception e){
            System.out.println("Y or N");
            return practice16CheckingYesOrNo(arrayList);
        }
    }
}
