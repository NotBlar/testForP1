package designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhangww on 2017/2/16.
 */
public class ProductList {

    private List<Product> list=new ArrayList<Product>();
    private int count;

    public void add(Product product){
        list.add(product);
        count++;
    }

    public void remove(Product product){
        list.remove(product);
        count--;
    }

    public int count(){
        return count;
    }

    public boolean hasNext(){
        boolean flag=true;

        if(0==count){
            flag=false;
        }else {
            flag=true;
        }

        return flag;
    }

    public Product next(){
        Product product;
        product=list.get(--count);
        return product;
    }


}
