package com.mycontactapitask.mycontactapiasigntask.contactscontrollerTest;


import com.mycontactapitask.mycontactapiasigntask.contactservice.ContactactServiceImpl;
import com.mycontactapitask.mycontactapiasigntask.controllers.ContactsController;
import com.mycontactapitask.mycontactapiasigntask.model.Contacts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ContactsController.class)
public class ItemsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContactactServiceImpl contactactService;

    @Test
    public  void  ItemBusinessServiceAll_basic() throws Exception{

        when(contactactService.getContacts())
                .thenReturn(Arrays.asList(new Contacts(1,"Edmon Shu","67597875764"),
                        new Contacts(2,"Edmon Tingiwe","675955764")));

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/contacts")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult mvcResult = mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().json("[{\"id\":1,\"name\":\"Edmon Shu\",\"phonnumber\":\"67597875764\"},{\"id\":2,\"name\":\"Edmon Tingiwe\",\"phonnumber\":\"675955764\"}]"))
                .andReturn();
    }
}
