package dao;

import java.util.ArrayList;
import model.ReceberModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class ReceberDAO implements GenericDao<ReceberModel> {

    @Override
    public void incluir(ReceberModel receber) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(receber);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(ReceberModel receber) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(receber);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<ReceberModel> consultar(String filtro) {
        String sql = "from " + ReceberModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<ReceberModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(ReceberModel receber) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(receber);
        t.commit();
        session.close();
    }

    @Override
    public ReceberModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (ReceberModel) session.load(ReceberModel.class, id);
    }

}