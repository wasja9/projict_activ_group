package ALL.dao;

 import java.sql.SQLException;
        import java.util.List;
        import java.util.Optional;

public interface DAO<T, K> {

    Optional<T> get(K id) throws SQLException;

    List<T> getAll() throws SQLException;

    // void save(T t);

    // void update(T t);

    // void delete(K id);
}