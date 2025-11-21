package Util;

public class Validator {

    public static void validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email == null || !email.matches(regex)) {
            throw new IllegalArgumentException("Email inválido.");
        }
    }

    public static void validarIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade inválida.");
        }
    }

    public static void validarSessao(int numeroSessao) {
        if (numeroSessao <= 0) {
            throw new IllegalArgumentException("Número da sessão inválido.");
        }
    }

    public static void validarPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço inválido.");
        }
    }
}
