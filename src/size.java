public enum size {
    XS(10, 25),
    S(26, 50),
    M(51, 80),
    L(81, 120),
    XL(121, 150);
    private int min;
    private int max;

    size(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static size getValue(int value) {
        for (size e : size.values()) {
            if (size >= e.getMin() && size <= e.getMax()) {
                System.out.println(e);
                return e;
            }
        }
        return null;
    }
}
