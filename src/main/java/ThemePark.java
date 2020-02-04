import attractions.Attraction;
import attractions.Dodgems;
import stalls.CandyflossStall;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }


    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public int getAttractionsCount() {
        return this.attractions.size();
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public int getStallsCount() {
        return this.stalls.size();
    }
}
