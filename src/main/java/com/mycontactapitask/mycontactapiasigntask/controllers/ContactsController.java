package com.mycontactapitask.mycontactapiasigntask.controllers;

import com.mycontactapitask.mycontactapiasigntask.contactservice.ContactInterface;
import com.mycontactapitask.mycontactapiasigntask.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactsController {


    private ContactInterface contactactService;


    @Autowired
    public ContactsController(ContactInterface contactactService) {
        this.contactactService = contactactService;
    }

    @GetMapping("/contacts")
    public ResponseEntity<List<ContactDTO>> generateContacts(){
        return ResponseEntity.ok(contactactService.getContacts());
    }
}
