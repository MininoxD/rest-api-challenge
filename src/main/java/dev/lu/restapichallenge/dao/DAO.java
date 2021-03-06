package dev.lu.restapichallenge.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    List<T> list();
    void create(T t);
    Optional<T> get(String id);

    void update(T t, String id);

    void delete(String id);

    Optional<T> getExist(String id);
}
