/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncuentabancaria;

/**
 *
 * @author alumno
 */
public class CuentaBancaria {
    
   private String nombre;
   private String codCuenta;
   private int saldo;

    public CuentaBancaria() {
        this.nombre="";
        this.codCuenta="";
        this.saldo=0;     
    }
    
     public CuentaBancaria(String nombre) {
        this.nombre = nombre;
        this.codCuenta = "";
        this.saldo = 0;
    }

    public CuentaBancaria(String nombre, String codCuenta, int saldo) {
        this.nombre = nombre;
        this.codCuenta = codCuenta;
        this.saldo = saldo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codCuenta
     */
    public String getCodCuenta() {
        return codCuenta;
    }

    /**
     * @param codCuenta the codCuenta to set
     */
    public void setCodCuenta(String codCuenta) {
        this.codCuenta = codCuenta;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void comprobarTitular(){
        boolean bandera=true;
        
        do
        if(nombre.length()>10){
            System.out.println("Titular introducido");
            bandera=false;
        }else{
            System.out.println("El nombre excede el maximo permitido");   
            break;
            CuentaBancaria c = new CuentaBancaria(leer.nextLine());
        }while(bandera=true);
    }
   
   
   
    
    
}
