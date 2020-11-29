package controller;

import dao.ReceberDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ReceberModel;

public class ReceberController implements GenericController<ReceberModel> {
    ReceberDAO receberdao;

    public ReceberController() throws SQLException {
        receberdao = new ReceberDAO();
    }

    @Override
    public void incluir(ReceberModel obj) throws Exception{
        receberdao.incluir(obj);
    }

    @Override
    public void alterar(ReceberModel obj) throws Exception{
        receberdao.alterar(obj);
    }

    @Override
    public void excluir(ReceberModel obj) throws Exception{
        receberdao.excluir(obj);
    }

    @Override
    public ArrayList<ReceberModel> consultar(String filtro) {
        return receberdao.consultar(filtro);
    }

    @Override
    public void gravar(ReceberModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }

}
