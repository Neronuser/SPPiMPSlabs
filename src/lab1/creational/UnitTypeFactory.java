package lab1.creational;

public class UnitTypeFactory extends AbstractFactory {
    @Override
    public UnitType getUnitType (String unitType){
        if (unitType == null) {
            return null;
        }

        if (unitType.equalsIgnoreCase("AVIATION")) {
            return new Aviation();

        } else if (unitType.equalsIgnoreCase("TANKFORCES")) {
            return new TankForces();
        } else if (unitType.equalsIgnoreCase("SUBMARINEFORCES")) {
            return new SubmarineForces();
        }
        return null;
    }

    @Override
    public Army getArmy(String army) {
        return null;
    }
}
