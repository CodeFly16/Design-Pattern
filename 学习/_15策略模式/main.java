package _15策略模式;

public class main {
    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategyA a = new ConcreteStrategyA();
        ConcreteStrategyB b = new ConcreteStrategyB();
        context.setStrategy(a);
        context.strategyMethod();
        System.out.println("=============================");
        context.setStrategy(b);
        context.strategyMethod();
    }

}

interface Strategy {
    void strategyMethod();
}

class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A");
    }
}

class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B");
    }
}

class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }

}