package ALL.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@JsonAutoDetect
public class users {

    private int id;
    private String firstname;
    private String lastname;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}