package implementation;

import interfaces.Tires;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContinentalTires implements Tires {

    public String rotate() {
        return "Continental Tires are rotating!!";
    }
}
