package com.mycontactapitask.mycontactapiasigntask.data;

import com.mycontactapitask.mycontactapiasigntask.contactrepo.ContactRepository;
import com.mycontactapitask.mycontactapiasigntask.model.Contacts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@DataJpaTest
public class ContactsRepositoryTest {

   @Autowired
    private ContactRepository repository;

    @Test
    public  void FindallContacts(){
        List<Contacts> items = repository.findAll();

        assertEquals(6,items.size());
    }
}
