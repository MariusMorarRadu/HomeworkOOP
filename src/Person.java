public class Person {
    private String name;

    private Integer age;

    private boolean married;


    public String detailsPerson(){
        return "Numele persoanei este " + name + " cu varsta de " + age + " si este casatorita = " + married;
    }

    public Person(String name, Integer age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;


    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }
}
