package com.soft.volks.nanotour;

import java.io.Serializable;

/**
 * Created by nkarayev on 10/26/16.
 */

public class Attraction implements Serializable{

    private String mName;
    private String mAddress;
    private String mDesc;
    private int mImgId;


    public Attraction() {
        mName = null;
        mAddress = null;
        mDesc = null;
        mImgId = 0;
    }


    public int getmImgId() {
        return mImgId;
    }

    public void setmImgId(int mImgId) {
        this.mImgId = mImgId;
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
