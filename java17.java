// Sample Java 17 code for AI agent testing
// Goal: Convert this code to Java 21 style

package com.example.app;

import java.util.List;
import java.util.Optional;

public class SampleApp {

    // Record introduced in Java 16
    record User(String name, int age) {}

    public static void main(String[] args) {
        var users = List.of(
            new User("Alice", 25),
            new User("Bob", 30),
            new User("Charlie", 28)
        );

        for (var user : users) {
            System.out.println(formatUser(user));
        }

        System.out.println(getGreeting("Alice"));
    }

    // Example using switch expression (Java 14+)
    static String getGreeting(String name) {
        return switch (name) {
            case "Alice" -> "Hello Alice!";
            case "Bob" -> "Hi Bob!";
            default -> "Hey there!";
        };
    }

    // Example using Optional and multiline text block
    static String formatUser(User user) {
        return Optional.ofNullable(user)
            .map(u -> """
                User Information:
                Name: %s
                Age: %d
                """.formatted(u.name(), u.age()))
            .orElse("No user provided.");
    }
}
