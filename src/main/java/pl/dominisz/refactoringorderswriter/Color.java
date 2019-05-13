package pl.dominisz.refactoringorderswriter;

public enum Color {

    NO_COLOR(0, "no color"),
    BLUE(1, "blue"),
    RED(2, "red"),
    YELLOW(3, "yellow");

    private int value;
    private String name;

    Color(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getNameForValue(int value) {
        for (Color color : values()) {
            if (color.value == value) {
                return color.name;
            }
        }
        return NO_COLOR.name;
    }
}
