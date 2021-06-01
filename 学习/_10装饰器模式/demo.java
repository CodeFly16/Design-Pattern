package _10装饰器模式;

import javax.swing.*;
import java.awt.*;

public class demo {
    public static void main(String[] args) {
        Morrigan m0 = new original();
        m0.display();
        Morrigan m1 = new Succubus(m0);
        m1.display();
        Morrigan m2 = new Girl(m0);
        m2.display();
    }
}

interface Morrigan {
    void display();
}

class original extends JFrame implements Morrigan {
    private static final long serialVersionUID = 1L;
    private String t = "Morrigan0.jpg";

    public original() {
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }

    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        System.out.println("学习/_10装饰器模式/img/" + t);
        JLabel l1 = new JLabel(new ImageIcon("学习/_10装饰器模式/img/" + t));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void setImage(String t) {
        this.t = t;
    }

}

class Changer implements Morrigan {

    public Morrigan morrigan;

    public Changer(Morrigan morrigan) {
        this.morrigan = morrigan;
    }

    @Override
    public void display() {
        morrigan.display();
    }
}

class Succubus extends Changer {

    public Succubus(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger() {
        ((original) super.morrigan).setImage("Morrigan1.jpg");
    }
}

class Girl extends Changer {

    public Girl(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger() {
        ((original) super.morrigan).setImage("Morrigan2.jpg");
    }
}