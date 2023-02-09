/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minibanco;

/**
 *
 * @author aluno
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void abrirConta(int nc, String st, String sd, float ss) {
        
    }
    
    public void fecharConta() {
        
    }
    
    public void depositar() {
        
    }
    
    public void sacar() {
        
    }
    
    public void pagarMensal(){
        
    }
    
    public int getnumConta() {
        return this.numConta;
    }
    
    public void setnumConta(int nc){
        this.numConta = nc;
    }
    
    public String tipo(){
        return this.tipo;
    }
    
    public void setTipo(String st) {
        this.tipo = st;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String gd) {
        this.dono = gd;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(float ss) {
        this.saldo = ss;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean sss) {
        this.status = sss;
    }
    
    public void infoConta() {
        System.out.println("Informações refente a conta " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        if (status == true) {
            System.out.println("Status da conta: Ativada");
        } else {
            System.out.println("Status da conta: Desativada");
        }
    }
}
