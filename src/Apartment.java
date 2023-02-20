public class Apartment implements Family {
    private  Person family [];

    public Apartment(Person[] family) {
        this.family = family;
    }

    @Override
    public void payment() {
        System.out.println("Kvarplata+Kom usluga 3 adamga 15000som");
    }
}
