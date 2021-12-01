package dev.jocey.test_randomusers.model.entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Street implements Serializable {

    @SerializedName("number")
    private String number;
    @SerializedName("name")
    private String name;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
