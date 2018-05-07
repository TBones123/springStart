package ua.com.owu.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.models.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

@Repository


public class UserDao {



//   private EntityManagerFactory entityManagerFactory;


@PersistenceContext
private EntityManager entityManager;


    public UserDao() {
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    //    public EntityManagerFactory getEntityManagerFactory() {
//        return entityManagerFactory;
//    }
//
//    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }
@Transactional
public void save(User user){
//    EntityManager entityManager = entityManagerFactory.createEntityManager();
//    entityManager.getTransaction().begin();
    entityManager.persist(user);
//    entityManager.getTransaction().commit();
//    entityManager.close();
}
}
