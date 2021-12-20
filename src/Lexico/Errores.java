/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lexico;

import codigo.Tokens;

/**
 *
 * @author kamia
 */
public class Errores {
    private final String valor, tipe;
    private final Tokens tipo;
    private final int linea,columna;

    public Errores(String valor, String tipe, Tokens tipo, int linea, int columna) {
        this.valor = valor;
        this.tipe = tipe;
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
    }

    public String getValor() {
        return valor;
    }

    public String getTipe() {
        return tipe;
    }

    public Tokens getTipo() {
        return tipo;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }
    
    
    
}
