import java.io.*;
import java.util.*;

public class jawn
{
   public static void main(String[] args) //throws FileNotFoundException, IOException
   {
      //wig steps = new wig("Wig Making Algorithm.txt");
      
     //java: An introduction to problem solving, 7th edition. pg 762 
      String fileName = "Wig Making Algorithm.txt";
      //System.out.println("The file " + fileName + " contains the following lines:\n");
      
      List<String[]> listOfSteps = new ArrayList<String[]>();
                           
      try
      {
         Scanner inputStream = new Scanner(new FileReader(fileName));
         
         //Read and skip the header line of the file
         String line = inputStream.nextLine();
      
         //Repeat while we have not reached the end of the file
         while(inputStream.hasNextLine())
         {
            //Read an entire line (one record) from the file as a String
            line = inputStream.nextLine();
            
            /*The method splits the string around matches of delimiter and 
            returns an array of the strings separated by delimiter. 
            delimiter is set as //
            */
            String[] steps = line.split("//");
            
            /*initialize string array named step to the same size as delimit array
            Step array will be used to instruct the user on what to do */
            //String[] move = steps.clone();            //could aslo be new String[delimit.length];
            
            for(int i = 0; i < steps.length; i++)
            {
               //String move = steps[i];
               System.out.println("steps: ["+i+"]" + steps[i] + "\n");
               
               listOfSteps.add(steps);
            }
         }
         //System.out.println(steps[0] + "\n");
         System.out.println("list :" + listOfSteps.get(0) + "\n");
         
         inputStream.close();
      
      }catch(FileNotFoundException e)
      {
         System.out.println("Error opening the file " + fileName);
      }
   
      for (int i = 0; i < listOfSteps.size(); i++)
      {
         //Step[i] = delimit[i];
         //System.out.println(listOfSteps.get(1) + "\n");
      }
   }
}