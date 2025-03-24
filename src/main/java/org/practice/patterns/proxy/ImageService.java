package org.practice.patterns.proxy;

public class ImageService {

    public Image getImage(String fileName) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Image(fileName, "jpg");
    }

}
