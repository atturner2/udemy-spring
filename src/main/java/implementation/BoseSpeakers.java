package implementation;

import interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeakers implements Speakers {

    public String playMusic() {
        return "Playing musing from Bose Speakers!";
    }
}
