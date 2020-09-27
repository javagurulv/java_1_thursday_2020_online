package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

class CountAliveNeighbours {

    public int count (boolean[][]currentGeneration, int row, int column) {

        int neighboursCount = 0;

        if (currentGeneration [row-1][column-1]) {neighboursCount++;}
        if (currentGeneration [row-1][column]) {neighboursCount++;}
        if (currentGeneration [row-1][column+1]) {neighboursCount++;}
        if (currentGeneration [row][column-1]) {neighboursCount++;}
        if (currentGeneration [row][column+1]) {neighboursCount++;}
        if (currentGeneration [row+1][column-1]) {neighboursCount++;}
        if (currentGeneration [row+1][column]) {neighboursCount++;}
        if (currentGeneration [row+1][column+1]) {neighboursCount++;}

        return neighboursCount;

    }

}
