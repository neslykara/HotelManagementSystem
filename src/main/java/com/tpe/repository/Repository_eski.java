package com.tpe.repository;

import java.util.List;

//7.adım: crud işlemlerini yapan bir depo oluşturalım
public interface Repository_eski<S,U>
{
    //create işlemi
    S save (S object);

    //read işlemi
    S findObjectById(U id);

    //update işlemi
    void update(S object);

    //delete işlemi
    void delete(U id);

    //tüm değerleri listeleyen method
    List<S> findAll();
}
