public class Manul extends Cat implements IFindFood {


    Manul(String name, int age) {
        super(name, age);
    }

    @Override
    public void findFood() {
        System.out.println("Манул " + name + " ищет еду в лесу");
    }
}
