package controller;

import dao.ClienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteModel;

public class ClienteController  {
    ClienteDAO clientedao;

    public ClienteController() throws SQLException {
        clientedao = new ClienteDAO();
    }
    
    public void incluir(ClienteModel obj) throws Exception{
        clientedao.incluir(obj);
    }

    
    public void alterar(ClienteModel obj) throws Exception{
        clientedao.alterar(obj);
    }

    
    public void excluir(ClienteModel obj) throws Exception{
        clientedao.excluir(obj);
    }

    
    public ArrayList<ClienteModel> consultar() {
        return clientedao.consultar();
    }

    
    public void gravar(ClienteModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }

}