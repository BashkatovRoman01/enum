public enum loadCapacity {

    N1 (3.5, 12),
    N2 (13,20),
    N3 (21,500);
    private double min;
    private double max;

    public loadCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
    public static loadCapacity getValue (double value) {
        for (loadCapacity e : loadCapacity.values()) {
            if (value >= e.getMin() && value <= e.getMax()) {
                System.out.println(e);
                return e;
            }
        }
        return null;
    }
}
