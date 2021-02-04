import java.time.LocalDate;
import java.util.Objects;

abstract class Animal {
    String name;
    String sex;
    LocalDate birthDay;
    int cost;

    public Animal(String name, String sex, LocalDate birthDay, int price) {
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
        this.cost = price;
    }

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return cost == animal.cost &&
                Objects.equals(name, animal.name) &&
                Objects.equals(sex, animal.sex) &&
                Objects.equals(birthDay, animal.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, birthDay, cost);
    }
}
