package A1Problem1;
//SalesTaxBehavior for 4.5% tax (Hawaii)

public class FourPointFivePercent implements SalesTaxBehavior {
     
    public double compute(Double value) {
        return value * 0.045;
    }
}
