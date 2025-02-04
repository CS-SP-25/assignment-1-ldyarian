package A1Problem1;
// abstract state class

public abstract class State {
    protected String name;
    protected SalesTaxBehavior taxBehavior; //updated for a1

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // dynamic tax behavior
    public void setTaxBehavior(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
    }

    public void showTax(double value) {
        if (taxBehavior == null) {
            System.out.println("Error: Tax behavior is not set.");
            return;
        }
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, name, tax);
    }
}