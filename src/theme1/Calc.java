package theme1;

public class Calc {
    public static void main(String[] args) {
        int i = 13;
        float a = 21;
        double rez;
        rez = 2*(a+5)/i;
        System.out.println(rez);
        rez *= 10;
        System.out.println(rez);
        System.out.println("Result= "+(rez+10));
        rez += 10;
        System.out.println("Result= "+rez + " equals 50? "+(rez == 50));
    }
}
