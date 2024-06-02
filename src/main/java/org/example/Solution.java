package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    ArrayList<Integer> items;
    int totalWeight;
    int totalValue;

    public Solution(ArrayList<Integer> items, int totalValue, int totalWeight){
        this.items = items;
        this.totalValue = totalValue;
        this.totalWeight = totalWeight;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("Total value: " + totalValue + " Total weight: " + totalWeight + '\n');
        Iterator<Integer> itr = items.iterator();
        for(int i = 0; i < items.size(); i++){
            str.append(itr.next()).append(" ");
        }
        return str.toString();
    }
}
