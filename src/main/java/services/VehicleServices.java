package services;

import interfaces.Speakers;
import interfaces.Tires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    private Tires tires;

    @Autowired
    private Speakers speakers;

    public void playMusic(){
        String music = speakers.playMusic();
        System.out.println(music);

    }

    public void moveVehicle(){
       String rotate = tires.rotate();
       System.out.println("rotate");

    }

    public Speakers getSpeakers() {
        return speakers;
    }


    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }
}
