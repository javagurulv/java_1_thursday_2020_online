package student_vadims_vladisevs.lesson9.day_x.super_task_1;

class VerticalWinPositionDetector implements WinPosition {

    private int WIN_DISK_COUNT = 4;

    @Override
    public boolean isWin(String[][] gameField, Player player) {

        for (int j = 0; j < gameField[0].length; j++){
            int count = 0;
            for (String[] strings : gameField) {

                if (strings[j].equals(player.getSymbol())) {
                    count++;
                } else {
                    count = 0;
                }

                if (count == WIN_DISK_COUNT) {
                    return true;
                }
            }
        }
        return false;
    }
}
