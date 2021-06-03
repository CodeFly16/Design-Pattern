package _16命令模式;

import java.util.ArrayList;

public class WithZuHe {
    public static void main(String[] args) {
        AbstractCommand cmd1 = new ConcreteCommand1();
        AbstractCommand cmd2 = new ConcreteCommand2();
        CompositeInvoker ir = new CompositeInvoker();
        ir.add(cmd1);
        ir.add(cmd2);
        System.out.println("客户访问调用者的execute()方法...");
        ir.execute();
    }
}

interface AbstractCommand {
    void execute();
}


class CompositeInvoker implements AbstractCommand {
    private ArrayList<AbstractCommand> children = new ArrayList<AbstractCommand>();

    void add(AbstractCommand command) {
        children.add(command);
    }

    void remove(AbstractCommand command) {
        children.remove(command);
    }

    @Override
    public void execute() {
        for (Object obj : children) {
            ((AbstractCommand) obj).execute();

        }
    }

}

class ConcreteCommand1 implements AbstractCommand {
    private CompositionReceiver receiver = new CompositionReceiver();

    @Override
    public void execute() {
        receiver.action1();
    }
}

class ConcreteCommand2 implements AbstractCommand {
    private CompositionReceiver receiver = new CompositionReceiver();

    @Override
    public void execute() {
        receiver.action2();
    }
}

class CompositionReceiver {
    void action1() {
        System.out.println("接收者的行动1。。。");
    }

    void action2() {
        System.out.println("接收者的行动2。。。");
    }
}
