package com.example.api.service.impl;

import com.example.api.service.BaseSevice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/2/2023, Thu
 **/

@Service
@Slf4j
public abstract class AbstractBaseSevice<T> implements BaseSevice<T> {
    @PersistenceContext
    private EntityManager entityManager;

    public abstract JpaRepository setBaseService();

    @Override
    public T insert(T value) {
        return this.saveOrUpdate(value);
    }

    @Override
    public boolean update(T value) {
        return saveOrUpdate(value) != null;
    }

    private T saveOrUpdate(T value) {
        try {
            JpaRepository repository = setBaseService();
            //save or update
            T obj = (T) repository.save(value);
            return obj;
        } catch (Exception e) {
//            log.error("Error when insert or update", e);
        }
        return null;
    }

    @Override
    public void delete(T value) {
        try {
            JpaRepository repository = setBaseService();
            //delete
            repository.delete(value);

        } catch (Exception e) {
//            log.error("Error when delete", e);
        }
    }

    @Override
    public T getById(Object id) {
        try {
            JpaRepository repository = setBaseService();
            //delete
            repository.getById(id);

        } catch (Exception e) {
//            log.error("Error when get", e);
        }
        return null;
    }

    @Override
    public List<T> getInfo(Class<T> clazz, String sql, Map<String, Object> params) {
        // define initial
//        TypedQuery<T> query = entityManager.createQuery(sql, clazz);
//        // set parameters
//        if (!params.isEmpty()) {
//            for (Map.Entry<String, Object> entry : params.entrySet()) {
//                query.setParameter(entry.getKey(), entry.getValue());
//            }
//        }
//
//        return query.getResultList();
        return null;
    }
}
