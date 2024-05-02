package lesson19.Mentor.UserInputValidaor;

public enum InputCategory {
    NUMBER("Number"),
    TEXT("Text"),
    SPECIAL_CHARACTER("Special Character");

    private final String categoryName;

    InputCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
