package com.rizwansayyed.animations;

public class users {

    int img;
    String name, comment;

    public users(int img, String name, String comment) {
        this.img = img;
        this.name = name;
        this.comment = comment;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
