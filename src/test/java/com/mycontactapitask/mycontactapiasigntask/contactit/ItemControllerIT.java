package com.mycontactapitask.mycontactapiasigntask.contactit;


import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemControllerIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() throws JSONException {
        String response =
                this.restTemplate.getForObject("/contacts",
                        String.class);
        JSONAssert.assertEquals("[{\"id\":1,\"name\":\"Edmon Shu\",\"phonnumber\":\"67597875764\"},{\"id\":2,\"name\":\"Edmon Tingiwe\",\"phonnumber\":\"675955764\"},{\"id\":3,\"name\":\"Elvis tita\",\"phonnumber\":\"6753475764\"},{\"id\":4,\"name\":\"Adam Smigyh\",\"phonnumber\":\"6754565764\"},{\"id\":5,\"name\":\"Synthia ftyut\",\"phonnumber\":\"67895599754\"},{\"id\":6,\"name\":\"Fayui Francess\",\"phonnumber\":\"6545575690\"}]",
                response,false);
    }

}
