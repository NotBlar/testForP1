package designpatterns.iterator;

/**
 * Created by Zhangww on 2017/2/16.
 */
public class Product {

    public Product(String name){
        this.name=name;
    }

    private String name;

    public String getName(){
        return name;
    }


}
