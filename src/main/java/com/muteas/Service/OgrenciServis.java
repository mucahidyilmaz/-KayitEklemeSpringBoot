 package com.muteas.Service;

import com.muteas.Bilgi.OgrenciBilgi;
import com.muteas.Entity.Ogrenci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.Collection;

@Service
public class OgrenciServis {
    @Autowired
    private OgrenciBilgi ogrenciBilgi;

    public Collection<Ogrenci> SinifiAl(){
        return this.ogrenciBilgi.SinifiAl();
    }
    public Ogrenci idOgrenciAl(int id){
        return  this.ogrenciBilgi.idOgrenciAl(id);
    }
    public void idOgrenciSil(int id) {
        this.ogrenciBilgi.idOgrenciSil(id);
    }

    public void idOgrenciGuncelleme(Ogrenci ogrenci){
        this.ogrenciBilgi.idOgrenciGuncelleme(ogrenci);
    }
    public void idOgrenciEkleme(Ogrenci ogrenci) {
        this.ogrenciBilgi.idOgrenciEkleme(ogrenci);
    }

}
