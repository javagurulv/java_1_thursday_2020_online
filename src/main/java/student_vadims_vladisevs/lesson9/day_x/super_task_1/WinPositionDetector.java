package student_vadims_vladisevs.lesson9.day_x.super_task_1;

import java.util.ArrayList;
import java.util.List;

class WinPositionDetector {

     private List<WinPosition> winPositions;

     public WinPositionDetector(){
         this.winPositions = new ArrayList<>();
         winPositions.add(new HorizontalWinPositionDetector());
         winPositions.add(new VerticalWinPositionDetector());
         winPositions.add(new DiagonalWinPositionDetector());
     }

     public boolean isWin(String[][] gameField, Player player){

         for (WinPosition detector : winPositions) {
             if (detector.isWin(gameField, player)){
                 return true;
             }
         }
         return false;
     }
}
