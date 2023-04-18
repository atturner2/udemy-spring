package implementation;

import interfaces.Tires;
import org.springframework.stereotype.Component;

@Component
public class MichelinTires implements Tires {

    public String rotate() {
        return "Michelin Tires are rotating!";
    }
}
