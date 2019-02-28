package com.example.anjal.gamestore;

public class GameTitle {
    public int imageId;
    public String title;
    public String genre;
    public String descrption;
    public String link;


    GameTitle( int imageId, String title, String genre, String descrption, String link) {

        this.imageId = imageId;
        this.title = title;
        this.genre = genre;
        this.descrption = descrption;
        this.link = link;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
