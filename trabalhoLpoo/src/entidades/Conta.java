/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import interfaces.*;

/**
 *
 * @author Vitor
 */
public class Conta implements ContaI {
    private double saldo;
    private Cliente donoConta;
    private int numeroConta;
    
    public Conta(Cliente donoConta, int numeroConta) {
        this.numeroConta = numeroConta;
        this.donoConta = donoConta;
    }
    
    @Override
    public double getSaldo() {
        return this.saldo;
    }
    
    @Override
    public boolean deposita(double valor) {
        if (valor <= 0){
            return false;
        }
        this.saldo = valor + this.saldo;
        return true;
    }

    @Override
    public boolean saca(double valor) {
        if (valor <= 0){
            return false;
        }
        
        if (valor > this.saldo) {
            return false;
        }
        this.saldo = this.saldo - valor;
        return true;
    }

    @Override
    public Cliente getDono() {
        return this.donoConta;
    }

    @Override
    public int getNumero() {
        return this.numeroConta;
    }

    @Override
    public void remunera() {
        this.saldo = this.saldo * 1.02;
    }
    
}
