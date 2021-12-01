package dev.jocey.test_randomusers.model.entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Info implements Serializable {
    @SerializedName("page")
    private String page;
    @SerializedName("results")
    private String results;
    @SerializedName("seed")
    private String seed;
    @SerializedName("version")
    private String version;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
