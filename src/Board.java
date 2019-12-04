import java.util.*;

public class Board {

    Map<Integer, Integer> myMap = new HashMap<>();
    Coordinate coordinate1 = new Coordinate(3,4);
    Direction direction1 = Direction.SOUTH;
    Ship ship1 = new Ship(2, coordinate1, direction1);

    private String squareStatus(Coordinate coordinate1) {
        if (myMap.containsValue(coordinate1) == true) {
            return "Occupied";
        } else if (myMap.containsValue(coordinate1) == false) {
            return "Free";
        }
        return null;
    }

    private void putShip(Ship ship1){
        throw new UnsupportedOperationException();
    }

    private void shotAt(Coordinate coordinate1){
        throw new UnsupportedOperationException();
    }

}
