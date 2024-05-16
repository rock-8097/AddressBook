import java.util.Scanner;

public class Main {
    public static void data(){
        Scanner scan = new Scanner(System.in);
        // new AddressBook
        AddressBook abook = new AddressBook();
        boolean addingContacts = true;

        while (addingContacts) {
            // abook.addContact(newConnection(scan));
            System.out.println("\nChoose an option:");
            System.out.println("1. Add another contact");
            System.out.println("2. Update a contact");
            System.out.println("3. Delete a contact");
            System.out.println("Press any other key Exit");
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    abook.addContact(newConnection(scan));
                    break;                
                case "2":
                    System.out.print("Enter the name of the contact you want to update: ");
                    String toupdate_name = scan.nextLine();
                    Contact updated = newConnection(scan);
                    abook.updateContact(toupdate_name, updated);
                    break;
                case "3":
                    System.out.print("Enter the name of the contact you want to update: ");
                    String todelete = scan.nextLine();
                    abook.deleteContact(todelete);
                    break;
                default:
                    addingContacts = false;
                    break;
            }
            
        }
        abook.displayContacts();
    }
    public static Contact newConnection(Scanner scanner){
        System.out.println("Enter contact details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Phone Number: ");
            String phone = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            return new Contact(name, phone, email);
    }

    public static void main(String[] args) {
        data();
    }
}
