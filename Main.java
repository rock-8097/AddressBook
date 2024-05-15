class Contact {
    private String name;
    private int phone;
    private String email;

    public Contact(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       
}
public class Main {
    public static void data(){
        Contact contact1 = new Contact("John Doe", 1234567890, "john@example.com");
        System.out.println("Name: " + contact1.getName());
        System.out.println("Phone: " + contact1.getPhone());
        System.out.println("Email: " + contact1.getEmail());
    }
    public static void main(String[] args) {
        data();
    }
}
