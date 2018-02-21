package com.example.rezqflex.rezq;

import java.util.UUID;

/**
 * Created by Ben on 2018-02-21.
 */

public class Item {
    private UUID mid;
    private String mTitle;
    private String mLink;
    private int mTime;
    private int rating;
    private Genres genre;
    private String Release_Date;
    private int num_episodes;
    private int photoID;


    public Item(){
        this(UUID.randomUUID());
    }

    public Item(UUID id){
        mid = id;

    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public UUID getId() {
        return mid;
    }

    public void setId(UUID mid) {
        this.mid = mid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmLink() {
        return mLink;
    }

    public void setmLink(String mLink) {
        this.mLink = mLink;
    }

    public int getmTime() {
        return mTime;
    }

    public void setmTime(int mTime) {
        this.mTime = mTime;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre.toString();
    }

    public void setGenre(String genre) {
        this.genre = Genres.valueOf(genre);
    }

    public String getRelease_Date() {
        return Release_Date;
    }

    public void setRelease_Date(String release_Date) {
        Release_Date = release_Date;
    }

    public int getNum_episodes() {
        return num_episodes;
    }

    public void setNum_episodes(int num_episodes) {
        this.num_episodes = num_episodes;
    }
}
