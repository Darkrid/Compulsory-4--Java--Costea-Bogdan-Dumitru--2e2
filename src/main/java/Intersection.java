import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Intersection implements Comparable<Intersection> {
    private String name;
    // Constructor:

    public Intersection(String name) {
        this.name = name;
    }

    // Getters:

    public String getName() {
        return name;
    }

    // Setters:

    public void setName(String name) {
        this.name = name;
    }

    // Compare:

    @Override
    public int compareTo(Intersection x) {
        return 0;
    }
    // toString():

    @Override
    public String toString() {
        return "Intersection{" +
                "name='" + name + '\'' +
                '}';
    }
}