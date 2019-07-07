/*package com.sapient.startwarsmovieapp.controllerTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
public class StarWarsMovieControllerTest {

    private MockMvc mockMvc;    

	
    @Test
    public void getProductByNameWrongName() throws Exception {
    	String wrongName = "bahbahbah";
    	
    	this.mockMvc.perform(
    		get("/planets/search?name=" + wrongName))
        	.andExpect(status().isNotFound());        	
    } 
}
*/