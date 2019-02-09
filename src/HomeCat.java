public class HomeCat extends Cat implements IFindFood {

    HomeCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void findFood() {
        System.out.println("Домашний кот " + name + " ищет мышей в сарае");
    }
}
