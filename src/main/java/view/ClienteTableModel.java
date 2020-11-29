package view;

import model.ClienteModel;
import model.EnderecoModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel {

    private ArrayList<ClienteModel> linhasCli;
    
    String[] colunasCli;    
    
    public ClienteTableModel(ArrayList<ClienteModel> arraycliente, String[] colunas) {
        this.colunasCli = colunas;
        linhasCli = arraycliente;        
    }

    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunasCli.length;
    }

    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamnho da lista
    @Override
    public int getRowCount() {
        return linhasCli.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunasCli[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        ClienteModel cliente = (ClienteModel) linhasCli.get(row);
        
        switch (col) {
            case 0:
                return cliente.getCLI_ID();
            case 1:
                return cliente.getCLI_NOME();
            case 2:
                return cliente.getCLI_CPF();
            case 3:
                return cliente.getCLI_EMAIL();
            case 4:
                return cliente.getCLI_DDD();  
            case 5:
                return cliente.getCLI_TELEFONE();             
                
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de ClienteModel
    public void addLista(ArrayList<ClienteModel> cliente, ArrayList<EnderecoModel> endereco) {
        int tamanhoAntigo = getRowCount();

        
        linhasCli.addAll(cliente);
        

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
} 
   

