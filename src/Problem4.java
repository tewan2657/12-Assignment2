
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adars
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static String hailstone(int n) {
   //display the hailstone pattern starting with n
        String o = "" + n;
        
        //keep going until n<=0
        if (n != 1) {
            //base case
            //if n is an even number
            if (n % 2 == 0) {
                return o + "," + hailstone(n / 2);
            } else {
                //if n is not an even number    
                return o  + "," + hailstone((3 * n) + 1);
            }

        } else {
            return o;
        }

    }

    public static void main(String[] args) {
        //create a scanner 
        Scanner input = new Scanner(System.in);
        
        //ask the user to enter a number 
        System.out.println("Enter a Number: ");
        int n = input.nextInt();
        
       

        //Print the hailstone pattern for the number given by user 
        String a = hailstone(n);
        System.out.println("Hailstone Pattern of the number " + n + " is: ");
        System.out.println(a);

    }
}
