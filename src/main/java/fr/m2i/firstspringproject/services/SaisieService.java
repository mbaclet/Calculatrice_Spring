package fr.m2i.firstspringproject.services;

import fr.m2i.firstspringproject.models.CalculatriceModel;
import fr.m2i.firstspringproject.trucs.Calculatrice;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class SaisieService {

    private CalculatriceModel cm = new CalculatriceModel();

    public SaisieService(){

    }

    public int askSaisie(int arg1, int arg2, String info) {
   //     BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
      //  System.out.println("Entrez un entier : ");
     //   this.cm.setFirstArg(Integer.parseInt(buff.readLine()));
      //  System.out.println("Entrez un entier : ");
      //  this.cm.setSecondArg(Integer.parseInt(buff.readLine()));

      //  System.out.println("Choisissez une option (ADDITION,SOUSTRACTION ,DIVISION, MULTIPLICATION: ");
        switch (info) {
            case "ADDITION" ->
                    this.cm.setResult(Calculatrice.addition(arg1, arg2));
            case "SOUSTRACTION" ->
                    this.cm.setResult(Calculatrice.soustraction(arg1, arg2));
            case "MULTIPLICATION" ->
                    this.cm.setResult(Calculatrice.multiplication(arg1, arg2));
            case "DIVISION" ->
                    this.cm.setResult(Calculatrice.division(arg1, arg2));
        }
        return this.cm.getResult();

    }


}
