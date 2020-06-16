package student_dmitrijs_visuns.homeworks.lesson_8.level_2;

/*Как вызвать конструктор родительского класса?
        Когда это нужно делать?
        Приведите пример кода.*/

class Task_7 {

    class Mother {
    }


    class Father {
        private boolean beard;

        public Father(boolean beard) {
            this.beard = beard;
        }

    }

    class Child extends Father {

        private int age;

        public Child(boolean beard, int age) {
            super(beard);
            this.age = age;
        }

    }

}


