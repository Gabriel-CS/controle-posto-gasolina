package org.example;

public class Carro {
    private String placaCarro;
    private Double gastoTotal;

    public Carro(String placaCarro, Double gastoTotal) {
        this.placaCarro = placaCarro;
        this.gastoTotal = gastoTotal;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public Double getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(Double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    public void balancoFinal(Double valorGastoCombustivel){
        this.gastoTotal += valorGastoCombustivel;
    }
}
