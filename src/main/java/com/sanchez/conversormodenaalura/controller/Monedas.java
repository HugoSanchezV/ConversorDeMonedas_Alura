package com.sanchez.conversormodenaalura.controller;

/**
 *
 * @author Hugo Sánchez Velázquez
 */
public enum Monedas {
    USD("USD", 1.00, "MXN", 18.85),
    EUR("EUR", 1.00, "MXN", 20.14),
    GBP("GBP", 1.00, "MXN", 23.00),
    MXN("MXN", 1.00, "MXN", 1.00),
    JPY("JPY", 1.00, "MXN", 0.14),
    KRW("KRW", 1.00, "MXN", 0.014);
    
    private final String nombre;
    private final double tipoDeCambio;
    private final String monedaEquivalente;
    private final double tipoDeCambioEquivalente;

    private Monedas(String nombre, double tipoDeCambio,
            String monedaEquivalente, double tipoDeCambioEquivalente) {
        this.nombre = nombre;
        this.tipoDeCambio = tipoDeCambio;
        this.monedaEquivalente = monedaEquivalente;
        this.tipoDeCambioEquivalente = tipoDeCambioEquivalente;
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getTipoDeCambio() {
        return tipoDeCambio;
    }
    
    public String getMonedaEquivalente() {
        return monedaEquivalente;
    }
    
    public double getTipoDeCambioEquivalente() {
        return tipoDeCambioEquivalente;
    }
}
