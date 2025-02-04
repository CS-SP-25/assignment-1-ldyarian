package A1Problem1;
//SalesTaxBehavior for 7% tax (Indiana)

public class SevenPercent implements SalesTaxBehavior {
    public double compute(Double value) {
        return value * 0.07; 
    }
}
