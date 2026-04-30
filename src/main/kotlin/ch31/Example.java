package ch31;

class Example {
    private String value;

    public String getValue() {
        if (value == null) {
            value = "Hello, Lazy!";
        }
        return value;
    }

    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.getValue());
        System.out.println(example.getValue());
    }
}
