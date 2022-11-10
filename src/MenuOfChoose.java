import java.util.Scanner;

public class MenuOfChoose {
    static Scanner sc =new Scanner(System.in);
    static Operation op = new Operation();
    ///////////////////////////////first menu///////////////////////
    public static void menu() {
        System.out.println("..<<<Menu of yellow book>>....");
        System.out.println("..............................");
        System.out.println(".....0 Enter with manager....");
        System.out.println(".............................");
        System.out.println(" .....1 Add new contact......");
        System.out.println("..............................");
        System.out.println("..... 2 Check for list........");
        System.out.println("..............................");
        System.out.println(".......3 Show list............");
        System.out.println("..............................");
        System.out.println("......4 Update contact . .....");
        System.out.println("..............................");
        System.out.println("......5 Delete menu............");
        System.out.println("..............................");
        System.out.println("....... 6 Quite................");
        System.out.println("...............................");

        //this chooce first menu.............................................

        try {
            int selk = sc.nextInt();

            if  (selk == 0 || selk == 1 || selk == 2 || selk == 3 || selk == 4 || selk == 5 || selk == 6) {

                switch (selk) {
                    case 0:
                        addcistor_adminstor();
                        break;
                    case 1:
                        addcontact();
                        break;
                    case 2:
                        searchMenu();
                        break;
                    case 3:
                        showlista();
                        break;
                    case 4:
                        updatera();
                        break;
                    case 5:
                        deletcontact();
                        break;
                    case 6:
                        System.out.println("Good bie see you soon");
                        System.exit(0);
                    default:}
            } else {
                System.out.println("Please choose number 1 to 6 ");
            }
        }catch (Exception e){ System.out.println("Please choose number 1 to 6  try again");

        }menu();
    }

    public static void addcistor_adminstor(){
        System.out.println("...... 1 Add manager>>.......");
        System.out.println("..............................");
        System.out.println("... 2 List of administration ..");
        System.out.println("..............................");
        System.out.println("..... 3 list of visitor........");
        System.out.println("................................");
        System.out.println("...... 4 Add visitor............");
        System.out.println("................................");
        System.out.println("...... 5 Back menu...............");
        System.out.println("................................");
        try {
            int lis = sc.nextInt();
            if (lis == 1 || lis == 2 || lis == 3 || lis == 4 || lis == 5) {
                switch (lis) {
                    case 1 -> Operation.addaAdminster();
                    case 2 -> Operation.listaOfadminster();
                    case 3 -> Operation.listaOfvistore();
                    case 4 -> Operation.addVistore();
                    case 5 -> menu();
                }
            } else {
                System.out.println("Please choose number 1 to 5");
            }
        }catch (Exception e){
            System.out.println("Information isn't correct pleas tey aging");
        }menu();
    }

    // .........1 addnew contct.................................
    public static void addcontact() {
        System.out.println("...<<.Add menu contact.>>....");
        System.out.println(".............................");
        System.out.println(".....1 Add new contact.......");
        System.out.println("............................");
        System.out.println(".....2 Show list.............");
        System.out.println(".............................");
        System.out.println(".....4 Back to menu..........");
        System.out.println(".............................");

        op.addlogic();
    }
    //............2 menusearch
    public static void searchMenu() {
        System.out.println("....<<..Search menu..>>........");
        System.out.println("...............................");
        System.out.println("........0 Show list............");
        System.out.println("...............................");
        System.out.println("....1 Search by name...........");
        System.out.println("...............................");
        System.out.println("....2 Search by city............");
        System.out.println("...............................");
        System.out.println("....3 Search by numberphone.....");
        System.out.println("...............................");
        System.out.println(".....4 Show list................");
        System.out.println("...............................");
        System.out.println("......5 Search by age...........");
        System.out.println("...............................");
        System.out.println("......6 Back to menu.............");
        System.out.println(".................................");

        Operation.searchlogic();
    }
    //,,,,,3 of menu
    public static void showlista() {

        System.out.println("List is ");
        Operation.showall();

    }
    //...........4 menu
    public static void updatera() {
        System.out.println("....<<..Update menu..>>........");
        System.out.println("...............................");
        System.out.println("........1 Update name...........");
        System.out.println("................................");
        System.out.println(".......2 Update city............");
        System.out.println("................................");
        System.out.println(".....3 Update numberphone.......");
        System.out.println("................................");
        System.out.println(".....4 ..Update surname.........");
        System.out.println(".................................");
        System.out.println(".......,,5 Update age............");
        System.out.println(".................................");
        System.out.println(".........6 Back to menu..........");
        System.out.println(".................................");
        Operation.updtcontact();
    }

    //....... 5 menu.......................................................
    public static void deletcontact() {
        System.out.println("......<<.Delete menu.>>.......");
        System.out.println("..............................");
        System.out.println(".......1 Show list............");
        System.out.println("..............................");
        System.out.println("...... 2 Delete contact........");
        System.out.println("..............................");
        System.out.println("......3 Delete all............");
        System.out.println("...............................");
        System.out.println(".......4 Back to menu.........");
        System.out.println(".............................");
        Operation.deletMenu();
    }
}