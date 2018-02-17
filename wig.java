import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class wig
{
   	//clients contact
   protected String firstName;
   protected String lastName;
   protected int mobileNumber;

   	//fields
   protected double circumference;
   protected double forehead2Nape;
   protected double ear2Forehead;
   protected double ear2Overtop;
   protected double temple2Roundback;
   protected double napeOfNeck;

   public wig(String x)
   {
   
   }

   public void intro()
   {
      JOptionPane.showMessageDialog(null,"Welcome to How to Make a WIG tutorial !!!!!");
      JOptionPane.showMessageDialog(null,"\n\t This is an indepth step by step instruction on how to construct a proper wig ");
      JOptionPane.showMessageDialog(null,"\n\n The following items would be required for this tutorial: \n Mannequin head \n Mannequin Stand \n Stainless Tpins \n Sewing Needle \n Wig Cap \n Hair extensions \n Needle Threader \n Sewing Tape Measure \n Weave Brush \n\n\n\tTake a minute to put together all the items required then click the okay button");
      JOptionPane.showMessageDialog(null,"\n\n As you progress, you would be asked a few questions and would be required to press the enter button/ click OK after on completing each step successfully");
      JOptionPane.showMessageDialog(null,"\nThis would enable you to unlock the next step to completing this tutorial");
      JOptionPane.showMessageDialog(null,"\n\n Thanks \n\n\tHarbie Mohair \n");
   }

   public void details()
   {
      String input;
   
      JOptionPane.showMessageDialog(null,"Next, you will be asked to input some details about to your client");
   
   		//request first name 
      this.firstName = JOptionPane.showInputDialog("Enter clients firstName : ");
      //console.nextLine();
   
      this.lastName = JOptionPane.showInputDialog("Enter clients lastName : ");
      //console.nextLine();
   
      input = JOptionPane.showInputDialog("Enter clients mobileNumber : ");
      this.mobileNumber = Integer.parseInt(input);   
   
      //get clients measurement 
      input = JOptionPane.showInputDialog("Measure Circumference of the head: ");
      this.circumference = Double.parseDouble(input);
   
      input = JOptionPane.showInputDialog("Measure Forehead to nape of the neck: ");
      this.forehead2Nape = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Measure Ear to ear across forehead: ");
      this.ear2Forehead = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Measure Ear to ear over top: ");
      this.ear2Overtop = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Measure Temple to temple round back: ");
      this.temple2Roundback = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Measure Nape of neck: ");
      this.napeOfNeck = Double.parseDouble(input);
   }
   
   //print out the measurement taken
   public String toString ()
   {  
      return "Client Details:\nName: "+ firstName + " " + lastName + "\nMobile Number : " + mobileNumber + 
            "\nCircumference: " + circumference + "\nForehead to Nape of the Neck: "+ forehead2Nape + 
         	"\nEar to Ear Across Forehead: " + ear2Forehead + " \nEar to Ear Overtop: " + ear2Overtop + 
         	"\nTemple to Temple Roundback: "+ temple2Roundback+ "\nNape of Neck: "+ napeOfNeck;
   }

   protected void stitching ()
   {
   		//call the array iin which the steps have being stored
      System.out.println();
   }

   public void contact()
   {
      System.out.println("");
   }

   /*read from the file 
   if the string is the delimiter // .equals(//)
   break or exit()
   else 
      store string in an array
*/
   public List<String> stepsToWigMaking () throws FileNotFoundException, IOException
   {
       //create an array in which each string will be stored
      List<String> stepsArray = new ArrayList<String>();
   
       //Open the file to be read from
      File file = new File("Wig Making Algorithm.txt");
   
       //confirm that file exists
      if (file.exists())
      {
         //using the scanner object to read content of the file
         Scanner read = new Scanner(file);

         //while file is not empty, do the following 
         while(read.hasNext())
         {
            //read first line of the file and Store it in a String variable
            String content = read.nextLine();
         
            /*before assigning each string to an arraylist, 
            confirm that content is not the delimiter "//"
            */
            if(content.equals("//"))
            {
               //go back to the while 
               continue;
            }
            else
            {
               //store content in the array
               stepsArray.add(content);
            }
         }
         //always remember to close the file
         read.close();
      
      }
      return stepsArray;
   }
  
  
  //ALTERNATIVE
   // public String[] instructions()
//    {
//       String[] step = new String[24];
//    
//       step[0] = "Place the mannequin head on a stand and secure each joint properly.";
//       step[1] = "Place the cap on the mannequin head using the clients’ measurements as determined above.";
//       step[2] = "Secure the cap on the mannequin head using wig stainless T pins.";
//       step[3] = "Take the needle threader in one hand, and the needle in your other hand then Insert the wire loop on the needle threader through the eye of the needle.";
//       step[4] = "Hold both the needle threader and needle in one hand, while keeping the loop of wire on the needle threader through the eye of the needle.";
//       step[5] = "Insert your thread through the loop of wire on the needle threader.";
//       step[6] = "Pull the thread through the loop so that you have a tail of least a few inches in length.";
//       step[7] = "Fold the tail over to meet the other thread.";
//       step[8] = "Hold both lengths of thread together.";
//       step[9] = "While holding both threads, pull the wire loop of the needle threader out of the eye of the needle.";
//       step[10] = "Once the wire loop is out of the eye, release the tail end of the thread.";
//       step[11] = "Pull the needle threader off the thread. This will bring the tail end through.";
//       step[12] = "Pull the tail end of the thread until both threads are equal in length.";
//       step[13] = "Holding both lengths of thread together, tie a knot near the end and pull it tight.";
//       step[14] = "Select the weave with the longest length.";
//       step[15] = "Starting from the nape of the neck, begin to sew using the following blanket stitching method;";
//       step[16] = "Start by sending your needle down through the edge of the hair bundle then through the wig cap.";
//       step[17] = "Poke your needle up from the wig cap again, so that the needle comes out the top of the hair bundle at the same spot where you started, creating a loop around the edge.";
//       step[18] = "Send your needle under the loop stitch you just made. To do this, poke the needle under the stitch going in the sewing direction and right at the edge of the hair.";
//       step[19] = "This gets your thread anchored and hair extension secured, but it is not a true first stitch.";
//       step[20] = "Now continue each stitch like this and you are on your way! ";
//       step[21] = "Now you know how to do blanket stitch!!!!!!!";
//       step[22] = "The spacing for the first bundle of hair is two fingers but as you approach right after the ears, the spacing should get closer to just one finger.";
//       step[23] = "Continue sewing on the cap from one end to the other until you reach the front of the wig.";
//    
//    
//       return step;
//    
//    }
}

