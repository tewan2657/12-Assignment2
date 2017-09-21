
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindome(String s){
        //base case
        if(s.length()== 0 || s.length()==1){
            return true;
    }
        //if the first letter of the word is equal to the last letter of the word
        if(s.charAt(0) == s.charAt(s.length()-1)){
          
            //To see if the letter on each side matches - r(a)cec(a)r - are they the same??
         return isPalindome(s.substring(1, s.length()-1));
        }
   return false;
    }
            
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        //Ask the user to input a word
        System.out.println("Enter a word to see if the word is a palindrome.");
        String s = input.nextLine();
        
        //if it is a palindrome, let the user know.
        if(isPalindome(s)){
            System.out.println(s + " is a palindome");   
        }else{
            //if its not a palindrome, tell the user its not a palindrome.
            System.out.println(s + " is not a palindome");
        }
              
    }
}
