package com.trinm.project2.dao;

import com.trinm.project2.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/


@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User save(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
//        currentSession.save(user);
        Serializable id = currentSession.save(user);
        if (id != null) {
            return currentSession.get(User.class, id);
        } else {
            return null;
        }
    }

    @Override
    public User getById(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(User.class, id);

//        Query<User> query = currentSession.createQuery("FROM User u WHERE u.id = :id", User.class);
//        query.setParameter("id", id);
//        return query.uniqueResult();


//        User user = currentSession.get(User.class, id);
//        User user = currentSession.byId(User.class).load(id);
//        return user;
    }

    @Override
    public User getByUserName(String userName, String password) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<User> query = currentSession.createQuery("FROM User P WHERE P.userName = :userName AND P.password = :password", User.class);
        query.setParameter("userName", userName);
        query.setParameter("password", password);
        return query.uniqueResult();

    }

    @Override
    public List<User> getAllUser() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> root = cq.from(User.class);
        cq.select(root);
        javax.persistence.Query query = session.createQuery(cq);
        query.setMaxResults(10);
        return query.getResultList();
    }

    @Override
    public void update(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.update(user);
    }

    @Override
    public void deleteUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.byId(User.class).load(id);
        session.delete(user);
    }

    @Override
    public List<User> getUserByColumn(String column, String text, int entries) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM User U WHERE U." + column + " LIKE :searchText";
        Query<User> query = session.createQuery(hql, User.class);
        query.setParameter("searchText", "%" + text + "%");
        if (entries != 1) {
            query.setMaxResults(entries);
        }
        List<User> users = query.list();
        return users;
    }

    @Override
    public String[] getColumnNames() {
        ClassMetadata metadata = sessionFactory.getClassMetadata(User.class);
        if (metadata != null) {
            return metadata.getPropertyNames();
        } else {
            return null;
        }
    }

}