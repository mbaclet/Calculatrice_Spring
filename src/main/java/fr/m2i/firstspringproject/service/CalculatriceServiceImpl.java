package fr.m2i.firstspringproject.service;

import fr.m2i.firstspringproject.model.CalculatriceModel;
import fr.m2i.firstspringproject.truc.Calculatrice;

public class CalculatriceServiceImpl implements CalculatriceService {

    private Calculatrice calculatrice;
    private CalculatriceModel calculatriceModel;

    public CalculatriceServiceImpl(Calculatrice calculatrice, CalculatriceModel calculatriceModel) {
        this.calculatrice = calculatrice;
        this.calculatriceModel = calculatriceModel;
    }

    @Override
    public CalculatriceModel getTrouDuc() {

        switch (calculatriceModel.getOperationType()) {
            case ADDITION ->
                    this.calculatriceModel.setResult(this.calculatrice.addition(this.calculatriceModel.getFirstArg(), this.calculatriceModel.getSecondArg()));
            case SOUSTRACTION ->
                    this.calculatriceModel.setResult(this.calculatrice.soustraction(this.calculatriceModel.getFirstArg(), this.calculatriceModel.getSecondArg()));
            case MULTIPLICATION ->
                    this.calculatriceModel.setResult(this.calculatrice.multiplication(this.calculatriceModel.getFirstArg(), this.calculatriceModel.getSecondArg()));
            case DIVISION ->
                    this.calculatriceModel.setResult(this.calculatrice.division(this.calculatriceModel.getFirstArg(), this.calculatriceModel.getSecondArg()));
        }
        return this.calculatriceModel;
    }
}
