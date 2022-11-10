public class User {

    protected int zipcode;
    protected int aptnumber;
    protected String name;
    protected String surname;
    protected String city;
    protected  int age;
    protected String street;
    protected int numberphone;
    protected int numberphone2;


    public  User(String name, String surname, String city, String street, int numberphone, int numberphone2,int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.street = street;
        this.numberphone = numberphone;
        this.numberphone2 = numberphone2;
        this.age=age;
    }

    public User(String name, String surname, int numberphone) {
        this.name = name;
        this.surname = surname;
        this.numberphone = numberphone;
    }
}