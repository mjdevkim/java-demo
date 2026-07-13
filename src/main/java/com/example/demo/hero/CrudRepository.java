package com.example.demo.hero;

public interface CrudRepository<T> {
    // CRUD
    default void create(T entity) { throw new RuntimeException("Implement createHero()"); }
    default T read(String name) {
        throw new RuntimeException("Implement readHero()");
    }
    default T update(T entity) {
        throw new RuntimeException("Implement updateHero()");
    }
    default void delete(String name) {
        throw new RuntimeException("Implement deleteHero()");
    }
}
