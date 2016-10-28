package hackerrank;

/**
 * Created by DDinkov on 28-Oct-16 9:55 AM.
 * https://www.hackerrank.com/challenges/30-inheritance
 */

class Student extends Person {
    private int[] testScores;


    Student(String name, String familyName, int id, int[] scores) {
        super(name, familyName, id);
        this.testScores = scores;
    }

    String calculate() {

        float sumScore = 0;
        for (int score : testScores) {
            sumScore = sumScore + score;
        }
        sumScore = sumScore / testScores.length;
        if (90 <= sumScore && sumScore <= 100)
            return "O";
        if (80 <= sumScore && sumScore < 90)
            return "E";
        if (70 <= sumScore && sumScore < 80)
            return "A";
        if (55 <= sumScore && sumScore < 70)
            return "P";
        if (40 <= sumScore && sumScore < 55)
            return "D";

        return "T";
    }

}
