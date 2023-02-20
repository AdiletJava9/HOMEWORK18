public class Home implements Family {
    private  Person family [];

    public Home(Person[] family) {
        this.family = family;
    }

    public Home() {

    }


    @Override
    public void payment() {
        System.out.println("Kom uslugi na 5cheloveka 500som");
    }
}
