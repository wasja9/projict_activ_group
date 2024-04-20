package ALL.utils;

import com.auth0.jwt.JWT;
import java.util.Date;
import java.util.UUID;
import com.auth0.jwt.algorithms.Algorithm;;
import com.auth0.jwt.*;

/**
 * Created by nvl on 20.04.2024.
 */
public class generate_token {
    public String generate(){
        //System.out.println("create TOKEN!!!!");
        String token = "";
        try {
            Algorithm algorithm = Algorithm.HMAC256("baeldung");
            token = JWT.create()
                    .withIssuer("Baeldung")//издатель токена
                    .withSubject("Baeldung Details")//субъект, которому выдан токен;
                    .withClaim("userId", "1234")
                    .withIssuedAt(new Date())//время, в которое был выдан токен;
                    .withExpiresAt(new Date(System.currentTimeMillis() + 5000L))//время, когда токен станет невалидным;
                    .withJWTId(UUID.randomUUID().toString())//Генерирует уникальный шеснадцатеричный код типо ключа винды
                    .withNotBefore(new Date(System.currentTimeMillis() + 1000L))//время, с которого токен должен считаться
                    .sign(algorithm);//Похоже на кодировку с ключом
            // }
        } catch (Exception ex) {System.out.println("Error create exeption"); }
        System.out.println("time create token:" + new Date());
        System.out.println("time create token:" + System.currentTimeMillis());
        //System.out.println(token);
        //System.out.println("end token!!!!");

        return UUID.randomUUID().toString();//Создаем целый токен, отдаем только уникальный номер, для простоты
    }
}
