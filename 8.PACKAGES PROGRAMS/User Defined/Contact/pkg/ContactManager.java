package contactmanagement;

public class ContactManager {
    private Contact contact;

    public void addContact(String name, String phoneNumber) {
        contact = new Contact(name, phoneNumber);
    }

    public void displayContact() {
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("No contact found.");
        }
    }
}