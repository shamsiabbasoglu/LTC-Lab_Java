package lesson19.Mentor.UserInputValidaor;

public class Validator {
    public boolean NumberInput(String input) {
        return input.matches("-?\\d+(\\.\\d+)?");
    }

    public boolean TextInput(String input) {
        return input.matches("[a-zA-Z]+");
    }

    public boolean SpecialCharacterInput(String input) {
        return input.matches("[^a-zA-Z0-9\\s]");
    }

    public InputCategory categorize(String input) {
        if (NumberInput(input)) {
            return InputCategory.NUMBER;
        } else if (TextInput(input)) {
            return InputCategory.TEXT;
        } else if (SpecialCharacterInput(input)) {
            return InputCategory.SPECIAL_CHARACTER;
        } else {
            return null;
        }
    }
}
