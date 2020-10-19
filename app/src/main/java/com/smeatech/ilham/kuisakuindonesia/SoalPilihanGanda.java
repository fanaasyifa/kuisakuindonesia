package com.smeatech.ilham.kuisakuindonesia;

public class SoalPilihanGanda {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "tanggal berapa Hari sumpah pemuda ?",
            "icon terkenal di malang ...",
            "tanggal berapa Hari kartini",
            "Ibukotajawa timur saat ini adalah ...",
            "Lapis Tugu makanan Khas daerah mana ?",
            "yang menjadi julukan kota wisata.",
            "yang termasuk makanan",
            "Yang termasuk minuman",
            "yang kita pelajari sekarang mata kuliah apa?",
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"21 April","28 Oktober","21 November"},
            {"tugu kota malang","Lapis tugu","Bakso Malang"},
            {"17 Agustus","24 Mei","21 April"},
            {"Semarang","Surabaya","Jakarta"},
            {"Jepang","Belanda","Malang"},
            {"mojikerto","Kediri","Batu"},
            {"es teh","es jeruk","Bakso"},
            {"es jeruk","nasi padang","bubur"},
            {"Database","Jaringan","android"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "oktober",
            "tugumalang",
            "april",
            "surabaya",
            "petamalang",
            "petabatu",
            "bakso",
            "es jeruk",
            "android",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}