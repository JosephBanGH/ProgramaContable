/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.DefaultListModel;

/**
 *
 * @author USUARIO
 * @param <LoteUnico>
 */
public class Cola<LoteUnico> {
    private Nodo<LoteUnico> p;
    private Nodo<LoteUnico> u;
    
    public Cola(){
        p=null;
        u=null;
    }
    
    public void encolar(LoteUnico valor){
        Nodo<LoteUnico> nuevo = new Nodo<LoteUnico>(valor,null);
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
    
    public void mostrar(DefaultListModel modelo){
        modelo.removeAllElements();
        Nodo<LoteUnico> x = p;
        while(x!=null){
            modelo.addElement(x.getInfo());
            x = x.getSgte();
        }
    }
}
