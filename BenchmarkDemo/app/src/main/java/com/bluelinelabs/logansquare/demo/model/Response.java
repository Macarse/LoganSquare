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
    public boolean isRealJson;
}
