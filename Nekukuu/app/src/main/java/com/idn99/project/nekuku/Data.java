package com.idn99.project.nekuku;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Data implements Parcelable {
    private int gambarData;
    private String judulData;
    private String musimData;
    private String deskripsiData;
    private String sinopsisData;
    private ArrayList<Karakter> karakters;

    public Data(int gambarData, String judulData, String musimData, String deskripsiData, String sinopsisData, ArrayList<Karakter> karakters) {
        this.gambarData = gambarData;
        this.judulData = judulData;
        this.musimData = musimData;
        this.deskripsiData = deskripsiData;
        this.sinopsisData = sinopsisData;
        this.karakters = karakters;
    }


    public ArrayList<Karakter> getKarakters() {
        return karakters;
    }

    public int getGambarData() {
        return gambarData;
    }

    public String getJudulData() {
        return judulData;
    }

    public String getMusimData() {
        return musimData;
    }

    public String getDeskripsiData() {
        return deskripsiData;
    }

    public String getSinopsisData() {
        return sinopsisData;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.gambarData);
        dest.writeString(this.judulData);
        dest.writeString(this.musimData);
        dest.writeString(this.deskripsiData);
        dest.writeString(this.sinopsisData);
        dest.writeTypedList(this.karakters);
    }

    protected Data(Parcel in) {
        this.gambarData = in.readInt();
        this.judulData = in.readString();
        this.musimData = in.readString();
        this.deskripsiData = in.readString();
        this.sinopsisData = in.readString();
        this.karakters = in.createTypedArrayList(Karakter.CREATOR);
    }

    public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel source) {
            return new Data(source);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };
}
