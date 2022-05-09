package com.soisson.apreview.model;

public class PointToChoiceMapper
{
    public static String MapDifficulty(int choice)
    {
        switch (choice) {
            case 1:
                return "Easy";
            case 2:
                return "Intermediate";
            case 3:
                return "Hard";
            default:
                return "Hardest";
        }
    }

    public static String MapHomework(int choice)
    {
        switch (choice) {
            case 1:
                return "~0 hours";
            case 2:
                return "less than 1 hour";
            case 3:
                return "1-2 hours";
            default:
                return "more than 2 hours";
        }
    }

    public static String MapAp(int choice)
    {
        switch (choice) {
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            default:
                return "5";
        }
    }

    public static String MapGrade(int choice)
    {
        switch (choice) {
            case 1:
                return "A (95-100)";
            case 2:
                return "A- (90-94)";
            case 3:
                return "B (85-89)";
            case 4:
                return "B- (80-84)";
            case 5:
                return "C (70-79)";
            default:
                return "F (0-69)";
        }
    }

    public static String MapTeacher(int choice)
    {
        switch (choice) {
            case 1:
                return "They teach every day and do it well!";
            case 2:
                return "They teach every day but do so poorly.";
            case 3:
                return "They teach half the time and do it well!";
            case 4:
                return "They teach half the time and do so poorly.";
            case 5:
                return "They don't usually teach, but the class is self-teachable.";
            default:
                return "They don't usually teach, and the class is difficult because of this!";
        }
    }
}
