/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class ColaLote {
    private Nodo<LoteUnico> p;
    private Nodo<LoteUnico> u;
    
    public ColaLote(){
        p=null;
        u=null;
    }
    
    public void calcularEntrada(Movimiento mov){
        LoteUnico lote = new LoteUnico(mov.getCantidad(), mov.getValorU());
        lote.calcularTotal();
        encolar(lote);
    }
    
    public void calcularSalida(Movimiento mov){
        if(mov.getCantidad()<frente().getCantidad()){
            frente().calcularSalida(mov);
        }else{
            mov.setCantidad(mov.getCantidad()-frente().getCantidad());
            desencolar();
            frente().calcularSalida(mov);
        }
    }
    
    public void encolar(LoteUnico valor){
        Nodo<LoteUnico> nuevo = new Nodo<>(valor,null);
        if(!esVacia()){
            u.setSgte(nuevo);
        }else{
            p=nuevo;
        }
        u=nuevo;
    }
    
    public LoteUnico desencolar(){
        LoteUnico x = p.getInfo();
        p = p.getSgte();
        if(p==null)
            u=null;
        return x;
    }

    public boolean esVacia() {
        return p==null;
    }
    
    public LoteUnico frente(){
        return p.getInfo();
    }    
    
    public void clear(){
        while(p!=null)
            p=p.getSgte();
        u=null;
    }
    
    public void mostrar(DefaultTableModel modelo,Movimiento mov){
        modelo.setRowCount(0);
        modelo.setColumnIdentifiers(new String[]{"Operación","Cant.","Valor","Total","Cant L.","Valor L.","Total L."});
        modelo.addRow(new Object[]{
            mov.getTipo(),
            mov.getCantidad(),
            
        });
    }
    
    public void mostrar(DefaultTableModel modelo,Movimiento mov,LoteUnico lote){
        modelo.setRowCount(0);
        modelo.addRow(new Object[]{"",""});
    }
}
