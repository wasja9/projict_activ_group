package ALL.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class clan {

    private long id;     // id клана
    private String name; // имя клана
    private int gold;    // текущее количество золота в казне клана

}