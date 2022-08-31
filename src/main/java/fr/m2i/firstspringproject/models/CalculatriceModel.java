package fr.m2i.firstspringproject.models;

public class CalculatriceModel {

    private int firstArg;
    private int secondArg;
    private String operationType;
    private int result;

    public CalculatriceModel(){

    }

    public CalculatriceModel(int firstArg, int secondArg, String operationType, int result) {
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

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
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
