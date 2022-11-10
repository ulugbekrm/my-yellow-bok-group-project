
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Operation  {
    //int conut = 0;

    public static ArrayList<Contact> list = new ArrayList<Contact>();

    public static ArrayList<Administration> list1 = new ArrayList<Administration>();
    public static ArrayList<Visitor> list2 = new ArrayList<Visitor>();


    static MenuOfChoose m = new MenuOfChoose();
    static Scanner scanner = new Scanner(System.in);

    public Operation()  {

    }

    public static void addlogic() {
        try {
            int ax = scanner.nextInt();

            while (true) {
                if (ax == 1 || ax == 2 || ax == 3) {
                    switch (ax) {
                        case 1:
                            addnew();
                            MenuOfChoose.menu();
                            break;
                        case 2:
                            showall();
                            MenuOfChoose.menu();
                            break;
                        case 3:
                            updtcontact();
                            MenuOfChoose.menu();
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("Please choose number 1 to 3");
                }
            }
        }catch (Exception e){
            System.out.println("Information isn't correct please try again");
        }
    }

    public static void addnew() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Enter your surname");
            String surname = scanner.nextLine();
            System.out.println(".................");
            System.out.println("Enter you city");
            String city = scanner.nextLine();
            System.out.println("Enter you street");
            String street = scanner.nextLine();
            System.out.println("Please enter phone number or do you want update ex. 0700000000");
            int numberphone = scanner.nextInt();

            System.out.println("Enter your age");
            int age = scanner.nextInt();

            System.out.println("Please enter 2nd phone number or do you want update ex. 0753456700");
            int numberphone1 = scanner.nextInt();
            System.out.println("Enter your zipcode");
            int zipcode = scanner.nextInt();
            System.out.println("Enter your apt-number");
            int aptnumber = scanner.nextInt();

            Contact admn1 = new Contact(name, surname, city,  street, age, numberphone, numberphone1, zipcode, aptnumber);
            list.add(admn1);


            System.out.println("Contact add succefully");
            MenuOfChoose.menu();
        }catch (Exception e){
            System.out.println("Information isn't correct please try again");
        }
    }
    ////////////////menu search//////////////////////
    public static void searchlogic() {
        try {
            int search = scanner.nextInt();
            if (search == 0 || search == 1 || search == 2 || search == 3 || search == 4 || search == 5 || search == 6) {
                switch (search) {
                    case 0 -> showall();
                    case 1 -> Operation.searchByaftrname();
                    case 2 -> searchBystreat();
                    case 3 -> searchByname();
                    case 4 -> searchBynumberPhone();
                    case 5 -> searchByage();
                    case 6 -> MenuOfChoose.menu();
                    default -> {
                    }
                }
            } else {
                System.out.println("Please choose numbers 1 to 5 ");
            }
        }catch (Exception e){
            System.out.println("Information isn't correct please try again");
        }
    }
    /////////////////////// search aftrname////////////////
    public static void searchByaftrname() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter surname search");
            System.out.println("..............................");
            String aftrnam = scanner.next();
            int flag = 1;
            Iterator<Contact> itadm = list.iterator();
            while (itadm.hasNext()) {
                Contact admn1 = itadm.next();
                if (aftrnam.equals(admn1.getSurname())) ;
                System.out.println("name is " + admn1.getName() + " \n surname " + admn1.getSurname() + "\n city" + admn1.getCity() + "age is" + admn1.getAge() +
                        " \n phone number " + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcode " + admn1.getZipcode()
                        + " \n aprtnumber " + admn1.getAptnumber());
                flag = 0;
            }
            if (flag == 1) {
                System.out.println("Surname isn't exist");
            }
        }catch (Exception e){
            System.out.println("Information isn't correct please try again");
        }
        MenuOfChoose.searchMenu();
    }
    ///////////////////////////search name//////////////////
    public static void searchByname() {
        try {
            System.out.println("Please enter search name");

            System.out.println("..............................");
            String aftrnam = scanner.next();
            int flag = 1;
            Iterator<Contact> itadm = list.iterator();
            while (itadm.hasNext()) {
                Contact admn1 = itadm.next();
                if (aftrnam.equals(admn1.getName())) ;
                System.out.println("name is " + admn1.getName() + " \n surname " + admn1.getSurname() + "\n city" + admn1.getCity() + "age is" + admn1.getAge() +
                        " \n phone number" + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcod " + admn1.getZipcode()
                        + " \n aprtnumber " + admn1.getAptnumber());
                flag = 0;
            }
            if (flag == 1) {
                System.out.println("Surname isnt exist");
            }
        }catch (Exception e){
            System.out.println("Information isn't correct pleas try again");
        }
        MenuOfChoose.searchMenu();

    }
    /////////////////////////////////////search streat/////////////////////
    public static void searchBystreat() {
        try {
            System.out.println("Please enter surname search");

            System.out.println("..............................");
            String aftrnam = scanner.next();
            int flag = 1;
            Iterator<Contact> itadm = list.iterator();
            while (itadm.hasNext()) {
                Contact admn1 = itadm.next();
                if (aftrnam.equals(admn1.getStreet())) ;
                System.out.println("name is " + admn1.getName() + " \n surname " + admn1.getSurname() + "\n city" + admn1.getCity() + "age is " + admn1.getAge() +
                        " \n phone number" + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcode " + admn1.getZipcode()
                        + " \n aprtnumber " + admn1.getAptnumber());
                flag = 0;
            }
            if (flag == 1) {
                System.out.println("Street isn't exist");
            }
        }catch (Exception e){
            System.out.println("Information isn't correct please try again");
        }
        MenuOfChoose.searchMenu();
    }
    ///////////////////////////////search numberphone/////////////////
    public static void searchBynumberPhone() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter phone number search");
            System.out.println("..............................");
            int numberphone = scanner.nextInt();
            int flag = 1;
            Iterator<Contact> itadm = list.iterator();
            while (itadm.hasNext()) {
                Contact admn1 = itadm.next();
                if (numberphone == (admn1.getNumberphone())) ;
                System.out.println("name is " + admn1.getName() + " \n surname " + admn1.getSurname() + "\n city" + admn1.getCity() + "age is " + admn1.getAge() +
                        " \n phone number " + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcode " + admn1.getZipcode()
                        + " \n apt number " + admn1.getAptnumber());
                flag = 0;
            }
            if (flag == 1) {
                System.out.println("Phone number isn't exist");
            }
        }catch (Exception e){
            System.out.println("Information isn't correct please try again");
        }
        MenuOfChoose.searchMenu();
    }
    /////////////////////////////search age/////////////////////
    public static void searchByage() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter age search");
            System.out.println("..............................");
            int age = scanner.nextInt();
            int flag = 1;
            Iterator<Contact> itadm = list.iterator();
            while (itadm.hasNext()) {
                Contact admn1 = itadm.next();
                if (age == (admn1.getAge())) ;
                System.out.println("name is " + admn1.getName() + " \n surname is" + admn1.getSurname() + "\n city is" + admn1.getCity() + "\n age is" + admn1.getAge() +
                        " \n phone number is " + admn1.getNumberphone() + "\n street is" + admn1.getStreet() + "\n zipcode is" + admn1.getZipcode()
                        + " \n aprt number is" + admn1.getAptnumber());
                flag = 0;
            }
            if (flag == 1) {
                System.out.println("Age isn't exist");
            }
        }catch (Exception e){
            System.out.println("Information isn't correct please try again");
        }
        MenuOfChoose.searchMenu();
    }
    ////////////////////////////show all lista//////////////////////////
    public static void showall() {
        if(list.isEmpty()) {System.out.println("list is empty");}else {
            Iterator<Contact> itadm = list.iterator();
            for (Iterator<Contact> it = itadm; it.hasNext(); ) {
                Contact admin1 = it.next();
                System.out.println(admin1);
            }
        }
        MenuOfChoose.menu();
    }
    ///////////////////////////////update contact///////////////////////////////
    public static void updtcontact() {
        Scanner scanner = new Scanner(System.in);
        try {
            int opd = scanner.nextInt();
            if (opd == 1 || opd == 2 || opd == 3 || opd == 4 || opd == 5 || opd == 6) {
                switch (opd) {
                    case 1 -> nameUpdatera();
                    case 2 -> cityUpdatera();
                    case 3 -> numberPhoneUppdater();
                    case 4 -> afterNameUpdatera();
                    case 5 -> ageUppdater();
                    case 6 -> MenuOfChoose.menu();
                }
            } else {
                System.out.println("Please choose 1 to 5 ");
            }
        }catch (Exception e){
            System.out.println("Information isn't correct please try again");
        }
    }
    ////////////////////////update name//////////////////////////////////////
    public static void nameUpdatera() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Enter id of manager");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter name if do you want update");
                String nameupd = scanner1.nextLine();
                System.out.println("Enter new name");
                String newname = scanner1.nextLine();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (nameupd.equals(admin1.getName())) {
                        admin1.setName(newname);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("Your name isn't exist");
                }
            } else {
                System.out.println("You are not manager :( ");
            }
        }
        MenuOfChoose.updatera();
    }
    ////////////////////////////////update city/////////////////////
    public static void cityUpdatera() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("Enter id manager");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter city do you want update");
                String cityupd = scanner1.nextLine();
                System.out.println("Enter new name");
                String newcity = scanner1.nextLine();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (cityupd.equals(admin1.getCity())) {
                        admin1.setCity(newcity);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("Your city isn't exist");
                }
            } else {
                System.out.println(" :(You are not manager");
            }
        }
        MenuOfChoose.updatera();
    }
    ////////////////////////////update numberphone//////////////////////////
    public static void numberPhoneUppdater() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("Enter id manager");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter phone number do you want update ex 07534567");
                int numberphoneupd = scanner1.nextInt();
                System.out.println("Enter new name");
                int newnumberphon = scanner1.nextInt();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (numberphoneupd == (admin1.getNumberphone())) {
                        admin1.setNumberphone(newnumberphon);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("Your phone number isn't exist");
                }
            } else {
                System.out.println("You are not manager");
            }
        }
        MenuOfChoose.updatera();
    }
    ////////////////////////////////update age//////////////////
    public static void ageUppdater() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Enter id manager");

            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter age do you want update ");
                int age = scanner1.nextInt();
                System.out.println("Enter new age");
                int newAge = scanner1.nextInt();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (age == (admin1.getAge())) {
                        admin1.setNumberphone(newAge);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("Your age isn't exist");
                }
            } else {
                System.out.println("You are not manager");
            }
        }
        MenuOfChoose.updatera();
    }
    ///////////////////////////update after name////////////////
    public static void afterNameUpdatera() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("Enter id manager");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter surname do you want update");
                String aftrnameupd = scanner1.nextLine();
                System.out.println("Enter new name");
                String newaftrname = scanner1.nextLine();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (aftrnameupd.equals(admin1.getSurname())) {
                        admin1.setSurname(newaftrname);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("Your surname isn't exist");
                }
            } else {
                System.out.println("You are not manager");
            }
        }
        MenuOfChoose.updatera();
    }
    /////////////////////////deleted menu////////////////
    public static void deletMenu() {
        Scanner scanner = new Scanner(System.in);
        try {
            int del = scanner.nextInt();
            if (del == 1 || del == 2 || del == 3 || del == 4) {
                switch (del) {
                    case 1:
                        showall();
                        break;
                    case 2:
                        deltedContact();
                        break;
                    case 3:
                        deletedAll();
                        break;
                    case 4:
                        MenuOfChoose.menu();
                        break;
                }
            } else {
                System.out.println("Please choose number 1 to 4");
            }
        }catch (Exception e){
            System.out.println("Information isn't correct please try again");
        }
    }
    ////////////////////deleted contact///////////////////////
    public static void deltedContact() {
        if (list.isEmpty()) {
            System.out.println("<<<List is empty>>>");
        } else {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter id of manager");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter name contact do you want delete");
                System.out.println(".....................................");
                String name = scanner1.nextLine();
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (name.equals(admin1.getName())) {
                        itadm.remove();
                        System.out.println("Deleted is successfuly");
                    } else {
                        System.out.println("This name isn't exist");
                    }
                }
            } else {
                System.out.println("You are not manager");
            }
        }
        MenuOfChoose.deletcontact();
    }
    ////////////////////////////////////deleted all//////////////
    public static void deletedAll() {
        // Scanner scanner=new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("<<<List is empty >>>");

        } else {
            try {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter your id ");
                int id = scanner1.nextInt();
                if (Operation.check_manager(id)) {
                    list.removeAll(list);
                    System.out.println("is empty");
                } else {
                    System.out.println("You are not manager");
                }
            }catch (Exception e){
                System.out.println("Information isn't correct please try again");
            }
        }
        MenuOfChoose.deletcontact();
    }
    /////////////////////////////////add administer//////////////////
    public static void addaAdminster() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter name of administration");
            String namadmins = scanner.nextLine();
            System.out.println("Enter surname of administration");
            String aftrdmins = scanner.nextLine();
            System.out.println("Enter phone number");
            int phondmins = scanner.nextInt();
            System.out.println("Enter id");
            int id = scanner.nextInt();
            System.out.println("Enter type of user");
            System.out.print("Manager?  (1:yes) , (2:no)? ");
            int x = scanner.nextInt();
            String type;
            if (x == 1) {
                type = "Manager";
            } else {
                type = null;
            }
            Administration admin = new Administration(namadmins, aftrdmins, phondmins, type, id);
            list1.add(admin);
            //  menuofchosse.menu();
        }catch (Exception e){
            System.out.println("Information isn't correct please try again");
        }
    }
    //////////////////////////////check manger///////////////////////////
    public static boolean check_manager(int id) {

        boolean stat = false;
        for (int i = 0; i < list1.size(); i++) {
            if (id == list1.get(i).getId()) {
                if (list1.get(i).isManager()) {
                    stat = true;
                }
            }
        }
        return stat;
    }
    //////////////////////////show list administer/////////////////////
    public static void listaOfadminster() {
        if (list1.isEmpty()) {
            System.out.println("List of manager is empty");
        } else {
            for (Administration ad : list1
            ) {
                System.out.println(ad);
            }
        }
    }
    /////////////////////////////////show lit visitor////////////////
    public static void listaOfvistore() {
        if (list2.isEmpty()) {
            System.out.println("list of visitor is empty");
        } else {
            for (Administration ad : list1
            ) {
                System.out.println(ad);
            }
        }
    }
    ////////////////////////////add vistor///////////////////
    public static void addVistore() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name of visitor");
            String namadmins1 = scanner.nextLine();
            System.out.println("Enter surnaem of visitor");
            String aftrdmins1 = scanner.nextLine();
            System.out.println("Enter  number phone");
            int phondmins1 = scanner.nextInt();
            Visitor vist = new Visitor (namadmins1, aftrdmins1, phondmins1);
            list2.add(vist);
            System.out.println("Add visitor is succefully");
        } catch (Exception e) {
            System.out.println("Isn't correct try again");
        }//menuofchosse.menu();
    }
}