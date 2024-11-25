package ca.gbc.comp3074.restaurantguide.database;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.List;

@Entity
public class Restaurant {
    @PrimaryKey(autoGenerate = true) // Enable automatic ID generation by Room
    private int id;
    private String restaurantName;
    private String address;
    private String phone;
    private String description;

    @TypeConverters(TagsConverter.class)
    private List<String> tags;

    private int rating; // Field for storing restaurant rating (default: 0)

    // Full Constructor for Room
    public Restaurant(int id, String restaurantName, String address, String phone, String description, List<String> tags, int rating) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.address = address;
        this.phone = phone;
        this.description = description;
        this.tags = tags;
        this.rating = rating;
    }

    // Simplified Constructor for Manual Use
    @Ignore
    public Restaurant(String restaurantName, String address, String phone, String description, List<String> tags, int rating) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.phone = phone;
        this.description = description;
        this.tags = tags;
        this.rating = rating;
    }

    // Default constructor for Room or general use
    @Ignore
    public Restaurant() {
        this.rating = 0; // Default rating
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", restaurantName='" + restaurantName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", rating=" + rating +
                '}';
    }
}
