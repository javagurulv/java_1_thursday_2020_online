package student_aleksey_kodin.lesson3.javagurulv.moodle.level2;

class Encoder {
private char chSymbol;
private short shCode;

     void encode(short code) {
         shCode = code;
         chSymbol = (char) code;
     }
     void decode(char symbol) {
         chSymbol = symbol;
         shCode = (short) symbol;
    }
    char getSymbol() {
        return chSymbol;
    }
    short getCode() {
         return shCode;
    }
}
