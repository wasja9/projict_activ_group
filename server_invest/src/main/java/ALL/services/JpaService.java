package ALL.services;

//import  com.fasterxml.jackson.databind.ObjectMapper
//import  com.
import com.fasterxml.jackson.databind.ObjectMapper;

import ALL.models.users;
import ALL.dao.JpaDAO;

import java.util.*;

public class JpaService {


    public users get(long id) throws Exception {

        //ObjectMapper mapper = new ObjectMapper();
        //String json = mapper.writeValueAsString( serializableObject );

        return  new JpaDAO().get((long) 1).orElse(null);
    }

    public List<users> getAll() throws Exception {
        return new JpaDAO().getAll();
    }

    /*
    public long save(User user) {
        userDAO.save(user);
        long id = getAll().size();
        return id;
    }

    public void update(User user) {
        userDAO.update(user);
    }

    public void delete(long userId) {
        userDAO.delete(userId);
    }
    */

}
