package lesson19.Mentor.UserInputValidaor;

public class InputValidator {
    public boolean validateNumberInput(String input) {
        return input.matches("-?\\d+(\\.\\d+)?");
    }

    public boolean validateTextInput(String input) {
        return input.matches("[a-zA-Z]+");
    }

    public boolean validateSpecialCharacterInput(String input) {
        return input.matches("[^a-zA-Z0-9\\s]");
    }

    public InputCategory categorizeInput(String input) {
        if (validateNumberInput(input)) {
            return InputCategory.NUMBER;
        } else if (validateTextInput(input)) {
            return InputCategory.TEXT;
        } else if (validateSpecialCharacterInput(input)) {
            return InputCategory.SPECIAL_CHARACTER;
        } else {
            return null;
        }
    }
}
