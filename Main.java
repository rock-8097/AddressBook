public class Main {
    public static void data(){
        Contact contact1 = new Contact("John Doe", "1234567890", "john@example.com");
        toPrint(contact1);
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