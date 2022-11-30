package com.unsyiah.laundry.model.response;

import com.unsyiah.laundry.model.nearby.ModelResults;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelResultNearby {

    @SerializedName("results")
    private List<ModelResults> modelResults;

    public List<ModelResults> getModelResults() {
        return modelResults;
    }

    public void setModelResults(List<ModelResults> modelResults) {
        this.modelResults = modelResults;
    }

}
