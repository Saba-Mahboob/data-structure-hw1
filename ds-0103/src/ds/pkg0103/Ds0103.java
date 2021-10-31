package ds.pkg0103;

import java.util.*;

public class Ds0103 {

    static int bmm(int a, int b) {
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b != 0) {
            return bmm(b, a % b);
        }
        return a;

    }
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(bmm(a,b));

    }

}
