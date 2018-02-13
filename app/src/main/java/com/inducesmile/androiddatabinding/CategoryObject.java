package com.inducesmile.androiddatabinding;

/**
 * Created by mukeshjha on 2/13/18.
 */

public class CategoryObject {
    private String name;
    private String imageUrl;
    public CategoryObject(String name, String  imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }
    public String getName() {
        return name;
    }
    public String getImageUrl() {
        return imageUrl;
    }
}
