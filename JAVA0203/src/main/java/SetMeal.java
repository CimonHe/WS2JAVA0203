import java.util.Objects;

public class SetMeal {
    String name;
    Animal animal;
    Vaccine vaccine;
    int price;

    public SetMeal(String name, Animal animal, Vaccine vaccine, int price) {
        this.name = name;
        this.animal = animal;
        this.vaccine = vaccine;
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetMeal setMeal = (SetMeal) o;
        return price == setMeal.price &&
                Objects.equals(name, setMeal.name) &&
                Objects.equals(animal, setMeal.animal) &&
                Objects.equals(vaccine, setMeal.vaccine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, animal, vaccine, price);
    }
}
