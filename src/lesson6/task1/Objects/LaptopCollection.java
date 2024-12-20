package lesson6.task1.Objects;

import java.util.HashSet;
import java.util.Set;

public class LaptopCollection {
    private Set<Laptop> laptopCollection = new HashSet<>();

    public Set<Laptop> get() {
        return laptopCollection;
    }

    public void set(Set<Laptop> mySet) {
        laptopCollection = mySet;
    }

    public void add(Laptop laptop) {
        laptopCollection.add(laptop);
    }

    public boolean remove(Laptop laptop) {
        return laptopCollection.remove(laptop);
    }

    public HashSet<Laptop> getCopy() {
        HashSet<Laptop> laptops = new HashSet<>();

        for (Laptop laptop : laptopCollection) {
            laptops.add(laptop);
        }

        return laptops;
    }

    public void printCollection() {
        if (laptopCollection.isEmpty()) {
            System.out.println("The collection is empty.");
            return;
        }
        for (Laptop laptop : laptopCollection) {
            System.out.println(laptop.toString() + '\n');
        }
    }

    public void printCollection(String aboutInfo) {
        System.out.println(aboutInfo);
        printCollection();
    }
}
