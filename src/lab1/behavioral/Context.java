package lab1.behavioral;

public class Context {
    private DataSearchStrategy strategy;

    public Context(DataSearchStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.search();
    }
}
