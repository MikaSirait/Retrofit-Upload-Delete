package com.e.uts_aplikasi_krs;

import com.google.gson.annotations.SerializedName;

class DataDosen {


    public String getNama()
    {
        return getNama();
    }

    public String getNidn()
    {
        return getNidn();
    }

    static class DataDosenn{

        /*


         */
        @SerializedName("id")
        private int id;

        @SerializedName("nama")
        private String nama;

        @SerializedName("nidn")
        private String nidn;

        @SerializedName("alamat")
        private String alamat;

        @SerializedName("email")
        private String email;

        @SerializedName("gelar")
        private String gelar;

        @SerializedName("foto")
        private String foto;


    }
}
