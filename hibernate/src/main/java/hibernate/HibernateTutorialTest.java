package hibernate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateTutorialTest {
 
    public static void main(String[] args) {
 
    	Configuration config=new Configuration();
        config.configure();
        System.out.println(config);
        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();
        System.out.println(session);
        User s=new User(1,"Mark","Johnson");
        Transaction t=session.beginTransaction();
        session.save(s);
        t.commit();
    	//session.close();
    	System.out.println(listUsers(session));
    	
    		
		
    }
     
    
     
    private static List<User> listUsers(Session session)
    {
    	Transaction tx = null;
        List<User> users = new ArrayList();
        try{
            tx = session.beginTransaction();
            users = (List)session.createQuery("From User").list();
            tx.commit();
        } catch(HibernateException e) {
            e.printStackTrace();
        } finally {
        	session.close();
        }
         
        return users;
    }
}
