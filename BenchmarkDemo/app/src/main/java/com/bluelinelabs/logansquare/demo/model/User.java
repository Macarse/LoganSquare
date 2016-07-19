package com.bluelinelabs.logansquare.demo.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonObject
public class User {

    @SerializedName("_id") // Annotation needed for GSON
    @JsonField(name = "_id")
    public String _id;

    @JsonField
    public int index;

    @JsonField
    public String guid;

    @SerializedName("is_active") // Annotation needed for GSON
    @JsonField(name = "is_active")
    public boolean is_Active;

    @JsonField
    public String balance;

    @SerializedName("picture") // Annotation needed for GSON
    @JsonField(name = "picture")
    public String picture;

    @JsonField
    public int age;

    @JsonField
    public Name name;

    @JsonField
    public String company;

    @JsonField
    public String email;

    @JsonField
    public String address;

    @JsonField
    public String about;

    @JsonField
    public String registered;

    @JsonField
    public double latitude;

    @JsonField
    public double longitude;

    @JsonField
    public List<String> tags;

    @JsonField
    public List<Integer> range;

    @JsonField
    public List<Friend> friends;

    @JsonField
    public List<Image> images;

    @JsonField
    public String greeting;

    @SerializedName("favorite_fruit") // Annotation needed for GSON
    @JsonField(name = "favorite_fruit")
    public String favorite_fruit;

    @SerializedName("eye_color") // Annotation needed for GSON
    @JsonField(name = "eye_color")
    public String eye_color;

    @JsonField
    public String phone;
}
