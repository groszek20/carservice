package pl.carservice.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import pl.carservice.CarServiceAppConfiguration;
import pl.carservice.CarServiceWebConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {CarServiceAppConfiguration.class, CarServiceWebConfiguration.class})
@WebAppConfiguration
public class ControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void commentTest() throws Exception {
		mockMvc.perform(get("/comment/1")).andExpect(status().isOk());
	}
	
	@Test
	public void fileUploadTest() throws Exception {
		mockMvc.perform(fileUpload("/file/upload/").file("file","Ala ma kota".getBytes())
				.param("name","nazwapliku.txt")).andExpect(content().string("uploadfile"));
	}

}
