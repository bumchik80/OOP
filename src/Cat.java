public class Cat {
    // Каждому коту нужно добавить поле сытость
    private int appetite;
    private String name;


    Cat (String name, int appetite) {
        this.name = name;
        try {
            setAppetite(appetite);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void setAppetite(int appetite) throws NegativeAppetiteException {
        // Устанавливаем начальный уровень голода - (когда создаем котов, они голодны).
        if (appetite < 0) throw new  NegativeAppetiteException ("У кота не может быть отрицательного аппетита") ;
        this.appetite = appetite;
    }

    public void eatFood(Plate plate, int foodAmount) {
        // Если коту удалось покушать (хватило еды)...
        // Немного изменил условие - меряем точно какой аппетит у кота, а не просто есть или нет
        if (foodAmount > appetite) {
            System.out.printf("Коту %s не съесть %d еды. Максимум на что он способен - это %d\n", name, foodAmount, appetite );
        }
        else {
            System.out.println("Кот " + name + " подходит к тарелке и ...");
            int realAmount = plate.decreaseFood(foodAmount);
            appetite -= realAmount ;
            System.out.printf("Кот %s съел %d еды и имеет аппетит ещё на %d еды\n", name, realAmount, appetite );
        }
    }

    public String getCatAppetite() {
        return String.format("Кот %s имеет аппетит на %d еды", name, appetite);
    }
}
