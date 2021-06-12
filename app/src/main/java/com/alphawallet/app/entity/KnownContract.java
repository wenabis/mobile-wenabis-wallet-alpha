package com.alphawallet.app.entity;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KnownContract {

    @SerializedName("MainNet")
    @Expose
    private List<UnknownToken> mainNet = null;

    @SerializedName("Binance")
    @Expose
    private List<UnknownToken> Binance = null;

    public List<UnknownToken> getMainNet() {
        return mainNet;
    }

    public List<UnknownToken> getBinance() {
        return Binance;
    }
}