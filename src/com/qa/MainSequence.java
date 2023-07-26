package com.qa;
import com.qa.model.*;
import java.util.*

public class MainSequence {

    Cat c = new Cat("Whiskers", 10);
    Cat c2 = new Cat("Midas", 8);
    Dog d = new Dog("Spot", 2);
    Rabbit r = new Rabbit("Peter", 2);
    Rabbit r2 = new Rabbit("Cottontail", 3);

    public void testArrayList() {
        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(c);
        animalList.add(c2);
        animalList.add(d);
        animalList.add(r);
        animalList.add(r2);

        for (int x = 0; x < animalList.size(); x++){
            System.out.println(animalList.get(x));
        }

    }

    public void testHashMap() {
        HashMap<String, Animal> animalMap = new HashMap<String, Animal>();

        animalMap.put(c.getName(), c);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), r);
        animalMap.put(r2.getName(), r2);



        for (String key : animalMap.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    animalMap.get(key));
        }
    }

    public void testSet() {

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(c);
        animalList.add(c2);
        animalList.add(d);
        animalList.add(r);
        animalList.add(r2);

        HashSet<Animal> set = new HashSet<>();
        //we can just add all the elements of another collection
        set.addAll(animalList);

        set.add(c); // replaces the previous version of the cat
        set.add(c2);

        Iterator<Animal> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }

    public static void main(String[] args) {

    }
}
