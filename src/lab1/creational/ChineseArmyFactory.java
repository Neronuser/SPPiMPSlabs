package lab1.creational;

public class ChineseArmyFactory extends AbstractArmyFactory {

    @Override
    public Aviation createAviation() {
        return new ChineseAviation();
    }

    @Override
    public TankForces createTanks() {
        return new ChineseTankForces();
    }

    @Override
    public SubmarineForces createSubmarines() {
        return new ChineseSubmarineForces();
    }
}