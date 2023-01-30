public class bodyType {
    public enum bodyType;
    SEDAN,
    HATCHBACK,
    UNIVERSAL,
    SUV,
    CROSSOVER,
    PICKUP,
    VAN,
    MINIVAN
    private String name;

    public bodyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Тип кузова " + name;
    }
}
