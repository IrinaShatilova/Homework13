public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 13");Author levTolstoy = new Author("Лев"," Толстой");
        Book warAndWorld = new Book("Война и мир",levTolstoy,1980);
        Book warAndWorld1 = new Book("Война и мир",levTolstoy,1981);
        Author aleksandrPushkin = new Author("Александр"," Пушкин");
        Book evgeniyOnegin = new Book("Евгений Онегин", aleksandrPushkin,1979);
        evgeniyOnegin.setYear(2022);
        System.out.println("Книга 1: " + warAndWorld);
        System.out.println("Книга 2: " + evgeniyOnegin);
        System.out.println("Книга 3: " + warAndWorld1);
        if (warAndWorld.equals(warAndWorld1)) {
            System.out.println("Такая книга уже есть в библиотеке");
        }

    }
}