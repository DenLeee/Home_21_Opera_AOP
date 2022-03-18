package learnup.opera.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Premiere {
    private int id;
    private String nameOpera;
    private String description;;
    private int ageCategory;
    private int availableSeats;
}
