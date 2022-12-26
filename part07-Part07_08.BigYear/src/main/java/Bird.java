public class Bird {
    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName, int obsevation) {
        this.name = name;
        this.latinName = latinName;
        this.observation = obsevation;
    }

    public String getName() {
        return this.name;
    }

    public void addObservation() {
        this.observation++;
    }

    @Override
    public String toString() {
        return this.name + " (" + latinName + "): " + this.observation + " obsevations";
    }
}
