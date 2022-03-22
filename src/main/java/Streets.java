public class Streets {
    private String name;
    private int length;
    private Intersection a;
    private Intersection b;

    // Constructor:

    public Streets(String name, int length, Intersection a, Intersection b) {
        this.name = name;
        this.length = length;
        this.a = a;
        this.b = b;
    }

    // Getters:

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public Intersection getA() {
        return a;
    }

    public Intersection getB() {
        return b;
    }

    // Setters:

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setA(Intersection a) {
        this.a = a;
    }

    public void setB(Intersection b) {
        this.b = b;
    }

    //toString():

    @Override
    public String toString() {
        return "Streets{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
