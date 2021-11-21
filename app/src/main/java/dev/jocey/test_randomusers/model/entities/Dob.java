package dev.jocey.test_randomusers.model.entities;


import com.google.gson.annotations.SerializedName;

public class Dob {
    @SerializedName("date")
    private String date;
    @SerializedName("age")
    private Integer age;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
