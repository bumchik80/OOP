public class JungleCat extends Cat implements IFindFood {

    JungleCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void findFood() {
        System.out.println("Камышовый кот " + name + " ищет еду в камышах");
    }
}
