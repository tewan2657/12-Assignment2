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
    String hold1 = "";
    
    public String convert(int n, int b) { 
     
     //base case
     if(b< 2 || b > 16 || n <=0){
         return "False";
    }
   //if n is bigger than 0 -> proced with statement
    if(n>0){
         //find the remainder by n%b
            convert(n / b, b);
             hold1 =Integer.toString(n%b);
             
    
       //If a number between 10-15 appears, convert with a letter.
        switch (hold1) 
        {
            case "10":
                hold1 = "A";
                break;
            case "11":
                hold1 = "B";
                break;

            case "12":
                hold1 = "C";
                break;

            case "13":
                hold1 = "D";
                break;

            case "14":
                hold1 = "E";
                break;

            case "15":
                hold1 = "F";
                break;

            default:
                hold1 = "" + hold1;
                break;
        
        }
        
       hold += hold1;
      
    }
        return hold ;
    
    }

public static void main(String[] args) {
        //Testing method above
        Problem6 test = new Problem6();
        
        String a = test.convert(1000,2);
        System.out.println(a);
        
      
             
     
        
    }
}
