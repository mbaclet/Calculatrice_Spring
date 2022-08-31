package fr.m2i.firstspringproject.service;

import fr.m2i.firstspringproject.model.CalculatriceModel;
import fr.m2i.firstspringproject.truc.Calculatrice;
import fr.m2i.firstspringproject.utils.OperationEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class SaisieService {

    private CalculatriceModel cm = new CalculatriceModel();

    public SaisieService(){

    }

    public int askSaisie() throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entrez un entier : ");
        this.cm.setFirstArg(Integer.parseInt(buff.readLine()));
        System.out.println("Entrez un entier : ");
        this.cm.setSecondArg(Integer.parseInt(buff.readLine()));

        System.out.println("Choisissez une option (ADDITION,SOUSTRACTION ,DIVISION, MULTIPLICATION: ");
        switch (buff.readLine()) {
            case "ADDITION" ->
                    this.cm.setResult(Calculatrice.addition(this.cm.getFirstArg(),
                            this.cm.getSecondArg()));
            case "SOUSTRACTION" ->
                    this.cm.setResult(Calculatrice.soustraction(this.cm.getFirstArg(), this.cm.getSecondArg()));
            case "MULTIPLICATION" ->
                    this.cm.setResult(Calculatrice.multiplication(this.cm.getFirstArg(), this.cm.getSecondArg()));
            case "DIVISION" ->
                    this.cm.setResult(Calculatrice.division(this.cm.getFirstArg(), this.cm.getSecondArg()));
        }
        return this.cm.getResult();

    }


}
