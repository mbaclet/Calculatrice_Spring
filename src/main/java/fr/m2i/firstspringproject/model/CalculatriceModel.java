package fr.m2i.firstspringproject.model;

import fr.m2i.firstspringproject.utils.OperationEnum;

public class CalculatriceModel {

    private int firstArg;
    private int secondArg;
    private OperationEnum operationType;
    private int result;

    public CalculatriceModel(){

    }

    public CalculatriceModel(int firstArg, int secondArg, OperationEnum operationType, int result) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.operationType = operationType;
        this.result = result;
    }

    public int getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(int firstArg) {
        this.firstArg = firstArg;
    }

    public int getSecondArg() {
        return secondArg;
    }

    public void setSecondArg(int secondArg) {
        this.secondArg = secondArg;
    }

    public OperationEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationEnum operationType) {
        this.operationType = operationType;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

   // public CalculatriceModel getCalculatriceModel() {
   //     return this;
    //}
}
