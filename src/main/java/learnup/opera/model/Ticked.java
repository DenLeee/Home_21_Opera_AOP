package learnup.opera.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticked {
    private int id;
    private Premiere premiere;
    private float price;

}
