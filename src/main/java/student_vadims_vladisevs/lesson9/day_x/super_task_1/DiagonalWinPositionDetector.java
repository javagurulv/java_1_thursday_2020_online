package student_vadims_vladisevs.lesson9.day_x.super_task_1;

class DiagonalWinPositionDetector implements WinPosition {

    private int WIN_DISK_COUNT = 4;

    @Override
    public boolean isWin(String[][] gameField, Player player) {

        if (isLeftDiagonalsWin(gameField, player)) {
            return true;
        }


        if (isRightDiagonalsWin(gameField, player)) {
            return true;
        }


        return false;
    }

    private boolean isLeftDiagonalsWin(String[][] gameField, Player player) {
        if (checkLeftDiagonal1(gameField, player)) {
            return true;
        }

        if (checkLeftDiagonal2(gameField, player)) {
            return true;
        }

        if (checkLeftDiagonal3(gameField, player)) {
            return true;
        }
        if (checkLeftDiagonal4(gameField, player)) {
            return true;
        }
        if (checkLeftDiagonal5(gameField, player)) {
            return true;
        }
        if (checkLeftDiagonal6(gameField, player)) {
            return true;
        }

        return false;
    }


    private boolean checkLeftDiagonal1(String[][] gameField, Player player) {

        int count = 0;
        for (int k = 0; k < gameField.length; k++) {
            if (gameField[k][1 + k].equals(player.getSymbol())) {
                count++;
            } else {
                count = 0;
            }
            if (count == WIN_DISK_COUNT) {
                return true;
            }
        }

        return false;
    }

    private boolean checkLeftDiagonal2(String[][] gameField, Player player) {

        int count = 0;
        for (int k = 0; k < gameField.length; k++) {
            if (gameField[k][k].equals(player.getSymbol())) {
                count++;
            } else {
                count = 0;
            }
            if (count == WIN_DISK_COUNT) {
                return true;
            }
        }

        return false;
    }

    private boolean checkLeftDiagonal3(String[][] gameField, Player player) {

        int count = 0;
        try {
            for (int k = 0; k < gameField.length; k++) {
                if (gameField[1 + k][k].equals(player.getSymbol())) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == WIN_DISK_COUNT) {
                    return true;
                }

            }
        } catch (IndexOutOfBoundsException ignored) {
        }

        return false;
    }

    private boolean checkLeftDiagonal4(String[][] gameField, Player player) {

        int count = 0;
        try {
            for (int k = 0; k < gameField.length; k++) {
                if (gameField[2 + k][k].equals(player.getSymbol())) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == WIN_DISK_COUNT) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException ignored) {
        }

        return false;
    }

    private boolean checkLeftDiagonal5(String[][] gameField, Player player) {

        int count = 0;
        try {
            for (int k = 0; k < gameField.length; k++) {
                if (gameField[k][2 + k].equals(player.getSymbol())) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == WIN_DISK_COUNT) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException ignored) {
        }

        return false;
    }

    private boolean checkLeftDiagonal6(String[][] gameField, Player player) {

        int count = 0;
        try {
            for (int k = 0; k < gameField.length; k++) {
                if (gameField[k][3 + k].equals(player.getSymbol())) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == WIN_DISK_COUNT) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException ignored) {
        }

        return false;
    }


    private boolean isRightDiagonalsWin(String[][] gameField, Player player) {
        if (checkRightDiagonal1(gameField, player)) {
            return true;
        }
        if (checkRightDiagonal2(gameField, player)) {
            return true;
        }
        if (checkRightDiagonal3(gameField, player)) {
            return true;
        }
        if (checkRightDiagonal4(gameField, player)) {
            return true;
        }
        if (checkRightDiagonal5(gameField, player)) {
            return true;
        }
        if (checkRightDiagonal6(gameField, player)) {
            return true;
        }

        return false;
    }

    private boolean checkRightDiagonal1(String[][] gameField, Player player) {
        int count = 0;

        for (int k = 0; k < gameField.length; k++) {
            if (gameField[k][6 - k].equals(player.getSymbol())) {
                count++;
            } else {
                count = 0;
            }

            if (count == WIN_DISK_COUNT) {
                return true;
            }
        }
        return false;
    }

    private boolean checkRightDiagonal2(String[][] gameField, Player player) {
        int count = 0;

        try {
            for (int k = 0; k < gameField.length; k++) {
                if (gameField[k][5 - k].equals(player.getSymbol())) {
                    count++;
                } else {
                    count = 0;
                }

                if (count == WIN_DISK_COUNT) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException ignored){

        }
        return false;
    }

    private boolean checkRightDiagonal3(String[][] gameField, Player player) {
        int count = 0;

        try {
            for (int k = 0; k < gameField.length; k++) {
                if (gameField[k][4 - k].equals(player.getSymbol())){
                    count++;
                } else {
                    count = 0;
                }

                if (count == WIN_DISK_COUNT) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException ignored){

        }
        return false;
    }

    private boolean checkRightDiagonal4(String[][] gameField, Player player) {
        int count = 0;

        try {
            for (int k = 0; k < gameField.length; k++) {
                if (gameField[k][3 - k].equals(player.getSymbol())){
                    count++;
                } else {
                    count = 0;
                }

                if (count == WIN_DISK_COUNT) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException ignored){

        }
        return false;
    }

    private boolean checkRightDiagonal5(String[][] gameField, Player player) {
        int count = 0;

        try {
            for (int k = 0; k < gameField.length; k++) {
                if (gameField[1 + k][6 - k].equals(player.getSymbol())){
                    count++;
                } else {
                    count = 0;
                }

                if (count == WIN_DISK_COUNT) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException ignored){

        }
        return false;
    }

    private boolean checkRightDiagonal6(String[][] gameField, Player player) {
        int count = 0;

        try {
            for (int k = 0; k < gameField.length; k++) {
                if (gameField[2 + k][6 - k].equals(player.getSymbol())){
                    count++;
                } else {
                    count = 0;
                }

                if (count == WIN_DISK_COUNT) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException ignored){

        }
        return false;
    }
}
