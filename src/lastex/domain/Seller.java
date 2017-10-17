package lastex.domain;

public abstract class Seller extends Employee {

    private double turnover;

    public Seller(String firstname, String lastname, int age, String entryYear, double turnover) {
        super(firstname, lastname, age, entryYear);
        this.turnover = turnover;
    }

    @Override
    public double calculerSalaire() {
        double INCOME_RATE = 0.2f;
        return INCOME_RATE * turnover + getBonus();
    }

    protected abstract double getBonus();
}
