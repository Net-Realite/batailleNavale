import java.util.Objects;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Coordinate newCoordinate(Direction direction){

        int newX = this.x;
        int newY = this.y;

        switch (direction) {
            case EAST:
                newX++;
                break;
            case WEST:
                newX--;
                break;
            case NORTH:
                newY++;
                break;
            case SOUTH:
                newY--;
                break;
        }

        Coordinate newCoordinate = new Coordinate(newX, newY);
        return  newCoordinate;

    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
