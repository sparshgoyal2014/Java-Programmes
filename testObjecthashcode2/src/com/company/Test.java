package com.company;

class EqualityIndex {

    private int index;

    public EqualityIndex(int initialIndex) {
        this.index = initialIndex;
    }

    public static void main(String[] args) {
        EqualityIndex ei = new EqualityIndex(2);
        System.out.println(ei.hashCode());
    }

}