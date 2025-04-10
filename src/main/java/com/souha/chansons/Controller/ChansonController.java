package com.souha.chansons.Controller;

import com.souha.chansons.Service.ChansonService;
import com.souha.chansons.entities.Chanson;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chansons") // Le préfixe pour l’interface web
public class ChansonController {

    @Autowired
    ChansonService chansonService;

    @GetMapping("/ListeChansons")
    public String listeChansons(Model model,
                                @RequestParam(name = "page", defaultValue = "0") int page,
                                @RequestParam(name = "size", defaultValue = "2") int size) {

        if (size <= 0) size = 10;

        Page<Chanson> chans = chansonService.getAllChansonsParPage(page, size);
        model.addAttribute("chansons", chans);
        model.addAttribute("pages", new int[chans.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("size", size);
        model.addAttribute("totalElements", chans.getTotalElements());
        model.addAttribute("totalPages", chans.getTotalPages());

        return "listeChansons";
    }

    @GetMapping("/supprimerChanson")
    public String supprimerChanson(@RequestParam("id") Long id,
                                   @RequestParam("page") int page,
                                   @RequestParam("size") int size) {
        chansonService.deleteChansonById(id);
        return "redirect:/chansons/ListeChansons?page=" + page + "&size=" + size;
    }

    @GetMapping("/")
    public String homeRedirect() {
        return "redirect:/chansons/ListeChansons";
    }

    @RequestMapping("/saveChanson")
    public String saveChanson(@Valid Chanson chanson, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "createChanson";
        chansonService.saveChanson(chanson);
        return "createChanson";
    }
} 
