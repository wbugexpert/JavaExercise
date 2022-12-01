package com.jianbao.homework.tableCrud.orm;

import java.util.List;

public interface BaseORM<T>{
    public boolean add();
    public boolean update();
    public boolean remove();
    public T get();
    public List<T> find();
}
