package controller;

import dao.FornecedorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FornecedorModel;

public class FornecedorController implements GenericController<FornecedorModel> {
        FornecedorDAO fornecedordao;

    public FornecedorController() throws SQLException {
        fornecedordao = new FornecedorDAO();
    }

    @Override
    public void incluir(FornecedorModel obj) throws Exception{
        fornecedordao.incluir(obj);
    }

    @Override
    public void alterar(FornecedorModel obj) throws Exception{
        fornecedordao.alterar(obj);
    }

    @Override
    public void excluir(FornecedorModel obj) throws Exception{
        fornecedordao.excluir(obj);
    }

    @Override
    public ArrayList<FornecedorModel> consultar(String filtro) {
        return fornecedordao.consultar(filtro);
    }

    @Override
    public void gravar(FornecedorModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }
} 