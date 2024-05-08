package dev.idan.bgbot.utils;

import dev.idan.bgbot.entities.Token;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PartialImageTest {

    @Test
    public void testGetDomain() {
        String url = "https://www.example.com/image.jpg";
        assertEquals("example.com", PartialImage.getDomain(url));
    }

    @Test
    public void testGetEmailWithGravatar() {
        String userAvatar = "https://www.example.com/avatar.jpg";
        String userMail = "test@example.com";
        Token token = new Token();
        token.setUseGravatar(true);
        assertTrue(PartialImage.getEmail(userAvatar, userMail, token).startsWith("https://www.gravatar.com/avatar/"));
    }

    @Test
    public void testGetEmailWithoutGravatar() {
        String userAvatar = "https://www.example.com/avatar.jpg";
        String userMail = "test@example.com";
        Token token = new Token();
        token.setUseGravatar(false);
        assertEquals("https://www.example.com/avatar.jpg", PartialImage.getEmail(userAvatar, userMail, token));
    }

    @Test
    public void testIsPrivateNetwork() {
        assertTrue(PartialImage.isPrivateNetwork("localhost"));
    }

}
