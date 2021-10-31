/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg0101;

/**
 *
 * @author Emertat
 */
import java.util.*;

public class Ds0101 {

    /**
     * @param args the command line arguments
     */
    static int xpown(int x, int n, int i,int sum) {
     if(i<n){
         sum*=x;
         return xpown(x,n,i+1,sum);}
         else
         return sum;
         
     
    }
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("x=");
        int x = input.nextInt();
        System.out.print("n=");
        int n = input.nextInt();
       System.out.println( xpown(x,n,0,1));
   

    }

}
