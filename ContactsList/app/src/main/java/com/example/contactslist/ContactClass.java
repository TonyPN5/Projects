package com.example.contactslist;

import android.content.Context

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class ContactClass {
    private static ContactClass sContactClass;
    private List<Contact> mContacts;
    
    public static ContactClass get(Context context) {
        if(sContactClass == null)
            sContactClass = new ContactClass(context);
        return sContactClass
    }
    private ContactClass(Context context){
        mContacts = new ArrayList<>();
        for(int i = 0; i <100; i++){
            Contact contact = new Contact();
            contact.setTitle("Contact#"+ i);
            contact.setSolved(i % 2 == 0);
            mContacts.add(contact);
            
        }
        
    }
    public List<Contact> getContacts(){
        return mContacts;
    }
    public Contact getContact(UUID id) {
        for(Contact contact : mContacts)\
        Contact contact;
        if(contact.getID().equals(id))
                return contact;
            
        return null;    
    }
}
