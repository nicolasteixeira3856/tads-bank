/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import interfaces.*;

//As seguintes regras devem ser implementadas nas respectivas classes conta:
//a. Conta:
//i. public boolean deposita(double valor): o valor depositado deve ser positivo. Caso
//contrário o método retorna false
//ii. public boolean saca(double valor): o valor sacado deve ser positivo. Caso contrário
//o método retorna false. Mostrar mensagem na tela informando usuário.
//b. ContaCorrente:
//i. public boolean saca(double valor): Antes de efetuar o saque deve-se verificar se o
//valor sacado não ultrapassa o limite da conta. Ou seja, a conta poderá ficar negativa até o limite
//estipulado na sua criação. Mostrar mensagem na tela informando o usuário.
//ii. public void remunera(): Aplicar remuneração de 1% ao saldo da conta.
//c. ContaInvestimento:
//i. public boolean deposita(double valor): Recebe como parâmetro o valor a ser
//depositado. Se o valor a ser depositado for maior ou igual ao depositoMinimo então, o
//depósito deve ser efetuado. Para isso chame o método deposita da classe pai (Conta) e
//retorne true. Caso contrário, deve-se retornar false. Mostrar mensagem na tela informando
//usuário.
//ii. public boolean saca(double valor): Recebe como parâmetro o valor a ser
//sacado. Se o novo valor do saldo (considerando o saque) for maior ou igual ao 
//montanteMinimo, o saque deve ser efetuado. Para isso invoque o método saque da classe
//pai (Conta) e retorne true. Caso contrário, deve-se retornar false. Mostrar mensagem na
//tela informando usuário.
//iii. public void remunera(): Aplicar remuneração de 2% ao saldo da conta. 

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
