package com.tpe.repository;

public interface Repository <S,U>
{
    S save (S object);
}
