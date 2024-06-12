/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabilidad;

/**
 *
 * @author Sistemas
 */
public class CONTSALARIO {
    private String DNI;
    private String nombre;
    private int dia;
    private int mes;
    private int año;
    private String cargo;
    private double sueldo;
    private double asignacionfam;
    private int horasextras;
    private double porcmonto;
    private double montocalc;
    private double remuneracionbruta;
    private double onp;
    private int afp;
    private double aporteafp;
    private double comision;
    private double primaseguros;
    private double descuentos;
    private double netopagar;
    private double aportessalud;
    private double segurovida; 
    private CONTSALARIO sgte;

    public CONTSALARIO(String DNI, String nombre, int dia, int mes, int año, String cargo, double sueldo, int horasextras, double porcmonto, double montocalc, double remuneracionbruta, double onp, int afp, double aporteafp, double comision, double primaseguros, double descuentos, double netopagar, double aportessalud, double segurovida) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.horasextras = horasextras;
        this.porcmonto = porcmonto;
        this.montocalc = montocalc;
        this.remuneracionbruta = remuneracionbruta;
        this.onp = onp;
        this.afp = afp;
        this.aporteafp = aporteafp;
        this.comision = comision;
        this.primaseguros = primaseguros;
        this.descuentos = descuentos;
        this.netopagar = netopagar;
        this.aportessalud = aportessalud;
        this.segurovida = segurovida;
        this.sgte=null;
    }

    public CONTSALARIO(String DNI, String nombre, int dia, int mes, int año, String cargo, double sueldo, int horasextras, double porcmonto, double montocalc, double remuneracionbruta, double onp, int afp, double aporteafp, double comision, double primaseguros, double descuentos, double netopagar, double aportessalud, double segurovida, CONTSALARIO sgte) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.horasextras = horasextras;
        this.porcmonto = porcmonto;
        this.montocalc = montocalc;
        this.remuneracionbruta = remuneracionbruta;
        this.onp = onp;
        this.afp = afp;
        this.aporteafp = aporteafp;
        this.comision = comision;
        this.primaseguros = primaseguros;
        this.descuentos = descuentos;
        this.netopagar = netopagar;
        this.aportessalud = aportessalud;
        this.segurovida = segurovida;
        this.sgte = sgte;
    }
    

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getAsignacionfam() {
        return asignacionfam;
    }

    public void setAsignacionfam(double asignacionfam) {
        this.asignacionfam = asignacionfam;
    }

    public int getHorasextras() {
        return horasextras;
    }

    public void setHorasextras(int horasextras) {
        this.horasextras = horasextras;
    }

    public double getPorcmonto() {
        return porcmonto;
    }

    public void setPorcmonto(double porcmonto) {
        this.porcmonto = porcmonto;
    }

    public double getMontocalc() {
        return montocalc;
    }

    public void setMontocalc(double montocalc) {
        this.montocalc = montocalc;
    }

    public double getRemuneracionbruta() {
        return remuneracionbruta;
    }

    public void setRemuneracionbruta(double remuneracionbruta) {
        this.remuneracionbruta = remuneracionbruta;
    }

    public double getOnp() {
        return onp;
    }

    public void setOnp(double onp) {
        this.onp = onp;
    }

    public int getAfp() {
        return afp;
    }

    public void setAfp(int afp) {
        this.afp = afp;
    }

    public double getAporteafp() {
        return aporteafp;
    }

    public void setAporteafp(double aporteafp) {
        this.aporteafp = aporteafp;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getPrimaseguros() {
        return primaseguros;
    }

    public void setPrimaseguros(double primaseguros) {
        this.primaseguros = primaseguros;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getNetopagar() {
        return netopagar;
    }

    public void setNetopagar(double netopagar) {
        this.netopagar = netopagar;
    }

    public double getAportessalud() {
        return aportessalud;
    }

    public void setAportessalud(double aportessalud) {
        this.aportessalud = aportessalud;
    }

    public double getSegurovida() {
        return segurovida;
    }

    public void setSegurovida(double segurovida) {
        this.segurovida = segurovida;
    }

    public CONTSALARIO getSgte() {
        return sgte;
    }

    public void setSgte(CONTSALARIO sgte) {
        this.sgte = sgte;
    }
    
    
    public String formatoFechaIngreso(){
        return String.format("%02d/%02d/%04d", dia, mes, año);
    }
    
  
    
    
}
