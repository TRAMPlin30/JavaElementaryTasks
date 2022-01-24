package com.ElementaryTasks.AtOnlineLessons.MyPrototip;

public class Robot { //implements myCloneaable
    private int id;
    private String name;
    private String processor;

    public Robot(int id, String name, String processor) {
        this.id = id;
        this.name = name;
        this.processor = processor;
    }
    //@Override
    public Robot copy() {    //Object если тип указан как Object, то в дальнейшем мы можем указывать любой тип с помощью приведения типов (<имя класса объекта> - тип данных)
        Robot copy = new Robot(id, name, processor);
        return copy;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
