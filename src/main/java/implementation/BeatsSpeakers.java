package implementation;

import interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BeatsSpeakers implements Speakers {



    public String playMusic() {
        return "Playing musing from Bose Speakers!";
    }
}
