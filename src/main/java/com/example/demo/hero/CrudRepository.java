package com.example.demo.hero;

public interface CrudRepository<K, V> {
    // 영웅 이름을 기반으로 영웅을 찾아서 반환합니다
    V findByKey(K key);
    // Failfast : 잘못된 상황에서 뭘 하려고하지 말고 바로 에러를 발생시켜
    // Failover : 잘못된 상황에서 수평적인 다른 대안으로 대체 실행해 = 90% 성능 -> 90% 성능 대체 : 수평적
    // Fallback : 잘못된 상황에서 수직적으로 구린 대안으로 대체 실행해 = 90% 성능 -> 10% 성능 대체 : 수직적
    // - default = Fallback : 인터페이스의 추상메서드를 따로 구현하지 않았을때 실행할 "구린" 대체재
    default void create(V entity) {
        throw new RuntimeException("create 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }
    default V update(V entity) {
        throw new RuntimeException("update 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }
    default void delete(K key) {
        throw new RuntimeException("delete 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }
}
