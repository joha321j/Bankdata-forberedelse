package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }

    @Test
    public void getAbout() throws Exception {
        ResultActions actions = mvc.perform(requestAboutPage());
        actions.andExpect(status().isOk());

    }

    @Test
    public void checkAboutContent() throws Exception {
        ResultActions actions = mvc.perform(requestAboutPage());
        actions.andExpect(content().string(equalTo("This is the about page.")));
    }

    private RequestBuilder requestAboutPage() {
        MockHttpServletRequestBuilder builder =  MockMvcRequestBuilders.get("/about");
        builder = builder.accept(MediaType.APPLICATION_JSON);

        return builder;
    }

}
