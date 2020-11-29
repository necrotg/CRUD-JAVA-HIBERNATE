package controller;

import dao.EnderecoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.EnderecoModel;

public class EnderecoController {
    EnderecoDAO enderecodao;

    public EnderecoController() throws SQLException {
        enderecodao = new EnderecoDAO();
    }
    
    public void incluir(EnderecoModel obj) throws Exception{
        enderecodao.incluir(obj);
    }

    
    public void alterar(EnderecoModel obj) throws Exception{
        enderecodao.alterar(obj);
    }

    
    public void excluir(EnderecoModel obj) throws Exception{
        enderecodao.excluir(obj);
    }

    
    public ArrayList<EnderecoModel> consultar() {
        return enderecodao.consultar();
    }

    
    public void gravar(EnderecoModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }

}
