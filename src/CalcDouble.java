import java.math.RoundingMode;
import java.text.NumberFormat;  

public class CalcDouble {   

  public void calc(double amount, double discountRate)
  { 
    double discount = amount * discountRate;      
    double total = amount - discount;      
    double tax = total * 0.05;      
    double taxedTotal = tax + total;      
    NumberFormat money = NumberFormat.getCurrencyInstance();
    money.setRoundingMode(RoundingMode.HALF_UP);
    System.out.println("Calc using Double");
    System.out.println("Amount: "+ money.format(amount)+" : "+amount);        
    System.out.println("Discount: " + money.format(discount)+" : "+discount);       
    System.out.println("Total: " + money.format(total)+" : "+total);       
    System.out.println("Tax: " + money.format(tax)+" : "+tax);       
    System.out.println("Tax and Total: " + money.format(taxedTotal)+" : "+taxedTotal);   
    System.out.println("");
  }  
}

