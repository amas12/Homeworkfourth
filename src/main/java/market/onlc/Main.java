package market.onlc;

import java.awt.print.Book;

public class Main {
    public static void main(String... args) {
        Binding cool = new Binding();
        cool.name = "Alice's Adventures in Wonderland";
        cool.price = 4999;
        cool.age =80;

        Selection hardCover= new Selection (" твердая");
        Selection glossy = new Selection(" глянцевая");

        cool.touch();

        cool.watch(hardCover);
        System.out.println("Какой прайс " + cool.getPrice()+ " руб.");

        cool.watch(glossy);
        System.out.println("Какой прайс " + cool.getPrice()+" руб.");

    }
}
