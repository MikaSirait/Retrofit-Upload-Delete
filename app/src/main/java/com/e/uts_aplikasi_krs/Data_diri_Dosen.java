package com.e.uts_aplikasi_krs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.annotations.SerializedName;

public class Data_diri_Dosen extends AppCompatActivity {


        @SerializedName("id")
        private String id;
        @SerializedName("nidn")
        private String nidn;
        @SerializedName("namaDosen")
        private String namaDosen;
        @SerializedName("gelar")
        private String gelar;
        @SerializedName("email")
        private String email;
        @SerializedName("alamat")
        private String alamat;
        @SerializedName("foto")
        private String foto;


    }
