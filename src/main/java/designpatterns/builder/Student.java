package designpatterns.builder;

/**
 * @author karamanmert
 * @date 16.11.2024
 */
public class Student {

    private final int id;
    private final String name;
    private final int age;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder {
        private int id;
        private String name;
        private int age;

        public Builder id(int id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
