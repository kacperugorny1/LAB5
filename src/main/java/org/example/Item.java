package org.example;

public class Item implements Comparable<Item> {
    int weight;
    int value;
    int ind;
    double ratio;
    public Item(int weight, int value, int ind) {
        this.weight = weight;
        this.value = value;
        this.ind = ind;
        ratio = (double)value / (double)weight;
    }
    public int getInd(){
        return ind;
    }
    public int getWeight() {
        return weight;
    }
    public int getValue() {
        return value;
    }
    @Override
    public String toString(){
        return "W: " + weight + " V: " + value + " R: " + ratio + " IND: " + ind + '\n';
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(o.ratio, this.ratio);
    }
}
