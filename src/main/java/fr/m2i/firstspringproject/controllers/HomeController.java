package fr.m2i.firstspringproject.controllers;

import fr.m2i.firstspringproject.models.CalculatriceModel;
import fr.m2i.firstspringproject.models.User;
import fr.m2i.firstspringproject.services.SaisieService;
import fr.m2i.firstspringproject.trucs.Calculatrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(
            name="sayhello",
            value="/addpost",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.TEXT_PLAIN_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public String AddPost(@RequestBody Iterable<CalculatriceModel> calcules){

        StringBuilder result = new StringBuilder();
        for(CalculatriceModel calcul:calcules){
            result.append(calcul.getFirstArg()+"+"+ calcul.getSecondArg()+"="+saisieService.askSaisie(calcul.getFirstArg(), calcul.getSecondArg(), "ADDITION")+", ");
        }
        return String.format("%s", result.toString());
    }

    @PostMapping(
            name="sayhello",
            value="/sayhellopost",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.TEXT_PLAIN_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public String SayHelloPost(@RequestBody Iterable<User> users){

        StringBuilder result = new StringBuilder();
        for(User user:users){
            result.append(user.getNom()+" "+ user.getPrenom()+", ");
        }
        return String.format("Bonjour à %s", result.toString());
    }
}
