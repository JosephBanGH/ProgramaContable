/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author LENOV
 */
public class Movimiento {
    private boolean tipo;//entrada 0, salida 1
    private int cantidad;
    private double valorU;

    public Movimiento(boolean tipo, int cantidad, float valorU) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.valorU = valorU;
    }

    public double calcularTotal(){
        return cantidad*valorU;
    }
    
    public boolean isTipo() {
        return tipo;
    }
    
    public String getTipo(){
        return tipo? "Salida":"Entrada";
    }    
    
    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorU() {
        return valorU;
    }

    public void setValorU(double valorU) {
        this.valorU = valorU;
    }
}
