package models;

public class Animal {
    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    private final String name;
    private final String kind;

    public Animal(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }
}
