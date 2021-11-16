/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import utils.Validator;


/**
 *
 * @author Vitor
 */
public class DataController {
    private List<Cliente> clientes = new ArrayList<>();
    private List<ContaInvestimento> contasInvestimento = new ArrayList<>();
    private List<ContaCorrente> contasCorrente = new ArrayList<>();
    private boolean tudoDeletado = false;
    
    private static DataController INSTANCE = null;
    
    public boolean getClientByCPF(String cpf) {
        for(Cliente client : clientes){
            if (client.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }

    public boolean isTudoDeletado() {
        return tudoDeletado;
    }

    public void setTudoDeletado(boolean tudoDeletado) {
        this.tudoDeletado = tudoDeletado;
    }
    
    public void setContasCorrente(List<ContaCorrente> contas){
        this.contasCorrente = contas;
    }
    
    public boolean createNewContaCorrente(ContaCorrente conta){
        try{
            this.contasCorrente.add(conta);
            return true;
        } catch(Exception e) {
           return false;
        }
    }
    
    public void setContasInvestimento(List<ContaInvestimento> contas){
        this.contasInvestimento = contas;
    }
    
    public boolean createNewContaInvestimento(ContaInvestimento conta){
        try{
            this.contasInvestimento.add(conta);
                return true;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "asdasd", "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public ContaInvestimento getInvestimentAccountByCPF(String cpf){
        for(ContaInvestimento account : contasInvestimento) {
            if(account.getDono().getCpf().equals(cpf)){
                return account;
            }
        }
        return null;
    }
    
    public ContaCorrente getSalaryAccountByCPF(String cpf){
        for(ContaCorrente account : contasCorrente) {
            if(account.getDono().getCpf().equals(cpf)){
                return account;
            }
        }
        return null;
    }
    
    public boolean insertClient(Cliente cliente) {
        if(getClientByCPF(cliente.getCpf()) == true ){
            return true;
        }
        clientes.add(cliente);
        return false;
    }
    
    // criando os clientes iniciais
    public DataController() {
        
    }
    
    public static DataController getInstance() {
        if( INSTANCE == null ) {
            synchronized(DataController.class) {
                if( INSTANCE == null ) {
                    INSTANCE = new DataController();
                }
            }
        }
        return INSTANCE;
    }
    
    public void setClientes(List<Cliente> listaNova) {
        clientes = listaNova;
    }
    
    public List<Cliente> getClientesList() {
        if( this.clientes.isEmpty() && !tudoDeletado) {
            Cliente cliente = new Cliente("Julio Márcio", "da Rosa", "238756944", "64631365900", "Avenida Jaime Canet 83", "2000");
            this.clientes.add(cliente);
            cliente = new Cliente("Felipe Pietro", "Fogaça", "287825966", "04092791968", "Avenida Jaime Canet 83", "4000");
            this.clientes.add(cliente);
            cliente = new Cliente("Augusto Cauã", "Rocha", "302130433", "25879422925", "Avenida Jaime Canet 83", "2000");
            this.clientes.add(cliente);
            cliente = new Cliente("Elias Davi", "Santos", "141691141", "50908567960", "Avenida Jaime Canet 83", "1000");
            this.clientes.add(cliente);
            cliente = new Cliente("Anderson Breno", "Cardoso", "397299369", "43498440900", "Avenida Jaime Canet 83", "7000");
            this.clientes.add(cliente);
        }
        return this.clientes;
    }
    
    public List<ContaInvestimento> getContaInvestimentoList() {
        if( this.contasInvestimento.isEmpty() && !tudoDeletado) {
            ContaInvestimento conta = new ContaInvestimento(this.clientes.get(1));
            this.contasInvestimento.add(conta);
            conta = new ContaInvestimento(this.clientes.get(3));
            this.contasInvestimento.add(conta);
        }
        return this.contasInvestimento;
    }
    
    public List<ContaCorrente> getContaCorrenteList() {
        if( this.contasCorrente.isEmpty() && !tudoDeletado) {
            ContaCorrente conta = new ContaCorrente(this.clientes.get(0), 1);
            this.contasCorrente.add(conta);
            conta = new ContaCorrente(this.clientes.get(2), 2);
            this.contasCorrente.add(conta);
        }
        return this.contasCorrente;
    }
    
}
