
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
    public static int digitalSum(int n) {
        //base Case
        // checking if the number is a single digit

        if (n / 10 == 0) {
            return n;
        } else {
            for (int i = 0; i < n; i++) {
                i = n / 10;
                n = i + n % 10;


            }
            return n;
        }

    }

    public static void main(String[] args) {
        // Create a Scanner 
        Scanner input = new Scanner(System.in);

        //Ask the user to input a number 
        System.out.println("Input a number");
        int n = input.nextInt();

        int sum = digitalSum(n);
        System.out.println(sum);

    }
}
