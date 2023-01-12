package mechanics;
import transport.driver.Licenses;
import transportUnit.Transport;
import transport.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Mechanics   {
    private String  name;
    private String company;
    private List<Licenses> category;

    public Mechanics(String name, String company, Licenses... category) {
        this.name = name;
        this.company = company;
        this.category = new ArrayList<>();   // это будет новый список
        Collections.addAll(this.category, category); //массив Licenses... category вставл-ся в список this.category
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public List<Licenses> getCategory() {
        return category;
    }
    public void setCategory(List<Licenses> category) {
        this.category = category;
    }

    void checkTO(){       // метод чинить авто. Добавить тип траспорта
      System.out.println(name + " делаю ТО у авто");
     }

    void fixCar(){            // метод чинить авто
        System.out.println(name + " ремонтирую автомобиль ");
    }

    @Override
    public String toString() {
        return "Mechanics{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics mechanics = (Mechanics) o;
        return Objects.equals(name, mechanics.name) && Objects.equals(company, mechanics.company) && Objects.equals(category, mechanics.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, category);
    }
}
