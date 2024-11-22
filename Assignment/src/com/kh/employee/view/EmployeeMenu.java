package com.kh.employee.view;

import com.kh.employee.controller.EmployeeController;

import java.util.Scanner;

public class EmployeeMenu {
    Scanner sc = new Scanner(System.in);

    EmployeeController employeeController = new EmployeeController();

    public EmployeeMenu() {
        try {
            System.out.println("1. 사원 추가");
            System.out.println("2. 사원 수정");
            System.out.println("3. 사원 삭제");
            System.out.println("4. 사원 출력");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호를 누르세요 : ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    insertEmp();
                    break;
                case 2:
                    updateEmp();
                    break;
                case 3:
                    deleteEmp();
                    break;
                case 4:
                    printEmp();
                    break;
                case 9:
                    return;
                default:
                    throw new NumberFormatException();
            }
            new EmployeeMenu();

        } catch (NumberFormatException e) {
            System.out.println("입력 방식이 잘못 되었습니다. 다시 입력해주세요");
            new EmployeeMenu();
        }
    }

    public void insertEmp() {
        try {
            System.out.print("사원 번호 : ");
            int empNo = Integer.parseInt(sc.nextLine());
            System.out.print("사원 이름 : ");
            String name = sc.nextLine();
            System.out.print("사원 성별");
            char gender = sc.next().charAt(0);
            System.out.print("전화 번호 : ");
            String phone = sc.nextLine();

            String yesOrNo = "";
            String dept = null;
            int salary = 0;
            double bonus = 0;
            while (true) {
                System.out.print("추가적인 정보를 더 입력하실 건가요?(y or n) : ");
                yesOrNo = sc.nextLine();
                if (yesOrNo.equalsIgnoreCase("y")) {
                    System.out.print("사원 부서 : ");
                    dept = sc.nextLine();
                    System.out.print("사원 연봉 : ");
                    salary = Integer.parseInt(sc.nextLine());
                    System.out.print("보너스 율 : ");
                    bonus = Double.parseDouble(sc.nextLine());
                    break;
                }
                if (yesOrNo.equalsIgnoreCase("n")) {
                    break;
                }
                System.out.println("Yes or No");
            }
            if (dept != null && salary != 0 && bonus != 0) {
                employeeController.add(empNo, name, gender, phone, dept, salary, bonus);
            } else {
                employeeController.add(empNo, name, gender, phone);
            }
            new EmployeeMenu();

        } catch (NumberFormatException e) {
            System.out.println("입력 방식이 잘못 됐습니다. 다시 작성해주세요.");
            insertEmp();
        }
    }

    public void updateEmp() {

    }

    public void deleteEmp() {

    }

    public void printEmp() {

    }

}
