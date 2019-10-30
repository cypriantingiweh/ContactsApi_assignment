package com.mycontactapitask.mycontactapiasigntask.controllers;

import com.mycontactapitask.mycontactapiasigntask.contactservice.ContactactServiceImpl;
import com.mycontactapitask.mycontactapiasigntask.model.Contacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ContactsController {

    @Autowired
    private ContactactServiceImpl contactactService;


    @GetMapping("/contacts")
    public ResponseEntity<List<Contacts>> generateContacts(){
        return ResponseEntity.ok(contactactService.getContacts());
    }

}
