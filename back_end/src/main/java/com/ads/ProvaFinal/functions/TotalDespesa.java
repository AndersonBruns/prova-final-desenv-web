package com.ads.ProvaFinal.functions;

public class TotalDespesa {
    private String despesa;
    private double valorTotal;

    public TotalDespesa(String despesa, double valorTotal) {
        this.despesa = despesa;
        this.valorTotal = valorTotal;
    }

    public String getDespesa() {
        return despesa;
    }

    public void setDespesa(String despesa) {
        this.despesa = despesa;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
