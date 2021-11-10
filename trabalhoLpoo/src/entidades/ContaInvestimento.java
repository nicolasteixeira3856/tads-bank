/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


/**
 *
 * @author Vitor
 */
public class ContaInvestimento extends Conta {
    public double depositoMinimo = 1000;
    public double montanteMinimo = 1000;
    public String tipo = "ContaInvestimento";
    
    public ContaInvestimento(Cliente donoConta){
        super(donoConta, 0);
    }
    
    public ContaInvestimento(Cliente donoConta, int numeroConta, double depositoInicial, double depositoMinimo, double montanteMinimo){
        super(donoConta, numeroConta, depositoInicial);
        this.depositoMinimo = depositoMinimo;
        this.montanteMinimo = montanteMinimo;
    }
    
    @Override
    public boolean deposita(double valor) {
        if(valor >= depositoMinimo){
            return super.deposita(valor);
        }
        return false;
    }
    
    @Override
    public boolean saca(double valor) {
        double saldo = this.getSaldo();
        saldo = saldo - valor;
        if(saldo < montanteMinimo){
            return false;
        }
        return super.saca(valor);
    }
    
    @Override
    public void remunera(){
        super.remunera();
    }
}
