import java.util.Scanner;

/** This program find the extension of any file given by the user.
 *@jorgesoto-ventura
 */
public class FileExtensionFinder {

  public static void main(String[]args) {


    /* TODO: When you're ready to get user input, 
    put these next four lines of code (uncommented) in your main method. */ 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your filename: ");
    String filename = sc.nextLine();
    int period = filename.lastIndexOf("."); //find the last index of a given value. This one being "."
    String subtxt = filename.substring(period); //lists out all inputs after a given index.
    System.out.print("Your file is a(n)" + subtxt + "."); //prints what kind of file it is.


    

    sc.close();
  }
}
