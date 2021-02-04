import java.time.LocalDate;

public class Bird extends Animal{
    public Bird(String name, String sex, LocalDate birthDay, int price) {
        super(name, sex, birthDay, price);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDay=" + birthDay +
                ", price=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
