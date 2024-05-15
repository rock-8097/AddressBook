public class Main {
    public static void data(){
        // new instance of AddressBook
        AddressBook contacts = new AddressBook();
        //new instance of contact and add in AddressBook
        Contact contact1 = new Contact("John Doe", 1234567890, "john@example.com");
        toPrint(contact1);
        contacts.addContact(contact1);
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
