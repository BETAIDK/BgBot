package dev.idan.bgbot.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OkEndpointTest {

    private OkEndpoint okEndpoint;

    @BeforeEach
    void setUp() {
        this.okEndpoint = new OkEndpoint();
    }

    @Test
    void handleTest() {
        assertEquals("Http 200", okEndpoint.handle().getBody());
        assertEquals(HttpStatus.OK, okEndpoint.handle().getStatusCode());
    }
}
