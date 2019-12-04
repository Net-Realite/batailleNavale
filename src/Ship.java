import java.util.*;

public class Ship {
    private int size;
    private Direction direction;
    private List<Coordinate> coordinatesList;

    public Ship(int size, Coordinate initialCoordinate, Direction direction) {
        this.size = size;
        this.direction = direction;
        this.coordinatesList = new ArrayList<>();

        Coordinate currentCoordinate = initialCoordinate;

        this.coordinatesList.add(initialCoordinate);
        for (int i=0; i<coordinatesList.size();i++){
            currentCoordinate = currentCoordinate.newCoordinate(direction);
            this.coordinatesList.add(currentCoordinate);
        }

    }

    public boolean isOnSquare(Coordinate coordinate){
        return coordinatesList.contains(coordinate);
    }

    private boolean isSunk(){
        throw new UnsupportedOperationException();
    }

    private void shotAt(Coordinate coordinate){
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Ship{" +
                "size=" + size +
                ", direction=" + direction +
                ", coordinatesList=" + coordinatesList +
                '}';
    }
}
