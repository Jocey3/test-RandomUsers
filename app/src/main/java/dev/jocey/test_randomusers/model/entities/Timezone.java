package dev.jocey.test_randomusers.model.entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Timezone implements Serializable {

    @SerializedName("offset")
    private String offset;
    @SerializedName("description")

    private String description;

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
