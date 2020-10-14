package com.omega.mtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MtestApplicationTests {

    @Test
    public void contextLoads() {
    	
    }


    @Test
    public void test() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/user/1", String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).contains("New York");
        
        ResponseEntity<String> response_users = restTemplate.getForEntity("http://localhost:8080/user", String.class);

        assertThat(response_users.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response_users.getBody()).contains("New York");
        assertThat(response_users.getBody()).contains("Vancouver");
        
    }
    
}
