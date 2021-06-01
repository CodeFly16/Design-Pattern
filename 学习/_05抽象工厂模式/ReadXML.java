package _05抽象工厂模式;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadXML {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getObject() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("学习/_05抽象工厂模式/config1.xml"));
            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            List<Node> nodeList = new ArrayList<>();
            nodeList.add(nl.item(0).getFirstChild());
            nodeList.add(nl.item(1).getFirstChild());
            List<Object> instanceList = new ArrayList<>();
            nodeList.forEach(item ->{
                String cName = "_05抽象工厂模式." + item.getNodeValue();
                System.out.println("新类名："+cName);
                Class<?> c = null;
                try {
                    c = Class.forName(cName);
                    Object obj = c.newInstance();
                    instanceList.add(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            //通过类名生成实例对象并将其返回
            return instanceList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
