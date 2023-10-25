package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Box<L extends Fruit> {
    private List<L> list = new ArrayList<>();

    public List<L> getList() {
        return list;
    }

    public Box(L... objs) {
        list.addAll(Arrays.asList(objs));
    }

    void add(AddFruit obj) {
        if (obj != null) {
            list.add((L) obj);
        }
    }

    void moveTo(Box<? extends AddFruit> box) {
        if (box != this) {
            for (L fruit : list) {
                box.add((AddFruit) fruit);
            }
            list.clear();
        }
    }


    float getWeight() {
        float weight = 0;
        for (L l : list) {
            weight += l.getWeight();
        }
        return weight;
    }

    boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }

    void printBox() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста!!!");
            return;
        }
        for (L l : list) {
            System.out.println(l);
        }
    }
}
