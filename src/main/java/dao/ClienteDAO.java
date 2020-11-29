package dao;

import java.util.ArrayList;
import model.ClienteModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class ClienteDAO  {

   
    public void incluir(ClienteModel cliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(cliente);
        t.commit();
        session.close();
    }

    
    public void alterar(ClienteModel cliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(cliente);
        t.commit();
        session.close();
    }

    
    public ArrayList<ClienteModel> consultar() {
        String sql = "SELECT C.CLI_ID ,C.CLI_NOME,C.CLI_CPF,C.CLI_EMAIL,C.CLI_DDD,C.CLI_TELEFONE FROM ClienteModel C" ;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<ClienteModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    
    public void excluir(ClienteModel cliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(cliente);
        t.commit();
        session.close();
    }

    
    public ClienteModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (ClienteModel) session.load(ClienteModel.class, id);
    }

}
