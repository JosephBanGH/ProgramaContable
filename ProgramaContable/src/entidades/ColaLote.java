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
            Movimiento temp = new Movimiento(true,0,0);
            temp.setCantidad(mov.getCantidad()-frente().getCantidad());
            desencolar();
            calcularSalida(temp);
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
        if(p.getInfo()==null)
            return new LoteUnico(0,0);
        return p.getInfo();
    }    
    
    public void clear(){
        while(p!=null)
            p=p.getSgte();
        u=null;
    }
    
    public void mostrar(DefaultTableModel modelo){
        Nodo<LoteUnico> x=p.getSgte();
        while(x!=null){
            modelo.addRow(new Object[]{
                "","","","",
                x.getInfo().getCantidad(),
                x.getInfo().getValorU(),
                x.getInfo().getTotal()
            });
            x=x.getSgte();
        }
    }
    
    public double calcularTotal(){
        Nodo<LoteUnico> x = p;
        double suma = 0;
        while(x!=null){
            suma = suma + x.getInfo().getTotal();
            x=x.getSgte();
        }
        return suma;
    }
}
