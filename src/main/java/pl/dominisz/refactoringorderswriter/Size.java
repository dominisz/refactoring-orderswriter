package pl.dominisz.refactoringorderswriter;

public enum Size {

    NOT_APPLICABLE(-1, "not applicable"),
    INVALID(0, "Invalid size"),
    XS(1, "XS"),
    S(2, "S"),
    M(3, "M"),
    L(4, "L"),
    XL(5, "XL"),
    XXL(6, "XXL");

    private int value;
    private String name;

    Size(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public static String getNameForValue(int value) {
        for (Size size : values()) {
            if (size.value == value) {
                return size.name;
            }
        }
        return INVALID.name;
    }
}
