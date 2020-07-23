package student_dmitrijs_visuns.homeworks.lesson_10.level_3.task_6;

/*Что такое функциональный интерфейс в Java?

 Функциональный интерфейс отличается от обычного тем, что содержит только 1 абстрактный метод. Это удобно при создании
 анонимных классов (а затем и лямбда-выражений), когда в main методе конкретный метод нужно переопределить и использовать
 один раз, без необходимости создавать отдельный класс.

При использовании аннотации @FunctionalInterface среда разработки уменьшит возможность путаницы, так как даст объявить
лишь один абстрактный метод, что сподвигнет использовать его для одной конкретной задачи.

Следующий шаг - использование функционального интерфейса вместе с лямбда-выражениями, давая по сути использовать их
в коде именно как анонимную функцию, а не как метод (метод всегда имеет привязку к классу). Также функциональный
интерфейс предоставляет для лямбды возвращаемый тип, что позволяет указывать в ней лишь список аргументов и тело.
*/



class Functional {

    @FunctionalInterface
    interface ableToEat {
        void startEating ();
    }

    static class Dinosaur implements ableToEat {
       public void startEating () {
            System.out.println("Dino eats!");
        }
    }

    public static void main(String[] args) {
        Dinosaur dino = new Dinosaur();
        dino.startEating();

        ableToEat animal = new ableToEat() {
            @Override
            public void startEating() {
                System.out.println("This time animal also eats!");
            }
        };
        animal.startEating();
    }

}



