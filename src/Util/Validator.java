package Util;

import java.math.BigDecimal;

public class Validator {

    public static void validateEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email == null || !email.matches(regex)) {
            throw new IllegalArgumentException("Email inválido.");
        }
    }

    public static void validateAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Idade inválida.");
        }
    }

    public static void validateSession(int sessionNumber) {
        if (sessionNumber <= 0) {
            throw new IllegalArgumentException("Número da sessão inválido.");
        }
    }

    public static void validatePrice(BigDecimal price) {
        if (price == null || price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Preço inválido.");
        }
    }
}