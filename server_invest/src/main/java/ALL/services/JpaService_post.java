package ALL.services;

import com.fasterxml.jackson.databind.ObjectMapper;

import ALL.dao.JpaDAO_post;
import ALL.models.post;
import ALL.utils.mapper_json;

import java.util.List;
import java.io.*;

import javax.transaction.*;

public class JpaService_post {

//=======================get=======================================================================

    public post get(long id) throws Exception {
        //Transaction tr = new Transaction();
        return  new JpaDAO_post().get(id).orElse(null);
    }

//=======================delete=======================================================================
    public List<post> getAll() throws Exception {
        return new JpaDAO_post().getAll();
    }

//=======================save=======================================================================
    public void save(String json_str) throws Exception {
        //StringReader RD = new StringReader(json_str);
        //ObjectMapper mapper = new ObjectMapper();
        //post postMP = mapper.readValue(RD, post.class);
        post postMP =(post) new mapper_json().deSerialization_in_CLASS(json_str,new post());
        new JpaDAO_post().save(postMP);
    }

//=======================update=======================================================================
    public void update(String json_str) throws Exception {
        //StringReader RD = new StringReader(json_str);
        //ObjectMapper mapper = new ObjectMapper();
        //post postMP = mapper.readValue(RD, post.class);
        post postMP =(post) new mapper_json().deSerialization_in_CLASS(json_str,new post());
        new JpaDAO_post().update(postMP);
    }

//=======================delete=======================================================================
    public void delete(long id) throws Exception {
        new JpaDAO_post().delete(id);
    }

}
