package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int[] testScores = {67, 73, 81, 92, 65, 99, 70, 83, 74, 95}; // 10 Test Scores

        int average = 0;
        for (int score : testScores) {
            average += score;
        }
        int totalAverage = (average / testScores.length); // Finds average test score

        System.out.println("Total Average: " + totalAverage); // Prints total average score

        int highScore = testScores[0];
        for (int score : testScores) {
            if (score > highScore) // Searches for higher values
                highScore = score;
        }
        System.out.println("Highest Score: " + highScore); // Prints highest value

        int lowScore = testScores[0];
        for (int score : testScores) {
            if (score < lowScore) // Searches for lowest value
                lowScore = score;
        }
        System.out.println("Lowest Score: " + lowScore); // Prints lowest value


    }

}
