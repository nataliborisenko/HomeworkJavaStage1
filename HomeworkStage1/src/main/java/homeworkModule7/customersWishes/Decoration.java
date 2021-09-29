package homeworkModule7.customersWishes;

public enum Decoration {
    PACKAGING(2.25), ARTIFICIAL_TWIG(5.05), DECORATIVE_RIBBON(1.80);
    private double price;

    Decoration(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Decoration{" +
                "price=" + price +
                "} " + super.toString();
    }
}

