package lab1.structural;

public class Demo {
    public static void main(String[] args) {
        Car volvo = new Car("Volvo");
        Car renault1 = new Car("Renault1");
        Car renault2 = new Car("Renault2");
        Car lada1 = new Car("Lada1");
        Car lada2 = new Car("Lada2");

        volvo.add(renault1);
        volvo.add(renault2);
        renault1.add(lada1);
        renault1.add(lada2);
        renault2.add(lada1);
        renault2.add(lada2);

        System.out.println(volvo);
        for (Car slowerThanVolvo: volvo.getOutruns()) {
            System.out.println("\t" + slowerThanVolvo);
            for (Car evenSlower: slowerThanVolvo.getOutruns()) {
                System.out.println("\t\t" + evenSlower);
            }
        }
    }
}
