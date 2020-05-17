package com.muteas.Conroller;

import com.muteas.Entity.Ogrenci;
import com.muteas.Service.OgrenciServis;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/sinif")
public class OgrenciKontrol {
    @Autowired
    private OgrenciServis ogrenciServis;


    @RequestMapping(method = RequestMethod.GET)
    public Collection<Ogrenci> SinifiAl(){
        return ogrenciServis.SinifiAl();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Ogrenci idOgrenciAl(@PathVariable("id")int id){
        return ogrenciServis.idOgrenciAl(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void idOgrenciSil(@PathVariable("id")int id){
        ogrenciServis.idOgrenciSil(id);
    }
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void idOgrenciSil(@RequestBody Ogrenci ogrenci){
        ogrenciServis.idOgrenciGuncelleme(ogrenci);
    }
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void idOgrenciEkleme(@RequestBody Ogrenci ogrenci){
        ogrenciServis.idOgrenciEkleme(ogrenci);
    }


}
