package theme3;

public class ArrayTest {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        for (int i:array)
            System.out.print(i+" ");
        System.out.println();

        for (int i = 0;i<array.length/2;i++) {
            int tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]=tmp;
        }

        for (int i:array)
            System.out.print(i+" ");
    }
}
