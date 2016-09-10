package lab1.creational;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory armyFactory = FactoryProducer.getFactory("ARMY");
        AbstractFactory unitTypeFactory = FactoryProducer.getFactory("UNITTYPE");

        Army chinese = armyFactory.getArmy("CHINESE");
        Army romanian = armyFactory.getArmy("ROMANIAN");
        chinese.attack();
        romanian.attack();

        UnitType aviation = unitTypeFactory.getUnitType("AVIATION");
        UnitType tanks = unitTypeFactory.getUnitType("TANKFORCES");
        UnitType submarines = unitTypeFactory.getUnitType("SUBMARINEFORCES");
        aviation.advance();
        tanks.advance();
        submarines.advance();
    }
}
