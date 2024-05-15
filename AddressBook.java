import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
    public List<Contact> getAllContacts() {
        return contacts;
    }

    public boolean updateContact(String newName, String newPhone, String newEmail) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(newName) || contact.getPhone().equals(newPhone) || contact.getEmail().equals(newEmail)) {
                contact.setPhone(newName);// Update the name
                contact.setPhone(newPhone);// Update the phone number
                contact.setEmail(newEmail);// Update the email
                return true;// contact matched
            }
        }
        return false;// contact not matched
    }
}
