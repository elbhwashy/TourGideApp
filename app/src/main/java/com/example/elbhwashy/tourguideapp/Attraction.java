package com.example.elbhwashy.tourguideapp;

/**
 * Created by elbhwashy on 9/29/2017.
 */

public class Attraction {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAttractionname;
    private int mRatingText;


    private int mClassification;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /* constructor */
    public Attraction(int ImageresourceId, int AttractionName,   int RatingText, int Classification){
        mImageResourceId = ImageresourceId;
        mAttractionname = AttractionName;
        mRatingText = RatingText;
        mClassification = Classification;
    }
    public int getmImageResourceId(){
        return mImageResourceId;
    }
    public int getmAttractionname(){
    return mAttractionname;
    }
    /*public int getmRateImageResourceId(){
        return mRateImageResourceId;
    }*/
    public int getmClassification(){
        return mClassification;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
   /* public boolean hasRateImage() {
        return mRateImageResourceId != NO_IMAGE_PROVIDED;
    }*/
public  int getmRatingText(){
    return mRatingText;
}

}
