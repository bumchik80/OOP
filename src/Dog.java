public class Dog extends Animal implements IAnimal {

    //5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
    //private static final int MAX_RUN = 500;
    private int maxRun = 500;

    private static final int MAX_SWIM = 10;
    private static final float MAX_JUMP = 0.5F;

    Dog(String name, int age) {
        super(name, age);
    }

    Dog(String name, int age, int maxRun) {
        super(name, age);
        this.maxRun = maxRun;
    }

    @Override
    public void run(int range) {
        if (range <= maxRun) System.out.println(name + " пробежал: " + range + " метров");
        else System.out.println(name + " не может пробежать " + range + " метров");
    }

    @Override
    public void jump(float range) {
        if (range <= MAX_JUMP) System.out.println(name + " подпрыгнул на: " + range + " метров");
        else System.out.println(name + " не может прыгнуть на высоту " + range + " метров");
    }

    @Override
    public void swim(int range) {
        if (range <= MAX_SWIM) System.out.println(name + " проплыл: " + range + " метров");
        else System.out.println(name + " не может проплыть " + range + " метров");
    }

}
