

public class Contact  extends User  {
    //public String name,aftername ,city, street;
    // public int numberphone;
    // public int numberphone2;

    // public int zipcode;
    //   public int aptnumber;


    public Contact(String name, String surname, String city, String street, int age, int numberphone, int numberphone2, int zipcode, int aptnumber) {
        super(name, surname, city, street, numberphone, numberphone2, age);

        super.name = name;
        super.surname = surname;
        super.city = city;
        super.street = street;
        super.numberphone = numberphone;
        super.numberphone2 = numberphone2;
        super.zipcode = zipcode;
        super.aptnumber = aptnumber;
        super.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;

    }

    public int setAge(int age) {
        return age;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSurname() {
        return surname;
    }

    public String setSurname(String surname) {
        return surname;
    }

    public int getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(int numberphone) {
        this.numberphone = numberphone;
    }

    public int getNumberphone2() {
        return numberphone2;
    }

    public void setNumberphone2(int numberphone2) {
        this.numberphone2 = numberphone2;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getAptnumber() {
        return aptnumber;
    }

    public void setAptnumber(int aptnumber) {
        this.aptnumber = aptnumber;
    }

    @Override
    public String toString() {
        return "<<<<<<< List to yellow book is >>>>>>>>>>" +
                " \n * name=' " + name +
                "\n *age  " + age +
                " \n * surname=  " + surname +
                "\n  * city= " + city + '\'' +
                "\n  * street= " + street +
                "\n  * numberphone= " + numberphone +
                " \n * numberphone2= " + numberphone2 +
                " \n * zipcode= " + zipcode +
                " \n * aptnumber= " + aptnumber;
    }
}