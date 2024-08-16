package Movement;

public class PlateauSize {
 //plateau size is suppose to be (6,6)
 // this can not be changed
  //  private static final PlateauSize INSTANCE = new PlateauSize();

    private final int x;
    private final int y;

    private PlateauSize(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
