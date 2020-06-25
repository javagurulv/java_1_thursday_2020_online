package student_diana_miranovica.lesson6.home_works.day_5.task_19;

 class Move {

     private final int row;
     private final int column;


     Move(int column, int row) {
         this.row = row;
         this.column = column;
     }

     public int getColumn() {
         return column;
     }

     public int getRow() {
         return row;
     }
 }
