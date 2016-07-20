package com.bluelinelabs.logansquare.demo.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonObject
public class Response {

    @JsonField
    public List<User> users;

    @JsonField
    public String status;

    @SerializedName("is_real_json") // Annotation needed for GSON
    @JsonField(name = "is_real_json")
    public boolean is_real_json;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean is_real_json() {
        return is_real_json;
    }

    public void setIs_real_json(boolean is_real_json) {
        this.is_real_json = is_real_json;
    }
}
