/**
 * Original program contains errors.
 * Add your name to this comment.
 @Jorge Soto-Ventura
 * Document the errors you found in comments.  You should find at
 * least 5 errors.  Some errors are compiler errors and some are
 * logic errors that you'll find by executing/testing the program.
 * 
 * Comment out the original code and write the corrected code.  In
 * comments, explain what you did to fix the error.
 */
public class Assign1 {

    public static void main(String[] args) {
       int firstI, secondI;
       double firstD, secondD;

        //int firstI = 5;  remove the int because it has already been defined previously. Remove the int to fix. 
        firstI = 5;       
        secondI = 10;
        firstD = 3.12;
        secondD = 7.4;
        System.out.println("When you add " + firstI + " and " + secondI); 

        //System.out.println("You get: " + (firstD + secondI)); Had firstD instead of firstI. Fixed by changing first variable.

        System.out.println("You get: " + (firstI + secondI));

        //firstD = 3.12;  Need to intialize this variable eariler. Fixed by putting variable above first statement.

        System.out.println("When you add " + firstD + " and " + secondD);

        //secondD = 7.4;   Need to intialize this variable eariler. Fixed by putting variable above first statement.

        //System.out.println("You get: " + firstD + secondD); Parentheses forgotten around firstD and secondD leading to inaccurate number.
        //Fixed by adding parentheses.
        System.out.println("You get: " + (firstD + secondD));

	    String original = "walrus";
	    char first = original.charAt(0);
	    char second = original.charAt(2);
	    char third = original.charAt(4);
        
        //System.out.println(first + second + third); Would not work because the spaces were not there which cause the system to run asvcii numbers instead. Fix by adding spaces.
	    System.out.println(first + " " + second + " " + third);
	
    }
}
