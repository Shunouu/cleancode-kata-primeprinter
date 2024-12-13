public class Exercise3 {

    public double calculate(double amount, int type, int years) {
        double disc = (years > 5) ? 0.05 : years / 100.0;

        switch (type) {
            case 1:
                return amount;

            case 2:
                return (amount - (0.1 * amount)) - disc * (amount - (0.1 * amount));

            case 3:
                return (0.7 * amount) - disc * (0.7 * amount);

            case 4:
                return (amount - (0.5 * amount)) - disc * (amount - (0.5 * amount));

            default:
                return 0;
        }
    }
}