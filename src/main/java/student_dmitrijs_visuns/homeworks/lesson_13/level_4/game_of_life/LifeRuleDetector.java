package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

import java.util.ArrayList;
import java.util.List;

class LifeRuleDetector {

    boolean IsAlive(boolean[][] currentGeneration, int row, int column) {
        LifeRule1 lifeRule1 = new LifeRule1();
        LifeRule2 lifeRule2 = new LifeRule2();
        LifeRule3 lifeRule3 = new LifeRule3();
        LifeRule4 lifeRule4 = new LifeRule4();

        List<LifeRule> lifeRulesList = new ArrayList<>();
        lifeRulesList.add(lifeRule1);
        lifeRulesList.add(lifeRule2);
        lifeRulesList.add(lifeRule3);
        lifeRulesList.add(lifeRule4);

        boolean isAlive = currentGeneration[row][column];
        for (LifeRule lifeRule : lifeRulesList) {
            boolean result = lifeRule.isActivated(currentGeneration, row, column);
            isAlive = result;
        }
        return isAlive;

    }
}
