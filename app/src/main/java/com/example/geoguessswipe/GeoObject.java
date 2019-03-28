package com.example.geoguessswipe;

public class GeoObject {
    private String geoName;
    private int mGeoImageName;
    private Boolean inEurope;

    public GeoObject(String geoName, int mGeoImageName, Boolean inEurope) {
        this.geoName = geoName;
        this.mGeoImageName = mGeoImageName;
        this.inEurope = inEurope;
    }

    public String mGetGeoName() {
        return geoName;
    }

    public void setGeoName(String geoName) {
        this.geoName = geoName;
    }

    public int getmGeoImageName() {
        return mGeoImageName;
    }

    public void setGeoImageName(int geoImageName) {
        this.mGeoImageName = geoImageName;
    }

    public Boolean getInEurope() {
        return inEurope;
    }

    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }

    public static final String[] PRE_DEFINED_GEO_OBJECT_NAMES = {
            "Denmark",
            "Canada",
            "Bangladesh",
            "Kazakhstan",
            "Colombia",
            "Poland",
            "Malta",
            "Thailand"
    };

    public static final int[] PRE_DEFINED_GEO_OBJECT_IMAGE_IDS = {
            R.drawable.img1_yes_denmark,
            R.drawable.img2_no_canada,
            R.drawable.img3_no_bangladesh,
            R.drawable.img4_yes_kazachstan,
            R.drawable.img5_no_colombia,
            R.drawable.img6_yes_poland,
            R.drawable.img7_yes_malta,
            R.drawable.img8_no_thailand
    };

    public static final Boolean[] PRE_DEFINED_GEO_OBJECT_ANSWERS = {
            true,
            false,
            false,
            true,
            false,
            true,
            true,
            false
    };
}
