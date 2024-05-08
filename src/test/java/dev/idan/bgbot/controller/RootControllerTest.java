package dev.idan.bgbot.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.view.RedirectView;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RootControllerTest {

    private RootController rootController;

    @BeforeEach
    void setUp() {
        this.rootController = new RootController();
    }

    @Test
    void redirectToWebsiteTest() {
        RedirectView redirectView = rootController.redirectToWebsite();
        assertTrue(redirectView.isRedirectView());
        assertEquals("https://idankoblik.github.io/gitlab-monitor", redirectView.getUrl());
    }
}
