package com.souha.chansons.restcontrollers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.souha.chansons.entities.Chanson;
import com.souha.chansons.Service.ChansonService;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class ChansonRESTController {

    @Autowired
    ChansonService chansonService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Chanson> getAllChansons() {
        return chansonService.getAllChansons();
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Chanson getChansonById(@PathVariable("id") Long id) {
        return chansonService.getChanson(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Chanson createChanson(@RequestBody Chanson chanson) {
    return chansonService.saveChanson(chanson);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Chanson updateChanson(@RequestBody Chanson chanson) {
    return chansonService.updateChanson(chanson);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id)
    {
    chansonService.deleteChansonById(id);
    }
    @RequestMapping(value = "/chansonscat/{idCat}", method = RequestMethod.GET)
    public List<Chanson> getChansonsByCatId(@PathVariable("idCat") Long idCat) {
        return chansonService.findByCategorieIdCat(idCat);
    }
  
   


}
