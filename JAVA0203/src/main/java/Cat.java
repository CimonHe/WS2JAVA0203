import java.time.LocalDate;

public class Cat extends Animal{
    public Cat(String name, String sex, LocalDate birthDay, int price) {
        super(name, sex, birthDay, price);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDay=" + birthDay +
                ", price=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
