package com.hamsoft.betkingadmin;

/**
 * Created by hamisi on 11/13/17.
 */

public class ImageUpload {
    public String name;
    public String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public ImageUpload(String name, String url) {
        this.name = name;
        this.url = url;
    }
    public ImageUpload() {

    }
}
