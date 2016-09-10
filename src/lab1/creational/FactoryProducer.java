package lab1.creational;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("ARMY")) {
            return new ArmyFactory();

        } else if (choice.equalsIgnoreCase("UNITTYPE")) {
            return new UnitTypeFactory();
        }
        return null;
    }
}
