package lk.ijse.car_hire.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfiguration {
    private  static SessionFactoryConfiguration sessionFactoryConfiguration;
    private SessionFactory sessionFactory;
     private SessionFactoryConfiguration(){
         Configuration configuration=new Configuration().configure("/hibernate.cfg.xml");
         sessionFactory=configuration.buildSessionFactory();
     }
    public static SessionFactoryConfiguration getInstance(){
         return sessionFactoryConfiguration==null? new SessionFactoryConfiguration():sessionFactoryConfiguration;
    }
    public Session getSession(){
         return sessionFactory.openSession();
    }
}
