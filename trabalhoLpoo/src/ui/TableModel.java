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
public class TableModel extends javax.swing.table.AbstractTableModel{
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
        return 7;
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
            case 2: return cliente.getRG();
            case 3: return cliente.getCPF();
            case 4: return cliente.endereco;
            case 5: return cliente.salario;
        }
        return null;
    }
    
//    @Override
//    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//        Cliente cliente = clientes.get(rowIndex);
//        switch( columnIndex ) {
//            case 0:
//                cliente.setModelo(aValue.toString()); 
//                break;
//            case 1: 
//                cliente.setDescricao(aValue.toString());                
//                break;
//            case 2:
//                break;
//            case 3: 
//                if( aValue instanceof Fabricante ) {
//                    bic.setFabricante((Fabricante)aValue);
//                }
//                break;
//            case 4:
//                bic.setValor(parseFloat(aValue.toString()));
//            case 5: 
//                bic.setEstoque( Integer.parseInt(aValue.toString()));
//        }
//    }
    
}
