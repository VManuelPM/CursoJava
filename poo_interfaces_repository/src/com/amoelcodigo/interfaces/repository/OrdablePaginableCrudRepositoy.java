package com.amoelcodigo.interfaces.repository;

public interface OrdablePaginableCrudRepositoy<T> extends OrdenableRepository<T>,
        PaginableRepository<T>, CrudRepository<T>, CountRepository{
}
