package dev.jocey.test_randomusers.model.entities;

import com.google.gson.annotations.SerializedName;

public class Info {
    @SerializedName("page")
    private Integer page;
    @SerializedName("results")
    private Integer results;
    @SerializedName("seed")
    private String seed;
    @SerializedName("version")
    private Double version;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }
}
