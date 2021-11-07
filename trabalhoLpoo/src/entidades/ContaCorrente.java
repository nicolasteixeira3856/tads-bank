/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

//ContaCorrente:
//i. public boolean saca(double valor): Antes de efetuar o saque deve-se verificar se o
//valor sacado não ultrapassa o limite da conta. Ou seja, a conta poderá ficar negativa até o limite
//estipulado na sua criação. Mostrar mensagem na tela informando o usuário.
//ii. public void remunera(): Aplicar remuneração de 1% ao saldo da conta.

/**
 *
 * @author Vitor
 */
public class ContaCorrente extends Conta {
    public String tipo = "ContaCorrente";
    public ContaCorrente(Cliente donoConta, int numeroConta){
        super(donoConta, numeroConta);
    }
    
    @Override
    public boolean saca(double valor) {
        double saldo = this.getSaldo();
        if(valor > saldo){
            return false;
        }
        return super.saca(valor);
    }
    
    @Override
    public void remunera() {
        double saldo = this.getSaldo();
        saldo = saldo * 0.01;
        this.deposita(saldo);
    }
    
}
