package lab1.creational;

public abstract class AbstractFactory {
    abstract Army getArmy(String army);
    abstract UnitType getUnitType(String unitType);
}
