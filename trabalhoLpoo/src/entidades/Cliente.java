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
public class Cliente {
    public String nome;
    public String sobrenome;
    private String rg;
    private String cpf;
    public String endereco;
    public String salario;
    
    public Cliente(String nome, String sobrenome, String rg, String cpf, String endereco, String salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }
    
    public String getRG() {
        return this.rg;
    }
    
    public String getCPF() {
        return this.cpf;
    }
    
}
