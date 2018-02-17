import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class jawn
{
   public static void main(String[] args) throws FileNotFoundException, IOException
   {
      wig wigJawn = new wig("Wig Making Algorithm.txt");
      
      //fields
      String input;
   
      wigJawn.intro();
      
      wigJawn.details();

      List<String> listOfSteps = new ArrayList<String>();

      listOfSteps = wigJawn.stepsToWigMaking();
      
      //print out the saved list --- this is not working pls
      for(String content : listOfSteps)
      {
         System.out.println(content);
      }

      //String[] steps = wigJawn.instructions();
      //JOptionPane.showMessageDialog(null,steps[0]);

      /*this statement will create a new file named Clients.txt is it dosent exist
      also, allow to append to files when needed
     */
     FileWriter file = new FileWriter("Clients.txt");

     /*to write date to the file Clients.txt, a printWriter object is used
      write clients details to a file for future reference */
    PrintWriter outputFile = new PrintWriter(file);

    //all outputs to the file will be appended to pre-existing contents in the file
   outputFile.println(wigJawn.toString());

     outputFile.close();
   }
}