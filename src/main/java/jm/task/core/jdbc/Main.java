package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UsersEntity;
import jm.task.core.jdbc.util.HibernateSessionFactory;
import org.hibernate.Session;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setName("Aleks");
        usersEntity.setLastName("Petrenko");
        usersEntity.setAge(25);
        session.save(usersEntity);
        session.getTransaction().commit();
        session.close();
    }
}
