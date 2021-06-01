package _02原型模式;

class Citation implements Cloneable {
    private String name;
    private String info;
    private String college;

    Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功！");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (this.name);
    }

    public void display() {
        System.out.println(name + info + college);
    }

    public Citation clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return (Citation) super.clone();
    }

}

public class demo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("小明", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "长江大学");
        citation.display();
        Citation citation2 = citation.clone();
        citation2.setName("小红");
        citation2.display();
    }
}
