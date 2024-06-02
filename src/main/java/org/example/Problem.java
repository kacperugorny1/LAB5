package org.example;
import java.util.*;

public class Problem {
    int count;
    int seed;
    int MinW;
    int MaxW;
    int MinV;
    int MaxV;
    Item[] items;
    public Problem(int count, int seed, int rangeMinW, int rangeMaxW, int rangeMinV, int rangeMaxV){
        this.count = count;
        this.seed = seed;
        this.MaxW = rangeMaxW;
        this.MinW = rangeMinW;
        this.MaxV = rangeMaxV;
        this.MinV = rangeMinV;
        items = new Item[count];
        Random rnd = new Random(seed);
        for(int i = 0; i < count; i++) {
            items[i] = (new Item(rnd.nextInt(MinW, MaxW + 1), rnd.nextInt(MinV, MaxV + 1), i));
        }
    }
    public Solution solve(int capacity){
        int capacityHolder = capacity;
        int resultValue = 0;
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(items);
        for(int i = 0; i < count; i++) {
            while (capacityHolder >= items[i].getWeight()) {
                res.add(items[i].getInd());
                capacityHolder -= items[i].getWeight();
                resultValue += items[i].getValue();
            }
        }
        return new Solution(res,resultValue,capacity - capacityHolder);

    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("Count: " + count + " Seed: " + seed + " RangeWeight: " + MinW + ":" + MaxW + " RangeValue: " + MinV + ":" + MaxV + "\n");
        for(int i = 0; i < count; ++i){
            str.append(items[i]);
        }
        return str.toString();
    }
}
