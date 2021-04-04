
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

import java.io.IOException;
import java.util.ArrayList;

public class AddressBookTest {
    ArrayList<Contact> contact = new ArrayList<>();

    @Test
    public void whenPersonContactDetailsAddedToFile_ShouldReturn_True() {
    	 Contact contact1 = new Contact("Sai","Tarun" ,"pelluru","Ongole","Andhrapradesh",523001,7901001572L,"saitarun800@gmail.com");
         Contact contact2 = new Contact("Sravani","Lakshmi","MM-Road","Ongole","Andhrapradesh", 523301,8888888888L,"sravs@gmail.com");

         AddressBookIO addressBook = new AddressBookIO();
         contact.add(contact1);
         contact.add(contact2);
      
         boolean isAdded = addressBook.addContact(contact);
        
         Assertions.assertTrue(isAdded);
    }

    @Test
    public void PersonContactDetailsAddedToFile_WhenRead_ShouldReturn_True() throws IOException {
    	 Contact contact1 = new Contact("Sai","Tarun" ,"pelluru","Ongole","Andhrapradesh",523001,7901001572L,"saitarun800@gmail.com");
         Contact contact2 = new Contact("Sravani","Lakshmi","MM-Road","Ongole","Andhrapradesh", 523301,8888888888L,"sravs@gmail.com");

         AddressBookIO addressBook = new AddressBookIO();
         contact.add(contact1);
         contact.add(contact2);
       
         boolean isAdded = addressBook.addContact(contact);
         if (isAdded) {
             boolean isRead = addressBook.viewContact();
             Assertions.assertTrue(isAdded);
         }
     
         
    }
}

