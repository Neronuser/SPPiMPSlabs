package lab1.creational;

import java.util.ArrayList;

public class Army {
    public ArrayList<Aviation> aviationTeams = new ArrayList<>();
    public ArrayList<SubmarineForces> submarineTeams = new ArrayList<>();
    public ArrayList<TankForces> tankTeams = new ArrayList<>();

    public void getInfo() {
        for (Aviation aviation : aviationTeams) {
            aviation.getInfo();
        }
        for (SubmarineForces submarine : submarineTeams) {
            submarine.getInfo();
        }
        for (TankForces tank : tankTeams) {
            tank.getInfo();
        }
    }
}
