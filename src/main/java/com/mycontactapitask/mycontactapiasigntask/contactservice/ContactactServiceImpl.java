package com.mycontactapitask.mycontactapiasigntask.contactservice;

import com.mycontactapitask.mycontactapiasigntask.contactrepo.ContactRepository;
import com.mycontactapitask.mycontactapiasigntask.model.Contacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactactServiceImpl  {


    @Autowired
    private ContactRepository contactsRepository;

    public List<Contacts> getContacts(){
        List<Contacts> contacts = contactsRepository.findAll();
        return contacts;
    }
}
