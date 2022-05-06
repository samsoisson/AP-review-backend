package com.soisson.apreview.model;

public class ChoiceToPointMapper
{
    public static int MapDifficulty(String choice)
    {
        switch (choice) {
            case "Easy":
                return 1;
            case "Intermediate":
                return 2;
            case "Hard":
                return 3;
            default:
                return 4;
        }
    }

    public static int MapHomework(String choice)
    {
        switch (choice) {
            case "~0 hours":
                return 1;
            case "less than 1 hour":
                return 2;
            case "1-2 hours":
                return 3;
            default:
                return 4;
        }
    }

    public static int MapAp(String choice)
    {
        switch (choice) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            default:
                return 5;
        }
    }

    public static int MapGrade(String choice)
    {
        switch (choice) {
            case "A (95-100)":
                return 1;
            case "A- (90-94)":
                return 2;
            case "B (85-89)":
                return 3;
            case "B- (80-84)":
                return 4;
            case "C (70-79)":
                return 5;
            default:
                return 6;
        }
    }

    public static int MapTeacher(String choice)
    {
        switch (choice) {
            case "They teach every day and do it well!":
                return 1;
            case "They teach every day but do so poorly.":
                return 2;
            case "They teach half the time and do it well!":
                return 3;
            case "They teach half the time and do so poorly.":
                return 4;
            case "They don't usually teach, but the class is self-teachable.":
                return 5;
            default:
                return 6;
        }
    }
}
