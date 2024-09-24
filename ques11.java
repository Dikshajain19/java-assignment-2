import java.util.Scanner;
class Num {
    protected int number;

    public Num(int number) {
        this.number = number;
    }

    public void shownum() {
        System.out.println("Number: " + number);
    }
}
class HexNum extends Num {

    public HexNum(int number) {
        super(number);
    }


    public void shownum() {
        super.shownum();
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}
public class ques11 {
    public static void main(String[] args) {
        Num num = new Num(255);
        HexNum hexNum = new HexNum(255);

        System.out.println("Base class Num:");
        num.shownum();

        System.out.println("\nDerived class HexNum:");
        hexNum.shownum();
    }
}
