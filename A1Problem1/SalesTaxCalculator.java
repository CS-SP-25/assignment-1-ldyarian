package A1Problem1;
//handle user input and tax calculation

public class SalesTaxCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("java SalesTaxCalculator <State> <SaleAmount>");
            return;
        }

        String stateName = args[0];
        double saleAmount;

        try {
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid sale amount format.");
            return;
        }

        State state;

        // dynamic state
        if (stateName.equalsIgnoreCase("Indiana")) {
            state = new Indiana();
        } else if (stateName.equalsIgnoreCase("Alaska")) {
            state = new Alaska();
        } else if (stateName.equalsIgnoreCase("Hawaii")) {
            state = new Hawaii();
        } else {
            System.out.println("State not supported. Please use 'Indiana', 'Alaska', or 'Hawaii'.");
            return;
        }

        // tax behavior dynamic AFTER identifying state
        if (state instanceof Indiana) {
            state.setTaxBehavior(new SevenPercent());
        } else if (state instanceof Alaska) {
            state.setTaxBehavior(new NoTax());
        } else if (state instanceof Hawaii) {
            state.setTaxBehavior(new FourPointFivePercent());
        }

        // display
        state.showTax(saleAmount);
    }
}