package student_diana_miranovica.head_first_java_java_folosophi_groking_algoritms;

class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-звенный",
        "30000-футовый","взаимный","обоюдный выйгрыш","фронтэнд",
        "на основе веб-технологий","проникающий","умный","шесть сигм",
        "метод критического пути","динамичный"};

        String[] wordListTwo = {"полномоченный","трудный","чистый продукт",
        "ориентированный","центральный","распределенный",
        "кластеризованный","фирменный","нестандартый ум",
        "позиционированный","сетевой","сфокусированный",
                "использованный с выгодой","выровненный","нацеленный на ",
        "общий","совместный","ускоренный"};

        String[] wordListThree ={"процусс","пункт разгрузки","выход из положения",
        "тип структуры","таланта","подход","уровень завоеванного внимания",
        "портал","период времени","обзор","образец","пункт иследования"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2]+ " " +
                wordListThree[rand3];

        System.out.println("Все, что нам нужно, - это  " + phrase);
    }
}
