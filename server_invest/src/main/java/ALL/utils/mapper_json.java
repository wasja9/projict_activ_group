package ALL.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

public class mapper_json {
//Сереализация
    public String Serialization_in_ISON(Object T) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(T);
        return json;
    }
//Десерелизация
    public Object deSerialization_in_CLASS(String JSON_str,Object T) throws IOException {
        StringReader RD = new StringReader(JSON_str);
        ObjectMapper mapper = new ObjectMapper();
        Object t = T;
        return mapper.readValue(RD, T.getClass());
    }


}
