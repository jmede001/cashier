package cashier;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.util.Scanner;

class GetData 

        
{
   
   public static String getWord(String c)         
   {
       return JOptionPane.showInputDialog(c);
   }
   public static double getDouble(String c)
   {
       return Double.parseDouble(getWord(c));
   }

}