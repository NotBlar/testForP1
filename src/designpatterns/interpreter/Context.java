package designpatterns.interpreter;

/**
 * Created by Zhangww on 2017/2/13.
 */
public class Context {

    private String formula;

    public Context(String formula){
        this.formula=formula;
    }

    public String getFormula() {
        return formula;
    }


}
