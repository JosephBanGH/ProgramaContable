/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author LENOV
 */
public class LoteUnico {
    private int cantidad;
    private double valorU;
    private double total;

    public LoteUnico(int cantidad, double valorU) {
        this.cantidad = cantidad;
        this.valorU = valorU;
    }

    public void calcularTotal(){
        total = cantidad*valorU;
    }
    
    public void calcularEntrada(Movimiento mov){
        cantidad = cantidad+mov.getCantidad();
        total = total+mov.calcularTotal();
        valorU = total/cantidad;
    }
    
    public void calcularSalida(Movimiento mov){
        cantidad = cantidad - mov.getCantidad();
        total = cantidad*valorU;
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
    
    public double getTotal(){
        calcularTotal();
        return total;
    } 
}
