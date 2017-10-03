package com.hy.po;

public class Floor {
    private Integer floorid;

    private String floornumber;

    private Integer numberplies;

    private String floorname;

    public Integer getFloorid() {
        return floorid;
    }

    public void setFloorid(Integer floorid) {
        this.floorid = floorid;
    }

    public String getFloornumber() {
        return floornumber;
    }

    public void setFloornumber(String floornumber) {
        this.floornumber = floornumber == null ? null : floornumber.trim();
    }

    public Integer getNumberplies() {
        return numberplies;
    }

    public void setNumberplies(Integer numberplies) {
        this.numberplies = numberplies;
    }

    public String getFloorname() {
        return floorname;
    }

    public void setFloorname(String floorname) {
        this.floorname = floorname == null ? null : floorname.trim();
    }
}