package kr.co.greenart;

abstract class Item {
    protected String name;
    protected double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void use();
}

class Book extends Item {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void use() {
        System.out.println("å�� �н��ϴ�.");
    }

    public String getAuthor() {
        return author;
    }
}

class Pen extends Item {
    private String color;

    public Pen(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public void use() {
        System.out.println("������ ���⸦ �մϴ�.");
    }

    public String getColor() {
        return color;
    }
}

public class QuizAbstract {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 29.99, "John Doe");
        book.use();
        System.out.println("å ����: " + book.name);
        System.out.println("�۰�: " + book.getAuthor());
        System.out.println("����: $" + book.price);

        System.out.println();
        Pen pen = new Pen("Gel Pen", 2.99, "Blue");
        pen.use();
        System.out.println("�� ����: " + pen.name);
        System.out.println("����: " + pen.getColor());
        System.out.println("����: $" + pen.price);
    }
}