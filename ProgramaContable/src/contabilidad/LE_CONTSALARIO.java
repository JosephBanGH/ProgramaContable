/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabilidad;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andy Terrones Rosas
 */
public class LE_CONTSALARIO {
    private CONTSALARIO L;
    
    public LE_CONTSALARIO(){
        L = null;
    }
    public boolean esVacio(){
        return L == null;
    }
    
   public void mostrarTabla(DefaultTableModel tablaSalario){
        CONTSALARIO p = L;
        tablaSalario.setRowCount(0);
        tablaSalario.setColumnIdentifiers(new String[]{"DNI","NOMBRE","FECHA INGRESO","CARGO","ASIGNACIÓN FAMILIAR","HORAS EXTRAS","MONTO","REMUNERACIÓN BRUTA","ONP","APORTE AFP","COMISIÓN","PRIMA SEGUROS","DESCUENTOS","NETO A PAGAR","APORTE ESSALUD","SEGURO DE VIDA"});
        while(p != null){
            Object[] fila = {
                p.getDNI(),
                p.getNombre(),
                p.formatoFechaIngreso(),
                p.getCargo(),
                p.getAsignacionfam(),
                p.getHorasextras(),
                p.getMontocalc(),
                p.getRemuneracionbruta(),
                p.getOnp(),
                p.getAporteafp(),
                p.getComision(),
                p.getPrimaseguros(),
                p.getDescuentos(),
                p.getNetopagar(),
                p.getAportessalud(),
                p.getSegurovida()
            };
            tablaSalario.addRow(fila);
            p = p.getSgte();
        }
    }
   
    public int convertirADíasdeManeraGeneral(CONTSALARIO p){
        return p.getAño()*365+p.getMes()*30+p.getDia();
    }
    
    
    
}
