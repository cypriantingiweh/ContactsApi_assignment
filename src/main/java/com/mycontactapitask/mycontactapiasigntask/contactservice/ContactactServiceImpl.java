package com.mycontactapitask.mycontactapiasigntask.contactservice;

import com.mycontactapitask.mycontactapiasigntask.contactrepo.ContactRepository;
import com.mycontactapitask.mycontactapiasigntask.dto.ContactDTO;
import com.mycontactapitask.mycontactapiasigntask.model.Contacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactactServiceImpl implements ContactInterface {


    private ContactRepository contactsRepository;

    @Autowired
    public ContactactServiceImpl(ContactRepository contactsRepository) {

        this.contactsRepository = contactsRepository;
    }

    @Override
    public List<ContactDTO> getContacts(){
        Iterable<Contacts> contacts = contactsRepository.findAll();
        List<ContactDTO> contactDTOS = new ArrayList<>();
        for(Contacts contact : contacts) {
            ContactDTO contactDTO = new ContactDTO();
            contactDTO.setPhonnumber(contact.getPhonnumber());
            contactDTO.setName(contact.getName());
            contactDTO.setId(contact.getId());
            contactDTOS.add(contactDTO);
        }
        return contactDTOS;
    }
}
