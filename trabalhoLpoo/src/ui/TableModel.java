/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import entidades.Cliente;
import static java.lang.Float.parseFloat;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class TableModel extends javax.swing.table.AbstractTableModel implements Comparable{
    private List<Cliente> clientes;
    
    public TableModel(List<Cliente> values) {
        this.clientes = values;
    }
    
    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Nome";
            case 1:
                return "Sobrenome";
            case 2:
                return "RG";
            case 3:
                return "CPF";
            case 4:
                return "Endereço";
            case 5:
                return "Salário";
            default:
                return "";
        }
    }
    
    
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if( rowIndex >= clientes.size() ) {
            return null;
        }
        
        Cliente cliente = clientes.get(rowIndex);
        switch( columnIndex ) {
            case 0: return cliente.nome;
            case 1: return cliente.sobrenome;
            case 2: return cliente.getRg();
            case 3: return cliente.getCpf();
            case 4: return cliente.endereco;
            case 5: return cliente.salario;
        }
        return null;
    }
    
    public Cliente getValueAtRow(int rowIndex) {
        if( rowIndex >= clientes.size() ) {
            return null;
        }
        
        Cliente cliente = clientes.get(rowIndex);
        return cliente;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        switch( columnIndex ) {
            case 0:
                cliente.setNome(aValue.toString()); 
                break;
            case 1: 
                cliente.setSobrenome(aValue.toString());                
                break;
            case 2:
                cliente.setRg(aValue.toString());   
                break;
            case 3:
                cliente.setCpf(aValue.toString());  
                break;
            case 4:
                cliente.setEndereco(aValue.toString());  
                break;
            case 5:
                cliente.setSalario(aValue.toString());
                break;
        }
    }
    
    public void removeRow(int linha, int linhaLista) {
        this.clientes.remove(linhaLista);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    @Override
    public int compareTo(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
