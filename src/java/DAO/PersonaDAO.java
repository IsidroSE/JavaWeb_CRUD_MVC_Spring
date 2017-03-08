package DAO;

import Entidad.Persona;
import Utils.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*@author Isidro*/

public class PersonaDAO {
    
    public void insertar_persona(Persona p) {
        
        Session _session = HibernateUtil.getSessionFactory().openSession();
        Transaction trns = null;
        
        try {
            trns = _session.beginTransaction();
            _session.save(p);
            _session.getTransaction().commit();
        }
        catch (Exception e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        }
        finally {
            _session.close();
        }
        
    }
    
    public void editar_persona(Persona p) {
        
        Session _session = HibernateUtil.getSessionFactory().openSession();
        Transaction trns = null;
        
        try {
            trns = _session.beginTransaction();
            _session.update(p);
            _session.getTransaction().commit();
        }
        catch (Exception e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        }
        finally {
            _session.close();
        }
        
    }
    
    public void borrar_persona(Persona p) {
        
        Session _session = HibernateUtil.getSessionFactory().openSession();
        Transaction trns = null;
        
        try {
            trns = _session.beginTransaction();
            _session.delete(p);
            _session.getTransaction().commit();
        }
        catch (Exception e) {
            if (trns != null) {
                trns.rollback();
            }
        }
        finally {
            _session.close();
        }
        
    }
    
    public List<Persona> listar_personas() {
        
        Session _session = HibernateUtil.getSessionFactory().openSession();
        List<Persona> lista_personas = null;
        
        try {
            String _hql = "SELECT p FROM Persona p";
            Query _query = _session.createQuery(_hql);
            lista_personas = _query.list();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            _session.close();
        }
        
        return lista_personas;
    }
    
}
