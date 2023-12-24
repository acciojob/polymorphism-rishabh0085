package com.driver;

public class Main {

    // Task 1: Create a class Product inside Main class
    public static class Product {

        // Task 3: Create a method with the given definition
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method with the given definition
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create another overloaded method with the given definition
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {

        // Task 2: Create an object of Product in the Main function called p
        Product p = new Product();

        // Task 3: Call the method from Main using Product class object p
        int result1 = p.product(2, 3);
        System.out.println("Product of two integers: " + result1);

        // Task 4: Call the overloaded method from Main using Product class object p
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of three integers: " + result2);

        // Task 5: Call another overloaded method from Main using Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of two doubles: " + result3);
    }
}
