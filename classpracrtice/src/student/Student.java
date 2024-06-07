package student;
/*제 1 - 다음을 만족하는 Student 클래스를 작성하시오.

· String형의 학과와 정수형의 학번을 필드로 선언

· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력*/

import java.util.Scanner;
public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalNUm() {
        return personalNUm;
    }

    public void setPersonalNUm(int personalNUm) {
        this.personalNUm = personalNUm;
    }

    private String name;
    private int personalNUm;

    public Student() {
        this.name = name;
        this.personalNUm = personalNUm;
    }

    public void print(){
        System.out.println(getName()+ getPersonalNUm());
    }


}