package fr.m2i.firstspringproject.controllers;

import fr.m2i.firstspringproject.services.SaisieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculatrice")
public class HomeController {

    @Autowired
    SaisieService saisieService;

    @GetMapping(
            name = "calculatriceGet",
            value = "/add"
    )
    public String resultAdd(@RequestParam(value="arg1") final int arg1, @RequestParam(value="arg2") final int arg2)  {
        int res = saisieService.askSaisie(arg1, arg2, "ADDITION");
        
        return String.format("Le résultat de l'addition est : %s.", res);
    }

    @GetMapping(
            name = "calculatriceGet",
            value = "/sub"
    )
    public String resultSub(@RequestParam(value="arg1") final int arg1, @RequestParam(value="arg2") final int arg2){
        int res = saisieService.askSaisie(arg1, arg2, "SOUSTRACTION");

        return String.format("Le résultat de la soustraction est : %s.", res);
    }


    @GetMapping(
            name = "calculatriceGet",
            value = "/div"
    )
    public String resultDiv(@RequestParam(value="arg1") final int arg1, @RequestParam(value="arg2") final int arg2){
        int res = saisieService.askSaisie(arg1, arg2, "DIVISION");

        return String.format("Le résultat de la division est : %s.", res);
    }


    @GetMapping(
            name = "calculatriceGet",
            value = "/mul"
    )
    public String resultMul(@RequestParam(value="arg1") final int arg1, @RequestParam(value="arg2") final int arg2){
        int res = saisieService.askSaisie(arg1, arg2, "MULTIPLICATION");

        return String.format("Le résultat de la multiplication est : %s.", res);
    }
}
