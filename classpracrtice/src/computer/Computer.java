package computer;

public class Computer {
    public String[] osType = {"원도7", "애플 OS X", "안드로이드"};
    int i, a;

    public Computer(int a, int i) {
        this.a = a;
        this.i = i;
    }

    public void print(){
        System.out.println("운영체제 " + osType[a] + " 메모리 " + i );
    }

}
