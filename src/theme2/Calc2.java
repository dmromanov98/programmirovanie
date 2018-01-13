package theme2;

public class Calc2 {
    public static void main(String[] args) {
        int n = 10;
        int factorial=1;
        double result=1;
        for (int i = 1; i<=n;i++){
            factorial *= i;
            result *= ((1/(double)factorial) + (5*(i*i*i)));
        }
        System.out.println(result);
    }
}