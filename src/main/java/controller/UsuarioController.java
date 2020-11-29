package controller;

import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.UsuarioModel;

public class UsuarioController implements GenericController<UsuarioModel> {
    UsuarioDAO usuariodao;

    public UsuarioController() throws SQLException {
        usuariodao = new UsuarioDAO();
    }

    @Override
    public void incluir(UsuarioModel obj) throws Exception{
        usuariodao.incluir(obj);
    }

    @Override
    public void alterar(UsuarioModel obj) throws Exception{
        usuariodao.alterar(obj);
    }

    @Override
    public void excluir(UsuarioModel obj) throws Exception{
        usuariodao.excluir(obj);
    }

    @Override
    public ArrayList<UsuarioModel> consultar(String filtro) {
        return usuariodao.consultar(filtro);
    }

    @Override
    public void gravar(UsuarioModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }
}
