package Model;

import org.springframework.web.client.RestTemplate;



public class DAO {

    private String URL = "http://www.boredapi.com/api/activity";

    RestTemplate restTemplate = new RestTemplate();


    //Activity activity = restTemplate.getForObject(URL + numPeople, Activity.class);


}
