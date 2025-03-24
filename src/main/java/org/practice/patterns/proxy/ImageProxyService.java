package org.practice.patterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class ImageProxyService {

    private ImageService imageService;
    private Map<String, Image> imageCache;

    public ImageProxyService(ImageService imageService) {
        this.imageService = imageService;
        this.imageCache = new HashMap<>();
    }

    public Image getImage(String fileName) {
        if (imageCache.containsKey(fileName)) {
            return imageCache.get(fileName);
        } else {
            Image image = this.imageService.getImage(fileName);
            imageCache.put(fileName, image);
            return image;
        }
    }

}
