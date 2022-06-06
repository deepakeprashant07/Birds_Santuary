package BirdsSanctuary;

import java.util.Objects;

public abstract class Bird {

    String id;
    String name;
    String colour;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return id.equals(bird.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Bird{" +
                " id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
