
import bank.Account;
import circle.Circle;
import circle.Cylinder;
import computer.Computer;
import ractangle.Racntangle;
import salaryMan.SalaryMan;
import student.Student;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //이름,학번 출력
        Student student = new Student();
        student.setName("dbwp");
        student.setPersonalNUm(1564);
        student.print();

        //원통 부피 반환
        Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
        /*
        cd
        Circle circle = new Circle(2.8);
        double height = 5.6;
         */
        System.out.println(cd.getVolume());

        //연봉출력
        System.out.println(new SalaryMan().getAnnualGross());
        System.out.println(new SalaryMan(2_000_000).getAnnualGross());


        //입금출금
        Account account = new Account();
        account.setOwner("aaa");
        account.setBalance(1000);
        System.out.println();
        System.out.println(account.deposit(1000));
        System.out.println(account.withDraw(1000));
        System.out.println(account.withDraw(3000));

        //사각형
        Racntangle rc = new Racntangle(3.15, 8.18);
        System.out.println("면적: " + rc.getArea());
        System.out.println("둘레: " + rc.getCircumference());

        //컴퓨터

        System.out.println();
        Computer pc = new Computer(0,16);
        Computer apple = new Computer(1, 32);
        Computer androiad = new Computer(2, 16);
        pc.print();
        apple.print();
        androiad.print();

    }
}