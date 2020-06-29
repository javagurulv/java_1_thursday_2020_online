package student_oleg_ivanov.lesson7.Day1;

class DemoWordService {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String mostFrequentWords = wordService.findMostFrequentWord
                ("Big dogs do not like small dogs and small cats ");
        System.out.println("The first most frequent word is: " + mostFrequentWords);

    }
}
