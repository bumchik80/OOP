public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 2);
        dog.run(100);
        dog.jump(600);
        dog.swim(2);

        Cat cat = new Cat("Ричард", 2);
        cat.run(5);
        cat.jump(0.5F);
        cat.swim(5);

        //5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
        Dog superDog = new Dog ("Цезарь", 3, 1000);
        superDog.run(900);
        Dog simpleDog = new Dog ("Алдан", 6);
        simpleDog.run(900);

        IAnimal[] animals = new IAnimal[] {dog, cat, superDog, simpleDog};
        for (IAnimal animal : animals) {
            animal.run (100);
            animal.jump(1.4F);
            animal.swim(5);
        }

        //6. * Добавить интерфейс, с помощью которого ваше животное сможет искать еду (единственный метод).
        // Сделайте разные классы - к примеру, домашний кот и дворовой, пометьте их этим интерфейсом и
        // сделайте реализацию для каждого типа животных. Затем создайте объекты через с животными разного типа - например,
        // дворовой кот, домашний, зубр :)
        HomeCat pushok = new HomeCat("Пушок", 3);
        JungleCat murzik = new JungleCat("Мурзик", 1);
        Manul barsik = new Manul("Барсик", 10);
        // Объедините их в массив
        IFindFood[] cats = new IFindFood[] {barsik, murzik, pushok} ;
        // и с помощью цикла вызовите у каждого интерфейсного объекта метод "искать еду".
        for (IFindFood icat : cats) {
            icat.findFood();
        }
    }
}
