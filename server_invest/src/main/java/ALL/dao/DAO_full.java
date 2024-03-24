package ALL.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface DAO_full<T, K> {

    Optional<T> get(K id) throws SQLException;

    List<T> getAll() throws SQLException;

    void save(T t) throws SQLException;

    void update(T t) throws SQLException;

    void delete(K id) throws SQLException;
}