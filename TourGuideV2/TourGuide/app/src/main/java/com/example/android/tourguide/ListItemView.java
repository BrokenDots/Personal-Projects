package com.example.android.tourguide;

public class ListItemView {

    private String mtitle;
    private String mOtherInfo;
    private int mImage;

    public ListItemView(String mtitle, String mOtherInfo, int mImage) {
        this.mtitle = mtitle;
        this.mOtherInfo = mOtherInfo;
        this.mImage = mImage;
    }

    public String getMtitle() {
        return mtitle;
    }

    public String getmOtherInfo() {
        return mOtherInfo;
    }

    public int getmImage() {
        return mImage;
    }
}
