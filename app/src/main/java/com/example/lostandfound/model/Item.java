package com.example.lostandfound.model;

// Class Item represents an item in your application.
public class Item {

    // Private member variables
    private int item_id;
    private String name, description, location, date, post_type, phone;

    // Default constructor
    public Item() {
    }

    // Constructor with parameters to initialize an item
    public Item(String name, String description, String location, String date, String post_type, String phone) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.date = date;
        this.post_type = post_type;
        this.phone = phone;
    }

    // Getter for item_id
    public int getItem_id() {
        return item_id;
    }

    // Setter for item_id
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    // Getter for post_type
    public String getPost_type() {
        return post_type;
    }

    // Setter for post_type
    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    // Getter for phone
    public String getPhone() {
        return phone;
    }

    // Setter for phone
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
