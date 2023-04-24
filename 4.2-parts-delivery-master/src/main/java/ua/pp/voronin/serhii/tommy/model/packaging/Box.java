package ua.pp.voronin.serhii.tommy.model.packaging;

public class Box {
    private int side; // в міліметрах
    public Box(int side) {
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    public int calculatePrice(int pricePerMeter) {
        int boxSize = this.getSide();
        int boxArea = 6 * boxSize * boxSize ; // площа поверхні куба в мм²
        double pricePerMillimeter = pricePerMeter / 1000d / 1000d;
        return (int) Math.ceil(boxArea * pricePerMillimeter);
    } // Підказка: чи має цей класс займатися вирахуванням вартості ящику?

    @Override
    public String toString() {
        return "ящик {" + side + '*' + side + '*' + side + '}';
    }
}
