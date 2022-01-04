package market.onlc;

public class Telephone {
    public static void main(String[] args){
        int yearOfIssue = 2021;
        String phoneName = "Galaxy Z Flip3 | Z Fold3";
        int memory = 256;
        int phonePrice = 84000;
        float lossPerYear = 0.9F;

        System.out.println("Мой телефон = " + phoneName +"  какого года  " +yearOfIssue + "  карта памяти  " + memory +"    стоимость на 2021 год  " + phonePrice +" руб");
        System.out.println("Сколько я потеряю за год  "+ lossPerYear);
        System.out.println("а сколько это в рублях " + lossPerYear/100*phonePrice);


    }
}
