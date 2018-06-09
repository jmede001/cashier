package cashier;

public class Cashier 

{
    private static final double DOLLAR     =1.00;
    private static final double QUARTER    =0.25;
    private static final double DIME       =0.10;
    private static final double NICKEL     =0.05;
    private static final double PENNY      =0.01;
    
    private String result;
    private static int total_items;
    private static double total_purchased,average;
    private static double ChangeDue;
    private int noOfDollar;
    private int noOfQuarter;
    private int noOfDime;
    private int noOfNickel;
    private int noOfPenny;
    private String ItemName;
    private int noOfItem;
    private double ItemPrice;
    private double Payment;
    private double amount;
    


    
    public String getName()
    {
        return ItemName;
    }
    public int getNoOfItem()
    {
        return noOfItem;
    }
    public double getPrice()
    {
        return ItemPrice;
    }
    public double getPayment()
    {
       
        return Payment;
    }
    public void add(String word,double price)
    {
        ItemName=String.format(word,"...$",price);
        ItemName=word;
        ItemPrice=price;
        noOfItem++;
        total_purchased+=ItemPrice;
        result+=""+noOfItem+"\t\t\t"+ItemPrice+"\n";
    }
    
    
public void average()
{
    average=total_purchased/total_items;
}
    
    public void calculate()
    {
        total_items=+noOfItem;
        Payment=Payment+amount;
        ChangeDue=(double)(total_purchased-Payment);
        noOfDollar=(int)(ChangeDue%DOLLAR);
        noOfQuarter=(int)(ChangeDue%QUARTER);
        noOfDime=(int)(ChangeDue%DIME);
        noOfNickel=(int)(ChangeDue%NICKEL);
        noOfPenny=(int)(ChangeDue%PENNY);
    }
    
    public static int getTotalItems()
    {
        return total_items;
    }
    public static double getTotalAmount()
    {
        return total_purchased;
    }
    public static double getAverage()
    {
        return average;
    }
    public static double getChange()
    {
        return ChangeDue;
    }
        public int getDollarAmnt()
    {
        return noOfDollar;
    }
    public int getQuarterAmnt()
    {
        return noOfQuarter;
    }
    public int getDimeAmnt()
    {
        return noOfDime;
    }
    public int getNickelAmnt()
    {
        return noOfNickel;
    }
    public int getPennyAmnt()
    {
        return noOfPenny;
    }
}

