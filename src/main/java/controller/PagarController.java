package controller;

import dao.PagarDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PagarModel;

public class PagarController implements GenericController<PagarModel> {
    PagarDAO pagardao;

    public PagarController() throws SQLException {
        pagardao = new PagarDAO();
    }
    @Override
    public void incluir(PagarModel obj) throws Exception{
        pagardao.incluir(obj);
    }

    @Override
    public void alterar(PagarModel obj) throws Exception{
        pagardao.alterar(obj);
    }

    @Override
    public void excluir(PagarModel obj) throws Exception{
        pagardao.excluir(obj);
    }

    @Override
    public ArrayList<PagarModel> consultar(String filtro) {
        return pagardao.consultar(filtro);
    }

    @Override
    public void gravar(PagarModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }
} 