public class PersonTest {
    public static void main(String[] args) {
        Person vasa = new Person(true, "Вася");
        Person peta = new Person(true, "Петя");
        Person macha = new Person(false, "Маша");
        Person andrey= new Person(true, "Андрей");
        Person sergry = new Person(true, "Сергей");
        Person marina = new Person(false, "Марина");
        Person alisa = new Person(false, "Алиса");

        System.out.println(vasa.toString());
        System.out.println(macha.toString());
        System.out.println(sergry.toString());
        System.out.println(alisa.toString());

        marry_test(vasa, peta);
        marry_test(vasa, macha);
        marry_test(macha, alisa);
        marry_test(macha, andrey);
        marry_test(vasa, marina);
        marry_test(sergry, alisa);
    }

    public static void marry_test(Person person1, Person person2) {
        if (!person1.marry(person2)) {
            System.out.println("Невозможно поженить " + person1.name() + " и " + person2.name());
            System.out.println();
        }
        else {
            System.out.println("Свадьба!");
            System.out.println(person1.toString());
            System.out.println(person2.toString());
            System.out.println();
        }
    }
}
