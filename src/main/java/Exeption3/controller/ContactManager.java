package Exeption3.controller;
import Exeption3.view.ContactData;
import  Exeption3.data.Contact;
import java.util.List;
import static Exeption3.view.ContactDataMaker.getContactData;

public class ContactManager {
    private ContactData contactData;

    public ContactManager() {
        contactData = getContactData();
    }

    public int addContact(Contact contact) {
        return (contactData.addContact(contact));
    }

    public void updateContact(int contactId, Contact updateContact) {
        contactData.updateContact(contactId, updateContact);
    }

    public void deleteContact(int contactId) {
        contactData.deleteContact(contactId);
    }

    public Contact getContact(int contactId) {
        return contactData.getContact(contactId);
    }

    public List<Contact> findContacts() {
        return contactData.findContacts();
    }

    public void writeContact(int contactId) {
        contactData.writeContacts(contactId);
    }
}