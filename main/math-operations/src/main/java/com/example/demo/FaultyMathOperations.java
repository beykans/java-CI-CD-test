package com.example.demo;

public class FaultyMathOperations {
    public int add(int a, int b) {
        return a + b; // Intentional mistake: should be addition
    }

    public int multiply(int a, int b) {
        return a * b; // Intentional mistake: should be multiplication
    }
}