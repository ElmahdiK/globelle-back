package com.globelle.back;

import com.globelle.back.controller.ReservationController;
import com.globelle.back.service.BeautyServiceService;
import com.globelle.back.model.BeautyService;
import com.globelle.back.service.ReservationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
@AutoConfigureMockMvc
@WebMvcTest(ReservationController.class)
class BackApplicationTests {

    //@MockMvc
    //MockMvc mockMvc;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BeautyServiceService beautyServiceService;

    /*
        @Test
        void contextLoads() {*/
    @Test
    void getBeautyServiceShouldReturnObject() throws Exception {

        // /http://localhost:8080/services/1
        /*
        when(beautyServiceService.getBeautyService(1)).thenReturn({\"id\":1,\"name\":\"Manicure\",\"price\":\"25.00\"}");

        this.mockMvc.perform(get("/services/1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("10:15")));
         */

        when(beautyServiceService.getBeautyService(1))
                .thenReturn(Optional.of(new BeautyService() {{
                    setId(1);
                    setName("Manicure");
                    setPrice("25.00");
                }}));

        this.mockMvc.perform(get("/services/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":1,\"name\":\"Manicure\",\"price\":\"25.00\"}"));
    }

}
