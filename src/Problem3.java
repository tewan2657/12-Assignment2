
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static int triangle(int n) {
        int counter =0;
        //base case
        if(n == 1|| n==0){
         return n;   
        }else if (n>=2){
        counter = 2; 
        }
            
      return n;  
        
    
    }

    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in);
           
        //Ask the user to input a number 
        System.out.println("Input a number");
        int n = input.nextInt();
        
        int trap = triangle(n);
        System.out.println("The triangle is made up of " + trap + " block(s)");
    }
}
