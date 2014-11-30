package com.example.user.mytestcountries;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by User on 29.11.2014.
 */
public class CountryList {
    @SerializedName("result") private ArrayList<Country> mCountries;

    public CountryList(ArrayList<Country> mCountries) {
        this.mCountries = mCountries;
    }

    public CountryList() {

    }

    public ArrayList<Country> getmCountries() {
        return mCountries;
    }

    public void setmCountries(ArrayList<Country> mCountries) {
        this.mCountries = mCountries;
    }
}
