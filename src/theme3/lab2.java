package theme3;

public class lab2 {
    public static void main(String[] args) {
        int [][] a = {{11,12,13,14,15},
                {21,22,23,24,25},
                {31,32,33,34,35},
                {41,42,43,44,45},
                {51,52,53,54,55}};

        arrout(a);

        for (int i = 0 ; i < a.length;i++)
            a[i][i]=0;

        System.out.println();
        arrout(a);

    }

    public static void arrout(int[][] a){
        for (int i = 0 ; i < a.length;i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
