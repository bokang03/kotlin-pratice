package ch23;

class Person {
    String name;
    int age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public void printInfo() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Person person = new Person()
                .setName("Alice")
                .setAge(30);
        person.printInfo();
    }
}
