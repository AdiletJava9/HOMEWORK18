public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adilet", "Islabek uulu", 22);
        Person person1 = new Person("Aktilek", "Islabek uulu", 19);
        Person person2 = new Person("Kairat", "Islabek uulu", 12);
        Person person3 = new Person("Aibiyke", "Ibrahimova", 9);
        Person person4 = new Person("Islambek", "Ibrahim uulu", 44);
        Person person5 = new Person("Ainura", "Isakova", 40);
        Person[] people = {person, person1, person2, person3, person4};
        Home home = new Home(people);
        for (Person home1 : people) {
            System.out.println(home1);
        }
        System.out.println("Jashagan adamdyn sany:" + people.length);
        home.payment();
        System.out.println("---------------------------------------------------");
        Person[] people1 = {person, person5, person3};
        Apartment apartment = new Apartment(people1);
        for (Person apartment1 : people1) {
            System.out.println(apartment1);
        }
        System.out.println("Jashagan adamdyn sany:" + people1.length);
        apartment.payment();
        System.out.println("------------------------------------------------------");
        Person[] people2 = {person5, person4};
        Hotel hotel = new Hotel(people2);
        for (Person hotel1 : people2) {
            System.out.println(hotel1);
        }
        System.out.println("Jashagan adamdyn sany:" + people2.length);
        hotel.payment();

    }
}