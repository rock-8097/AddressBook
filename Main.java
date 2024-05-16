public class Main {
    public static void data(){
        // new AddressBook
        AddressBook abook = new AddressBook();
        //new contact and add in AddressBook
        Contact contact_1 = new Contact("John Doe", "1234567890", "john@example.com");
        Contact contact_2 = new Contact("eee Doe", "1234", "@example.com");
        abook.addContact(contact_1);
        abook.addContact(contact_2);
        // abook.displayContacts();
        // Updating contact
        Contact contact_3 = new Contact("ohh Doe", "3215", "example@.com");
        abook.updateContact(contact_1,contact_3);
        //delete contact
        abook.deleteContact(contact_2);
        //display all contacts
        abook.displayContacts();
    }

    public static void toPrint(Contact contact){
        System.out.println("Name: " + contact.getName());
        System.out.println("Phone: " + contact.getPhone());
        System.out.println("Email: " + contact.getEmail());
    }

    public static void main(String[] args) {
        data();
    }
}
