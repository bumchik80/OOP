import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", 100);
        Cat murzik = new Cat("Мурзик", 500);
        Cat pushok = new Cat("Пушок", 200);
        Cat richard = new Cat("Ричард", 20);
        Plate miska = new Plate(400);

        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(barsik);
        cats.add(murzik);
        cats.add(pushok);
        cats.add(richard);
        cats.add(pushok);
        cats.add(murzik);
        // Попросить всех котов покушать из этой тарелки (некоторых и не один раз ))))
        for (Cat cat : cats) {
            cat.eatFood(miska, 100);
        }
        Cat[] cats1 = new Cat[] {barsik, murzik, pushok, richard};
        // Потом вывести информацию о сытости котов в консоль
        for (Cat cat : cats1) {
            System.out.println(cat.getCatAppetite());
        }
    }
}
