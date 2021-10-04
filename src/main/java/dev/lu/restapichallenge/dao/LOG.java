package dev.lu.restapichallenge.dao;
import java.util.Optional;
public interface LOG <T>{

    Optional<T> get(T t);
}
