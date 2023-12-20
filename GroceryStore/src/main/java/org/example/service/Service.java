package org.example.service;

import java.util.List;
import java.util.Optional;

public interface Service<T,B> {

    public T Create(T model);
    public T Get(B id);
    public List<T> GetAll();
    public Boolean Delete(B id);
    public T Update(int id, T model);
}
