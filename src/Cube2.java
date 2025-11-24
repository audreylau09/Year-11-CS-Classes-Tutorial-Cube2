import java.sql.SQLOutput;

public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        this(1, "black");
    }

    public Cube2(int side) {
            if (side < 1) {
                throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
            }
            this.basicCube = new Cube(side);
            this.color = "black";
    }

    public Cube2(int side, String color) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        this.basicCube = new Cube(side);
        this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public String getColor() {
        return color;
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        basicCube.setSide(side);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int calculateVolume() {
        return basicCube.getSide() * basicCube.getSide() * basicCube.getSide();
    }

    public int calculateSurfaceArea() {
        return 6 * basicCube.getSide() * basicCube.getSide();
    }

    public String toString() {
        return "Cube{side=" + basicCube.getSide() + ", color=\"" + color + "\"}";
    }

    public Cube2 add(Cube2 otherCube) {
        int a = this.getSide();
        int b = otherCube.getSide();
        int c = (int) Math.sqrt((a * a) + (b * b));
        if (c * c != (a * a + b * b)) {
            throw new IllegalArgumentException("The side lengths do not form a Pythagorean triple.");
        }
        return new Cube2(c, this.getColor());
    }

    public String toString2() {
        return "Cube{side=" + basicCube.getSide() + ", color=\"" + color + "\"";
    }

    public Cube2 minus(Cube2 otherCube) {
        int a = this.getSide();
        int b = otherCube.getSide();
        int c = (int) Math.sqrt((a * a) - (b * b));
        if (c * c != (a * a - b * b)) {
            throw new IllegalArgumentException("The side lengths do not form a Pythagorean triple.");
        }
        return new Cube2(c, this.getColor());
    }
}