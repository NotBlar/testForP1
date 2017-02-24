package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhangww on 2016/12/15.
 */


public class Student{

    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("张三",1,"北京市通州区"));
        list.add(new Student("李四",0,"北京是朝阳区"));
        list.add(new Student("王五",1,"北京市东城区"));

        for (Student student:list){
            System.out.println(student.toString());
        }

        for (Student student:list){
            if("李四".equals(student.getName())){
                student.setSex(88);
            }
        }

        for(Student student:list){
            System.out.println(student.toString());
        }
    }

    private String name;
    private Integer sex;
    private String address;

    public Student() {
    }

    public Student(String name, Integer sex, String address) {
        this.name = name;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }
}
