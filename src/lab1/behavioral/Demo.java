package lab1.behavioral;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new Interpolation());
        context.executeStrategy();

        context = new Context(new Binary());
        context.executeStrategy();

        context = new Context(new Depthfirst());
        context.executeStrategy();
    }
}
