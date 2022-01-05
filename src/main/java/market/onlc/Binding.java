package market.onlc;

public class Binding {
    String name;
    int age;
    int price;
    public int getPrice(){
        return price;
    }
    void touch(){
        System.out.println("Какая книга "+ name);
    }
    void watch(Selection selection){
        if (selection.typeBook.equals("гляца")){
            System.out.println("Я только посмотрела " + selection);
             price+=1;
        }
        else System.out.println("Обложка "+ selection + "  надо брать");
    }

}
