package com.mycontactapitask.mycontactapiasigntask.mock;

import com.mycontactapitask.mycontactapiasigntask.contactrepo.ContactRepository;
import com.mycontactapitask.mycontactapiasigntask.contactservice.ContactactServiceImpl;
import com.mycontactapitask.mycontactapiasigntask.model.Contacts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ContactMockTest {

    @InjectMocks
    ContactactServiceImpl contactactService =
            new  ContactactServiceImpl();
    @Mock
    ContactRepository contactRepository;

    @Test
    public void retrieveSomeValues(){
        when(contactRepository.findAll())
                .thenReturn(Arrays.asList(
                        new Contacts(1,"Edmon Shu",
                                "67598707")));
        List<Contacts> contacts = contactactService.getContacts();
        assertEquals(1,contacts.size());
    }


}
