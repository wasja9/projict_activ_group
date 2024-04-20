package ALL.models;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/**
 * Created by nvl on 06.03.2024.
 *
 * SELECT TOP 1000 [userId]
 ,[id]
 ,[title]
 ,[body]
 FROM [invest_nv].[dbo].[post]
 */
public class post {
    //public post(){};

    public long userId;
    public long id;
    public String title;
    public String body;

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

}
