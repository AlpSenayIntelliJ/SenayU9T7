public class ThreeDPoint extends Point {
    private int z;
    public ThreeDPoint(String label, int x, int y, int z) {
        super(label, x, y);
        this.z = z;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o) && z == ((ThreeDPoint) o).z;
    }
    public String toString() {
        return super.toString() + ", z = " + z;
    }
}
