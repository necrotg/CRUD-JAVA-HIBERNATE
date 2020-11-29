package dao;

import java.util.ArrayList;
import model.EnderecoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class EnderecoDAO {
    
    public void incluir(EnderecoModel endereco) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(endereco);
        t.commit();
        session.close();
    }

    
    public void alterar(EnderecoModel endereco) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(endereco);
        t.commit();
        session.close();
    }

    
    public ArrayList<EnderecoModel> consultar() {
        String sql = "SELECT E.ENDERECO_ID, E.ENDERECO_LOGRADOURO FROM EnderecoModel E" ;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<EnderecoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }


    public void excluir(EnderecoModel endereco) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(endereco);
        t.commit();
        session.close();
    }

    
    public EnderecoModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (EnderecoModel) session.load(EnderecoModel.class, id);
    }
}
