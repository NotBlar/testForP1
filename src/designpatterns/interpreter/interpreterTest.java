package designpatterns.interpreter;

/**
 * Created by Zhangww on 2017/2/13.
 */
public class interpreterTest {

    public static void main(String[] args) {
        Interpreter interpreter=new Add();
        interpreter.parse(new Context("2+3"));
    }
}
