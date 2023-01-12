import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalcBigDecimal {

	public void calc(String amountString, String discountPercentString) {
		BigDecimal amount = new BigDecimal(amountString);
		BigDecimal discountPercent = new BigDecimal(discountPercentString);
		BigDecimal discount = amount.multiply(discountPercent);
		discount = discount.setScale(2, RoundingMode.HALF_UP);
		BigDecimal total = amount.subtract(discount);
		total = total.setScale(2, RoundingMode.HALF_UP);
		BigDecimal taxPercent = new BigDecimal("0.05");
		BigDecimal tax = total.multiply(taxPercent);
		tax = tax.setScale(2, RoundingMode.HALF_UP);
		BigDecimal taxedTotal = total.add(tax).setScale(2, RoundingMode.HALF_UP);
		System.out.println("Calc using BigDecimal");
		System.out.println("Amount: " + amount);
		System.out.println("Discount: " + discount);
		System.out.println("Total: " + total);
		System.out.println("Tax: " + tax);
		System.out.println("Tax and Total: " + taxedTotal);
		System.out.println("");
	}
}
