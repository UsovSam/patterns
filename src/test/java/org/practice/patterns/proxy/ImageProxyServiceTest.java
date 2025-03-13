package org.practice.patterns.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ImageProxyServiceTest {

    @Test
    public void test_null() {
        ImageService imageService = new ImageService();
        ImageProxyService imageProxyService = new ImageProxyService(imageService);

        Image image = imageProxyService.getImage("test");

        assertEquals("test", image.getFileName());
        assertEquals("jpg", image.getType());
    }

    @Test
    public void test() {
        ImageService imageService = mock(ImageService.class);
        when(imageService.getImage("test")).thenReturn(new Image("test", "jpg"));
        ImageProxyService imageProxyService = new ImageProxyService(imageService);

        Image image = imageProxyService.getImage("test");
        verify(imageService, times(1)).getImage("test");
        assertEquals("test", image.getFileName());
        assertEquals("jpg", image.getType());

        Image image2 = imageProxyService.getImage("test");
        verify(imageService, times(1)).getImage("test");
        assertEquals("test", image2.getFileName());
        assertEquals("jpg", image2.getType());

    }

}