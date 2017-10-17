package lastex.domain;

public class Technicien extends Employee {

    private final double units;

    public Technicien(String firstname, String lastname, int age, String entryYear, double units) {
        super(firstname, lastname, age, entryYear);
        this.units = units;
    }

    @Override
    public double calculerSalaire() {
        double UNIT_PRICE = 5;
        return (double) units * UNIT_PRICE;
    }

    @Override
    public String getPosition() {
        return "Le technicien";
    }
}
