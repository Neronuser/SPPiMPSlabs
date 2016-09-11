package lab1.creational;

public class RomanianArmyFactory extends AbstractArmyFactory {

    @Override
    public Aviation createAviation() {
        return new RomanianAviation();
    }

    @Override
    public TankForces createTanks() {
        return new RomanianTankForces();
    }

    @Override
    public SubmarineForces createSubmarines() {
        return new RomanianSubmarineForces();
    }
}
