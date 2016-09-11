package lab1.creational;

public class Demo {
    public static void main(String[] args) {
        RomanianArmyFactory romaniansFactory = new RomanianArmyFactory();
        ChineseArmyFactory chineseFactory = new ChineseArmyFactory();
        Army romanians = new Army();
        Army chinese = new Army();
        romanians.aviationTeams.add(romaniansFactory.createAviation());
        romanians.aviationTeams.add(romaniansFactory.createAviation());
        chinese.aviationTeams.add(chineseFactory.createAviation());

        romanians.tankTeams.add(romaniansFactory.createTanks());
        chinese.tankTeams.add(chineseFactory.createTanks());
        chinese.tankTeams.add(chineseFactory.createTanks());

        romanians.submarineTeams.add(romaniansFactory.createSubmarines());
        chinese.submarineTeams.add(chineseFactory.createSubmarines());

        System.out.println("Romanians: ");
        romanians.getInfo();
        System.out.println("Chinese: ");
        chinese.getInfo();
    }
}
