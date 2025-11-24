import org.w3c.dom.ls.LSOutput;

public class Cube {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 1){
            throw new IllegalArgumentException("A cube's side must be equal to or greater than 1!");
        }
        this.side = side;

    }

    public int calculateSurfaceArea() {
        return side * side;
    }

    public int calculateVolume() {
        return side * side * side;
    }

    public String toString() {
        return "Cube{side=" + side + "}";
    }

    public static void main (String[]args){
        Cube c = new Cube();
        System.out.println(c.toString());
    }

    public Cube() {
        side = 1;
    }

    public Cube(int side) {
        this.side = side;
    }

}
