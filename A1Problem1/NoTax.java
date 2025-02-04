package A1Problem1;
// SalesTaxBehavior for no tax (Alaska)

public class NoTax implements SalesTaxBehavior {
    public double compute(Double value) {
        return 0.0; 
    }
}
