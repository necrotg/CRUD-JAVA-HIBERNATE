package dao;

import java.util.ArrayList;
import model.PagarModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class PagarDAO implements GenericDao<PagarModel> {

    @Override
    public void incluir(PagarModel pagar) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(pagar);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(PagarModel pagar) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(pagar);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<PagarModel> consultar(String filtro) {
        String sql = "from " + PagarModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<PagarModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(PagarModel pagar) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(pagar);
        t.commit();
        session.close();
    }

    @Override
    public PagarModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (PagarModel) session.load(PagarModel.class, id);
    }
}

