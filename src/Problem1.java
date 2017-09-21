
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    int sum = 0;
    public int digitalSum(int n) {

        //base Case
        // checking if the number is less than or equal to zero 
        if (n <= 0) {
            return sum;
        } else {
            //find remainder
            sum += (n % 10);
            //once remainder has been found, move to the next digit to the left
            digitalSum(n / 10);

            return sum;
        }
    }

    public static void main(String[] args) {
        // Testing Method Above
        Problem1 test = new Problem1();

        //Print
        int a = test.digitalSum(675);
        System.out.println("Sum of Digits: " + a);


    }
}
