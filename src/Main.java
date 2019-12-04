import java.util.*;

public class Main {
    public static void main(String args[]){
        Coordinate coordinate1 = new Coordinate(2,3);
        System.out.println(coordinate1);
        System.out.println(coordinate1.newCoordinate(Direction.SOUTH));
        Ship ship1 = new Ship(2, coordinate1, Direction.SOUTH);
        System.out.println(ship1);
        System.out.println(ship1.isOnSquare(coordinate1));
    }
}
