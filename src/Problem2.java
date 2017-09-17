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
    int sum = 0;
    int rt = 0;
    int sumb = 0;

    public int digitalRoot(int n) {

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        while(sum !=0){
            sumb += sum % 10;
            sum/=10;
        }
        return sumb;

    }

    public static void main(String[] args) {
        //Testing Method Above
        Problem2 test = new Problem2();

        int a = test.digitalRoot(1237);
        System.out.println("The Digital root is " );
        System.out.println(a);

    }
}
