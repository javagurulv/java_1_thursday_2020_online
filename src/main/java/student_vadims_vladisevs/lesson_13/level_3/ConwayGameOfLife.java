package student_vadims_vladisevs.lesson_13.level_3;

class ConwayGameOfLife {

    public boolean[][] calculateNextGeneration(boolean[][] currentGeneration) {

        boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];

        for (int i = 0; i < currentGeneration.length; i++){
            for (int j = 0; j < currentGeneration[0].length; j++){

                int numberOfLivingCells = numberOfLivingNeighborsCells(currentGeneration, i,j);

                if (numberOfLivingCells < 2){
                    nextGeneration[i][j] = false;
                }

                if (numberOfLivingCells > 3){
                    nextGeneration[i][j] = false;
                }

                if (currentGeneration[i][j] && numberOfLivingCells == 2 || currentGeneration[i][j] && numberOfLivingCells == 3){
                    nextGeneration[i][j] = true;
                }

                if (!currentGeneration[i][j] && numberOfLivingCells == 3){
                    nextGeneration[i][j] = true;
                }
            }
        }
        return nextGeneration;
    }


    private int numberOfLivingNeighborsCells(boolean[][] currentGeneration, int row, int column){
        return checkFirstRow(currentGeneration, row, column) + checkSecondRow(currentGeneration, row, column) + checkThirdRow(currentGeneration, row, column);
    }

    private int checkFirstRow(boolean[][] currentGeneration, int row, int column) {
        int cellCount = 0;

        for (int i = -1; i < 2; i++){
            try{
                if(currentGeneration[row - 1][column + i]){
                    cellCount++;
                }
            }catch (IndexOutOfBoundsException ignored){
            }
        }

        return cellCount;
    }

    private int checkSecondRow(boolean[][] currentGeneration, int row, int column){
        int cellCount = 0;

        for (int i = -1; i < 2; i = i+ 2){
            try {
                if (currentGeneration[row][column + i]) {
                    cellCount++;
                }
            }catch (IndexOutOfBoundsException ignored){
            }
        }

        return cellCount;
    }

    private int checkThirdRow(boolean[][] currentGeneration, int row, int column){
        int cellCount = 0;

        for (int i = -1; i < 2; i++) {
            try {
                if (currentGeneration[row + 1][column + i]) {
                    cellCount++;
                }
            }catch (IndexOutOfBoundsException ignored){
            }
        }

        return cellCount;
    }
}
