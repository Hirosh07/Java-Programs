public class ${NAME} {
    public static void main(String[] args) {
        Human human1 = new Human("blah", 19, 188);
        Human human2 = new Human("blah", 21, 155);
        System.out.println(human2.name);
        human1.eat();
        human2.drink();
    }

        public static class Human {

            String name;
            int age;
            double weight;

            Human(String name, int age, double weight) {
                this.name = name;
                this.age = age;
                this.weight = weight;

            }

            void eat() {
                System.out.println(this.name + " is eating");
            }

            void drink() {
                System.out.println(this.name + " is drinkng At the age of " + this.age);
            }

        }

}