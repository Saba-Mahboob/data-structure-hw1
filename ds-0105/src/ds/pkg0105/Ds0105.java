/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg0105;

import java.util.*;

/**
 *
 * @author Emertat
 */
public class Ds0105 {

    /**
     * @param args the command line arguments
     */
    static private int[] s(int[] a, int n, int k) {
        int i = 0;
        if (k < n - 1) {
            i = 0;
            for (; i < n - 1; i++) {
                a[i] += a[i + 1];
            }
            a[i - k] = 0;
            return s(a, n, k + 1);
        }

        return (a);

    }

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = {1, 1,1};
        int m[] = (s(a, a.length, 0));
        System.out.println(Arrays.toString(m));

    }

}
