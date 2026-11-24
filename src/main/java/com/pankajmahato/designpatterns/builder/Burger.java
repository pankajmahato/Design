package com.pankajmahato.designpatterns.builder;

public class Burger {

    private String size;
    private boolean egg;
    private boolean cheese;
    private boolean onion;


    private Burger() {
    }

    private Burger(BurgerBuilder burgerBuilder) {

        this.size = burgerBuilder.size;
        this.egg = burgerBuilder.egg;
        this.cheese = burgerBuilder.cheese;
        this.onion = burgerBuilder.onion;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", egg=" + egg +
                ", cheese=" + cheese +
                ", onion=" + onion +
                '}';
    }

    public static class BurgerBuilder {

        private String size;
        private boolean egg;
        private boolean cheese;
        private boolean onion;

        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
