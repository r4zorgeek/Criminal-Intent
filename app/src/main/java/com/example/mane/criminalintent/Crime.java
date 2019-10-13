package com.example.mane.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by mane on 12/02/18.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Boolean mSolved = false;

    public Crime() {
    // Generate Unique Identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    // Getters and Setters
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return  mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Boolean getSolved() {
        return mSolved;
    }

    public void setSolved(Boolean solved) {
        mSolved = solved;
    }

}
