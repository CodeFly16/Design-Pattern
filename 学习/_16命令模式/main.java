package _16命令模式;

public class main {
    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        System.out.println("客户访问调用者的call()方法...");
        invoker.cell();
    }
}

interface Command {
    void execute();
}

class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Invoker(Command command) {
        this.command = command;
    }

    public void cell() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}

class Receiver {
    void action() {
        System.out.println("接收者开始行动。。。。");
    }
}

class ConcreteCommand implements Command {

    private Receiver receiver;

    ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
