
public class Main {
    public static void main (String[] args){
        Book b1 = new Book("Утраченный символ", 325);
        Book b2 = new Book("Ангелы и демоны", 431);
        Book b3 = new Book("Происхождение");
        b3.setAmountPage(150);
        System.out.println(b1);
        b1.printClass();
        b2.printClass();
        b3.printClass();
    }
}
