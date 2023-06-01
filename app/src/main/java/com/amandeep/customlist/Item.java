package com.amandeep.customlist;

public class Item {
    int image;
    String title;
    String righttxt;

    public Item(int image,String title,String righttxt)
    {
        this.image=image;
        this.title=title;
        this.righttxt=righttxt;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRighttxt() {
        return righttxt;
    }

    public void setRighttxt(String righttxt) {
        this.righttxt = righttxt;
    }


}
