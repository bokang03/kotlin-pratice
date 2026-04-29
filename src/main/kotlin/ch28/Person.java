package ch28;

class Person {
    String name;
    int age;
    double weight;
    double salary;

    public Person(String name, int age, double weight, double salary) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.salary = salary;
    }

    public void increaseAge(int years) {
        this.age += years;
    }

    public void increaseWeight(double kg) {
        this.weight += kg;
    }

    public void increaseSalary(double amount) {
        this.salary += amount;
    }

    public String getInfo() {
        return name + " is " + age + " years old, weighs " + weight + "kg, and earns $" + salary;
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30, 55.0, 50000.0);

        // with와 비슷한 방식으로 메서드 체이닝 사용
        person.increaseAge(5);
        person.increaseWeight(3.5);
        person.increaseSalary(10000);
        String info = person.getInfo();

        System.out.println(info);
    }
}