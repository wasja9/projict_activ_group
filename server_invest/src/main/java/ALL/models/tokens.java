package ALL.models;

    import lombok.*;
    import lombok.Data;
    import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class tokens {

    private int id;
    private int id_us;
    private String token;
    private Date date;

}
