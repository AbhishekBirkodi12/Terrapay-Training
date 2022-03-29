package com.terrapay;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;
    private float price;

    public Book(String name, float price) {
        this.name = name;
        this.price = price;
    }
    private Book(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "com.terrapay.Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class LaunchBook{
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book("Forgotten Territory",20000f));
        list.add(new Book("Forgotten Territory II",300f));
        list.add(new Book("Forgotten Territory III",2000f));

        list.sort((b1,b2)->{
            return (int) (b1.getPrice() - b2.getPrice());
        });
      /*  Comparator<? super com.terrapay.Book>sortLambda=(Integer arg0, Integer arg1)->arg0-arg1;
        list.sort(sortLambda);*/
        list.forEach((Book book)->{
            System.out.println(book.toString());
        });

    }
}
