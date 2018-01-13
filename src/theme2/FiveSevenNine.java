package theme2;

public class FiveSevenNine {
    public static void main(String[] args) {
        for (int i = 1;i<=20;i++){
            if(i%5 == 0)
                System.out.println(i+" / five = "+(i/5));
            if(i%7 == 0)
                System.out.println(i+" / seven = "+(i/7));
            if(i%9 == 0)
                System.out.println(i+" / nine = "+(i/9));
        }
    }
}
