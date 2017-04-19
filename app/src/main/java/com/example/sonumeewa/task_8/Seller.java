package com.example.sonumeewa.task_8;

import java.util.ArrayList;

/**
 * Created by sonumeewa on 4/19/2017.
 */

public class Seller {
    public Seller(String name, String distance,String city, String type,String category ){
        mDistance=distance;
        mName=name;
        mCity=city;
        mType=type;
        mCategory=category;
    }
    private String mName;
    private String mDistance;
    private String mCity="";
    private String mType="";
    private String mCategory="";

    public String getName(){
        return mName;
    }
    public String getDistance(){
        return mDistance;
    }
    public String getCity(){return mCity;}
    public String getType() {return mType;}
    public String getCategory(){return mCategory;}
}
