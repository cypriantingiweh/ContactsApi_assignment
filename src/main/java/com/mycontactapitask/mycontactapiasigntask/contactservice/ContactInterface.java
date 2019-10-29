package com.mycontactapitask.mycontactapiasigntask.contactservice;

import com.mycontactapitask.mycontactapiasigntask.dto.ContactDTO;

import java.util.List;

public interface ContactInterface {

    List<ContactDTO> getContacts();
}
