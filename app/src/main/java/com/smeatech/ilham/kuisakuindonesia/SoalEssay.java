package com.smeatech.ilham.kuisakuindonesia;

public class SoalEssay {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "tanggal berapa Hari sumpah pemuda ?",
            "icon terkenal di malang ...",
            "tanggal tersebut merayakan hari nasional apa",
            "Ibu kota jawa timur saat ini adalah ...",
            "Lapis Tugu makanan Khas daerah mana ?",
            "yang menjadi julukan kota wisata.",
            "nama makanan diatas",
            "nama minuman diatas",
            "yang kita pelajari sekarang mata kuliah apa?",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "oktober",
            "tugumalang",
            "kartini",
            "surabaya",
            "petamalang",
            "petabatu",
            "bakso",
            "es jeruk",
            "android",
    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "28 oktober",
            "tugu kota malang",
            "21 april",
            "surabaya",
            "malang",
            "batu",
            "bakso",
            "es jeruk",
            "android",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
