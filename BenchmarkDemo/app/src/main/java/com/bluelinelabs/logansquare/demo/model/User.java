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
    public boolean is_active;

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

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public boolean is_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Integer> getRange() {
        return range;
    }

    public void setRange(List<Integer> range) {
        this.range = range;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getFavorite_fruit() {
        return favorite_fruit;
    }

    public void setFavorite_fruit(String favorite_fruit) {
        this.favorite_fruit = favorite_fruit;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
