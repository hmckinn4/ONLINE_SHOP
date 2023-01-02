package com.solvd.onlineshop.models;

public enum Sizes {
        Small("Small"), Medium("Medium"), Large("Large"), XL("Extra-Large");
        String name;

        //constructor below
        Sizes(String size) {
            this.name = size;
        }
        //method to return size
        public String getName(){
            return this.name;
        }
}
