package com.muteas.Entity;

public class Ogrenci {
    private int id;
    private String isim;
    private  String soyisim;

    public Ogrenci(int id, String isim, String soyisim) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }
}
