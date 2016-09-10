package lab1.creational;

public class ArmyFactory extends AbstractFactory {
    @Override
    public Army getArmy(String army) {

        if (army == null) {
            return null;
        }

        if (army.equalsIgnoreCase("CHINESE")) {
            return new ChineseArmy();

        } else if (army.equalsIgnoreCase("ROMANIAN")) {
            return new RomanianArmy();
        }
        return null;
    }

    @Override
    public UnitType getUnitType (String unitType){
        return null;
    }
}
