import static java.lang.String.format;

public class Plate {

    private int food;

    Plate (int food) {
        this.food = food;
        System.out.println(this);
    }

    public int decreaseFood (int foodAmount) {
        int amount = foodAmount;
        // 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
        if (food - foodAmount < 0) {
            amount = food;
            food = 0;
            System.out.println(this);
        }
        else {
            food -= foodAmount;
            System.out.println(this);
        }
        return amount;
    }

    @Override
    public String toString() {
        if (food == 0) return "Тарелка пустая";
        else return format("В тарелке %d еды", food);
    }
}
