package com.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flycompany on 2016/3/29 14:05.
 * E-mail: flycompany@icloud.com
 */
public class FestivalLab {

    public static FestivalLab mInstance;

    private List<Festival> mFestivals = new ArrayList<Festival>();

    private FestivalLab() {
        mFestivals.add(new Festival(1,"国庆节"));
        mFestivals.add(new Festival(2,"中秋节"));
        mFestivals.add(new Festival(3,"元旦"));
        mFestivals.add(new Festival(4,"春节"));
        mFestivals.add(new Festival(5,"端午节"));
        mFestivals.add(new Festival(6,"七夕节"));
        mFestivals.add(new Festival(7,"圣诞节"));
        mFestivals.add(new Festival(8,"儿童节"));
    }

    public List<Festival> getFestivals(){
        return new ArrayList<Festival>(mFestivals);
    }

    public Festival getFestivalById(int fesId){
        for (Festival festival: mFestivals){

        }
        return null;
    }

    public static FestivalLab getmInstance() {
        if (mInstance == null) {
            synchronized (FestivalLab.class) {
                if (mInstance == null)
                    mInstance = new FestivalLab();
            }
        }

        return mInstance;
    }

}
