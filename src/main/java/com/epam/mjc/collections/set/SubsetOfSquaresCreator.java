package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer integer : sourceList) {
            if (powOfNumber(integer) >= lowerBound && powOfNumber(integer) <= upperBound) {
                treeSet.add(powOfNumber(integer));
            }
        }
        return treeSet;
    }

    private Integer powOfNumber(int number) {
        return (int) Math.pow(number, 2);
    }
}
