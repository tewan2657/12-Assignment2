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
    int count = 0;
    
    public int binaryConvert(int n){
        while(n!=0){
         if(n % 2 == 0){
          count += n/2;  
          
         }
         
        }
        
     return count;   
    }
    
    
    
    
    public static void main(String[] args) {
        // TESTING METHOD ABOVE
        Problem5 test = new Problem5();
        
        int a = test.binaryConvert(46);
        System.out.println(a);
    }
    
}
