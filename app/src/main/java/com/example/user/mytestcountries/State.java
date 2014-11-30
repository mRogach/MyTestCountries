package com.example.user.mytestcountries;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 28.11.2014.
 */
public class State {
    @SerializedName("name")  private String mName;
    @SerializedName("code")  private String mCode;

    public State(String mName, String mCode) {
        this.mName = mName;
        this.mCode = mCode;
    }

    public State() {

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCode() {
        return mCode;
    }

    public void setmCode(String mCode) {
        this.mCode = mCode;
    }
}