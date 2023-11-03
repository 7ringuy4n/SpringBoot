package com.example.api.service;

import java.util.List;
import java.util.Map;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/2/2023, Thu
 **/


public interface BaseSevice<T> {
    T insert(T value);
    boolean update(T value);

    void delete(T value);

    T getById(Object id);

    List<T> getInfo(Class<T> clazz, String sql, Map<String, Object>  params);
}
