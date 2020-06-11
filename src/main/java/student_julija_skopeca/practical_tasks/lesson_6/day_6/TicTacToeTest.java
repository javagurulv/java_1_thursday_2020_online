package student_julija_skopeca.practical_tasks.lesson_6.day_6;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.createFieldTest();
    }

    public void createFieldTest() {
        TicTacToe game = new TicTacToe();
        int[][] field = game.createField();
        int result = 0;
        for(int i=0;i<field.length;i++) {
            for(int j=0;j<field.length;j++) {
                result+=field[i][j];
            }
        }
        if (result == -9 ) {
            System.out.println("createFieldTest - OK");
        } else {
            System.out.println("createFieldTest - FAIL");
        }
    }

}
