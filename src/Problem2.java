/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    //intialize variables
    int sum = 0;
    int rt = 0;
    int sumb = 0;

    public int digitalRoot(int n) { 
      //find the sum of digits of n 
        while (n != 0) {
            sum += n % 10;
            n /= 10;   
        }
        //find the sum of digtis of "sum"
        //Keep going until sumb does not become a single digit number
        while(sum !=0){
            sumb += sum % 10;
            sum/=10;
        }
        //return sumb which is the Digital root 
        return sumb;

    }

    public static void main(String[] args) {
        //Testing Method Above
        Problem2 test = new Problem2();

        //Print
        int a = test.digitalRoot(12378);
        System.out.println("The Digital root is " );
        System.out.println(a);

    }
}
