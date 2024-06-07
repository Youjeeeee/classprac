
import circle.Circle;
import circle.Cylinder;
import salaryMan.SalaryMan;
import student.Student;

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


        System.out.println(new SalaryMan().getAnnualGross());

        System.out.println(new SalaryMan(2_000_000).getAnnualGross());


    }
}