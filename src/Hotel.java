public class Hotel implements Family {
    private  Person family [];

    public Hotel(Person[] family) {
        this.family = family;
    }

    @Override
    public void payment() {
        System.out.println("2 adamga  1 aiga  20000som ");
    }
}
