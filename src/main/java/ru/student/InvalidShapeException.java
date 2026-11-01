package ru.student;

public class InvalidShapeException extends IllegalArgumentException {
    public InvalidShapeException(String message) {
        super(message);
    }
}