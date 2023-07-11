package org.example;

public class Posto {
    private final Double GASOLINA_1L = 3.50;
    private final Double ALCOOL_1L = 2.90;
    private final Double DIESEL_1L = 3.00;
    private Double saldoFinalGasolina;
    private Double saldoFinalAlcool;
    private Double saldoFinalDiesel;
    private Double custoGasolina;
    private Double custoAlcool;
    private Double custoDiesel;

    public Posto(Double saldoFinalGasolina, Double saldoFinalAlcool, Double saldoFinalDiesel, Double custoGasolina,
                 Double custoAlcool, Double custoDiesel) {
        this.saldoFinalGasolina = saldoFinalGasolina;
        this.saldoFinalAlcool = saldoFinalAlcool;
        this.saldoFinalDiesel = saldoFinalDiesel;
        this.custoGasolina = custoGasolina;
        this.custoAlcool = custoAlcool;
        this.custoDiesel = custoDiesel;
    }

    public Double getSaldoFinalGasolina() {
        return saldoFinalGasolina;
    }

    public void setSaldoFinalGasolina(Double saldoFinalGasolina) {
        this.saldoFinalGasolina = saldoFinalGasolina;
    }

    public Double getSaldoFinalAlcool() {
        return saldoFinalAlcool;
    }

    public void setSaldoFinalAlcool(Double saldoFinalAlcool) {
        this.saldoFinalAlcool = saldoFinalAlcool;
    }

    public Double getsaldoFinalDiesel() {
        return saldoFinalDiesel;
    }

    public void setsaldoFinalDiesel(Double saldoFinalDiesel) {
        this.saldoFinalDiesel = saldoFinalDiesel;
    }

    public Double getCustoGasolina() {
        return custoGasolina;
    }

    public void setCustoGasolina(Double custoGasolina) {
        this.custoGasolina = custoGasolina;
    }

    public Double getCustoAlcool() {
        return custoAlcool;
    }

    public void setCustoAlcool(Double custoAlcool) {
        this.custoAlcool = custoAlcool;
    }

    public Double getCustoDiesel() {
        return custoDiesel;
    }

    public void setCustoDiesel(Double custoDiesel) {
        this.custoDiesel = custoDiesel;
    }

    public void addGasolina(Double gastoGasolina){
        this.saldoFinalGasolina += gastoGasolina;
    }

    public void addAlcool(Double gastoAlcool){
        this.saldoFinalAlcool += gastoAlcool;
    }

    public void addDiesel(Double gastoDiesel){
        this.saldoFinalDiesel += gastoDiesel;
    }

    public void custoGeralGasolina(){
        this.custoGasolina += this.saldoFinalGasolina / GASOLINA_1L;
    }

    public void custoGeralAlcool(){
        this.custoAlcool += this.saldoFinalAlcool / ALCOOL_1L;
    }

    public void custoGeralDiesel(){
        this.custoDiesel += this.saldoFinalDiesel / DIESEL_1L;
    }

    public String toString(){
        return "\n GASOLINA: "
                + "\n Total vendas (R$): " + getSaldoFinalGasolina()
                + "\n Custo da gasolina (R$): "+ getCustoGasolina()
                + "\n Lucro (R$): " + (getSaldoFinalGasolina() - getCustoGasolina())
                + "\n"
                + "\n ALCOOL: "
                + "\n Total vendas (R$): " + getSaldoFinalAlcool()
                + "\n Custo da gasolina (R$): "+ getCustoAlcool()
                + "\n Lucro (R$): " + (getSaldoFinalAlcool() - getCustoAlcool())
                + "\n"
                + "\n DIESEL: "
                + "\n Total vendas (R$): " + getsaldoFinalDiesel()
                + "\n Custo da gasolina (R$): "+ getCustoDiesel()
                + "\n Lucro (R$): " + (getsaldoFinalDiesel() - getCustoDiesel());

    }


}
