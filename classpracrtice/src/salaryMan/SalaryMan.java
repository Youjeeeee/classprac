package salaryMan;

public class SalaryMan {

    int salary = 100000;

    public SalaryMan() {
    }

    public SalaryMan(int salary) {
        this.salary = salary;
    }



    public int getAnnualGross(){
    int year= this.salary*12+(this.salary *5);
    return year;

    }


}
