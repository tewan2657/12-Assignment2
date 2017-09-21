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
    String sbinary = "";
    public String binaryConvert(int n) {
     //base case
      if(n < 2){
        sbinary = "" + n;
        return sbinary;
    }

        //base case
        if (n != 0) {
            binaryConvert(n / 2);
            sbinary += n % 2;
            

        }
        return sbinary;
        
    }

    public static void main(String[] args) {
        // TESTING METHOD ABOVE
        Problem5 test = new Problem5();

       String a = test.binaryConvert(1000);
        System.out.println(a);
    }
}
