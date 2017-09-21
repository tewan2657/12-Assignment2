/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    String hold = "";
    public String convert(int n , int b){
        
        //base case
        if(b < 2 || b > 16 || n<=0){
         return "False";   
        }
        //if n is bigger than 0 -> proced with statement
        if(n>0){
      
             
         //find the remainder by n%b
            convert(n/b,b);
            hold+= n % b;
            
        }
        
        return hold;
    }
    
    public static void main(String[] args) {
        //Testing method above
        Problem6 test = new Problem6();
        
        String a = test.convert(1000,16);
        System.out.println(a);
        
      
             
     
        
    }
}
