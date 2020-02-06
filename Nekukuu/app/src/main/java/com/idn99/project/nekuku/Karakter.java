package com.idn99.project.nekuku;

import android.os.Parcel;
import android.os.Parcelable;

class Karakter implements Parcelable {
    private int gambarKarakter;
    private String namaKarakter;

    public Karakter(int gambarKarakter, String namaKarakter) {
        this.gambarKarakter = gambarKarakter;
        this.namaKarakter = namaKarakter;
    }

    public int getGambarKarakter() {
        return gambarKarakter;
    }

    public String getNamaKarakter() {
        return namaKarakter;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.gambarKarakter);
        dest.writeString(this.namaKarakter);
    }

    protected Karakter(Parcel in) {
        this.gambarKarakter = in.readInt();
        this.namaKarakter = in.readString();
    }

    public static final Parcelable.Creator<Karakter> CREATOR = new Parcelable.Creator<Karakter>() {
        @Override
        public Karakter createFromParcel(Parcel source) {
            return new Karakter(source);
        }

        @Override
        public Karakter[] newArray(int size) {
            return new Karakter[size];
        }
    };
}
