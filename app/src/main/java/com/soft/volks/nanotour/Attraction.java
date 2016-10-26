package com.soft.volks.nanotour;

/**
 * Created by nkarayev on 10/26/16.
 */

public class Attraction {

    private String mName;
    private String mAddress;
    private String mDesc;


    public Attraction() {
    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public int getmPhotoId() {
        return mPhotoId;
    }

    public void setmPhotoId(int mPhotoId) {
        this.mPhotoId = mPhotoId;
    }

    private int mPhotoId;



}
