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
public class ListaDobleEmpleados {
    private NodoEmpleado primero;
    private NodoEmpleado ultimo;

    public ListaDobleEmpleados() {
        primero=null;
        ultimo=null;
    }

    public NodoEmpleado getPrimero() {
        return primero;
    }

    public void setPrimero(NodoEmpleado primero) {
        this.primero = primero;
    }

    public NodoEmpleado getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoEmpleado ultimo) {
        this.ultimo = ultimo;
    }
    
    public void insertarAlInicio(Empleado v){
        NodoEmpleado nuevo = new NodoEmpleado(v);
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            nuevo.setSgte(primero);
            primero.setAnt(nuevo);
            primero=nuevo;
        }
    }
    
    public void mostrarAtrasAdelante(DefaultTableModel modelo){
        NodoEmpleado p=primero;
        int i=0;
        modelo.setRowCount(0);
        while(p!=null){
            modelo.addRow(new Object[]{
                p.getInfo().getCodigo(),
                p.getInfo().getNombres(),
                p.getInfo().getApellidos(),
                p.getInfo().getSexo(),
                p.getInfo().getSueldo()
            });
            p=p.getSgte();
            i++;
        }
    }
    
    public void mostrarAdelanteAtras(DefaultTableModel modelo){
        NodoEmpleado p=ultimo;
        int i=0;
        modelo.setRowCount(0);
        while(p!=null){
            modelo.addRow(new Object[]{
               p.getInfo().getCodigo(),
                p.getInfo().getNombres(),
                p.getInfo().getApellidos(),
                p.getInfo().getSexo(),
                p.getInfo().getSueldo() 
            });
            p=p.getAnt();
            i++;
        }
    }
    public NodoEmpleado buscar(String codigo){
        NodoEmpleado p=primero;
        while(p!=null){
            if(p.getInfo().getCodigo().compareTo(codigo)==0)
                return p;
            p=p.getSgte();
        }
        return null;
    }
    
    public boolean eliminar(Empleado empleado){
        if(primero.getInfo()==empleado){
            if(primero.getSgte()==null){
                primero=null;
                ultimo=null;
            }
            else{
                primero=primero.getSgte();
                primero.setAnt(null);
            }
            return true;
        }else{
            NodoEmpleado p=primero.getSgte();
            while(p!=null && p.getInfo()!=empleado)
                p=p.getSgte();
            if(p!=null){
                if(p==ultimo){
                    ultimo=ultimo.getAnt();
                    ultimo.setSgte(null);
                }
                else{
                    p.getAnt().setSgte(p.getSgte());
                    p.getSgte().setAnt(p.getAnt());
                }
                return true;
            }
            else
                return false;
        }
    }
    
    public Empleado getEmpleadoMayor(){
        Empleado mayor;
        NodoEmpleado p=primero;
        mayor=p.getInfo();
        while(p.getSgte()!=null){
            if(mayor.getSueldo()<p.getSgte().getInfo().getSueldo())
                mayor=p.getSgte().getInfo();
            p=p.getSgte();
        }
        return mayor;
    }
    
    private double totalSueldos(NodoEmpleado p){
        if(p==null)
            return 0;
        else
            return p.getInfo().getSueldo()+totalSueldos(p.getAnt());
    }
    
    public double totalSueldos(){
        return totalSueldos(ultimo);
    }
}
