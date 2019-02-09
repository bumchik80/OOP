public class Cat extends Animal implements IAnimal {

    private static final int MAX_RUN = 200;
    private static final float MAX_JUMP = 2F;

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void run(int range) {
        if (range <= MAX_RUN) System.out.println(name + " пробежал: " + range + " метров");
        else System.out.println(name + " не может пробежать " + range + " метров");
    }

    @Override
    public void jump(float range) {
        if (range <= MAX_JUMP) System.out.println(name + " подпрыгнул на: " + range + " метров");
        else System.out.println(name + " не может прыгнуть на высоту " + range + "метров");
    }

    @Override
    public void swim(int range) {
        System.out.println(name + " не умеет плавать");
    }


}
