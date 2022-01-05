package market.onlc;

public class Selection {
    String typeBook;
    public Selection(String typeBook){
        this.typeBook = typeBook;
    }
    @Override
    public String toString(){
        return typeBook;
    }
}
