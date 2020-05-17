package com.muteas.Bilgi;

import com.muteas.Entity.Ogrenci;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class OgrenciBilgi {
    private static Map<Integer, Ogrenci> sinif;
    static {
        sinif= new HashMap<Integer, Ogrenci>(){
            {
                put(1,new Ogrenci(1,"James","Granger"));
                put(2,new Ogrenci(2,"Hakeem","Bradley"));
                put(3,new Ogrenci(3,"Jean","Rainbow"));
            }
        };
    }

    private OgrenciBilgi ogrenciBilgi;

    public Collection<Ogrenci> SinifiAl(){
        return sinif.values();
    }

    public Ogrenci idOgrenciAl(int id){
        return sinif.get(id);
    }

    public void idOgrenciSil(int id) {
        sinif.remove(id);
    }
    public void idOgrenciGuncelleme(Ogrenci ogrenci){
        Ogrenci s=sinif.get(ogrenci.getId());
        s.setSoyisim(ogrenci.getSoyisim());
        s.setIsim(ogrenci.getIsim());
        sinif.put(ogrenci.getId(),ogrenci);
    }

    public void idOgrenciEkleme(Ogrenci ogrenci) {
        sinif.put(ogrenci.getId(),ogrenci);
    }
}
