package cashier;
        
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;
import java.util.ArrayList;

class TestCashier
{
public static void main(String[] arg)
{



Cashier c = new Cashier();

String word = GetData.getWord("Enter name of item");
double price = GetData.getDouble("Enter price of item");
c.add(word, price);

word = GetData.getWord("Enter name of item");
price = GetData.getDouble("Enter price of item");
c.add(word, price);

word = GetData.getWord("Enter name of item");
price = GetData.getDouble("Enter price of item");
c.add(word, price);

// Add a two more entries of your own

// Now average the price of the items
c.average();

// Make payment
double amount = GetData.getDouble("Enter amount of money for payment");

c.getPayment(); // Twenty dollars were tendered

c.getChange();

generateReceipt(c);

}
static void generateReceipt(Cashier c)
{

String r = "ABC Groceries Shop \n";

r = r + "Welcome – thanks for stopping, \n";

DateFormat df = DateFormat.getDateInstance();

Date d = new Date();

NumberFormat f = NumberFormat.getCurrencyInstance();

r = r + "Today is " + df.format(d) + "\n";

r = r + c.getName() + "..... " + f.format(c.getPrice()) + "\n" + c.getName() + "..... " + f.format(c.getPrice()) + "\n" + c.getName() + "....." + f.format(c.getPrice()) + "\n";

r = r + "____________________" + "\n";

r = r + "Total " + f.format(c.getTotalAmount()) + "\n\n";

r = r + "Amount tendered " + f.format(c.getPayment()) + "\n";

r = r + "The change is " + f.format(c.getChange()) + "\n";

r = r + "There were " + c.getTotalItems() + " items" + "\n";
r = r + "The average price is " + f.format(c.getAverage()) + "\n\n";

r = r + "The change includes :" + "\n";

r = r + c.getDollarAmnt() + " dollars" + "\n" + c.getQuarterAmnt()+ " quarters" + "\n" + c.getDimeAmnt()+ " dimes" + "\n" + c.getNickelAmnt()+ " nickels" + "\n" + c.getPennyAmnt() + " cents";

JTextArea text = new JTextArea(r,15, 25);

JScrollPane pane = new JScrollPane(text);

JOptionPane.showMessageDialog(null,pane, "Your bill", JOptionPane.INFORMATION_MESSAGE);

}
}