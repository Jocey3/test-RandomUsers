package dev.jocey.test_randomusers.model.entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Response implements Serializable {
    @SerializedName("info")
    private Info info;
    @SerializedName("results")
    private List<User> users;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
