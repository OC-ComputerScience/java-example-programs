
public class MoneyTest {

  public static void main(String[] args) {
    new CalcDouble().calc(100.05,.10);
    new CalcBigDecimal().calc("100.05", ".10");
    
    new CalcDouble().calc(.7,0.0);
    new CalcBigDecimal().calc(".7", "0.0");

  }

}
