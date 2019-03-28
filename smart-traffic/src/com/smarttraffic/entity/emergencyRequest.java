package com.smarttraffic.entity;

import com.smarttraffic.pojo.userDetail;

public class emergencyRequest {
    private String id;
    private String userID;
    private String location;
    private String problem;
    private userDetail userDetail;

    public emergencyRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public com.smarttraffic.pojo.userDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(com.smarttraffic.pojo.userDetail userDetail) {
        this.userDetail = userDetail;
    }
}