package exercises.restaurant;

import java.util.Objects;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    private Float price;
    private boolean isNew;

    public MenuItem(String name, String category, String description, float price, boolean isNew) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.isNew = true;

    }

    public boolean isNew() {
        return isNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name) &&
                category.equals(menuItem.category) &&
                description.equals(menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, description);
    }
}
