package contactmanagement;

import java.util.Scanner;

public class ContactMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();

        System.out.print("Enter contact phone number: ");
        String phoneNumber = scanner.nextLine();

        contactManager.addContact(name, phoneNumber);
        System.out.println("Contact added successfully!");

        System.out.println("Displaying contact:");
        contactManager.displayContact();

        scanner.close();
    }
}