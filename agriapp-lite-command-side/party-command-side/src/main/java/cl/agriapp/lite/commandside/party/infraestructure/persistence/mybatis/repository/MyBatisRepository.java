package cl.agriapp.lite.commandside.party.infraestructure.persistence.mybatis.repository;

import java.util.List;

public interface MyBatisRepository<T> {	

	void add(T item);

    void add(Iterable<T> items);

    void update(T item);

    void remove(T item);

    void remove(MyBatisSpecification specification);

    List<T> query(MyBatisSpecification specification);
}
