/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adars
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public int binaryConvert(int n) {
        //variable
        int binary = 0;

        //base case
        if (n >= 1) {
            binaryConvert(n / 2);
            binary = n % 2;
            System.out.print(binary);



        }
        return binary;
        
    }

    public static void main(String[] args) {
        // TESTING METHOD ABOVE
        Problem5 test = new Problem5();

       int a = test.binaryConvert(45);
        System.out.println(a);
    }
}
