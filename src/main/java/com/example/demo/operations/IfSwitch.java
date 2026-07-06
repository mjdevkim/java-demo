package com.example.demo.operations;

public class IfSwitch {
    public static void main(String[] args) {
        // If example
        int score = 85;

        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else {
            System.out.println("다음엔 더 잘할 수 있어요!");
        }

        int age = 20;
        boolean isStudent = true;

        if (age >= 18 && isStudent) {
            System.out.println("성인 학생");
        } else {
            System.out.println("성인 학생 아님!");
        }


        // Switch example
        String day = "TUESDAY";

        String dayType = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unknown";
        };

        System.out.println("dayType: " + dayType);

        String dayTypeInBrackets = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> {
                System.out.println("Message: 주중이니까 수업 들어야지");
                yield "Weekday";
            }
            case "SATURDAY", "SUNDAY" -> {
                System.out.println("Message: 주말이다!!!! ><");
                yield "Weekend";
            }
            default -> {
                System.out.println("Error!");
                yield "Unknown";
            }
        };

        System.out.println("dayTypeInBrackets: " + dayTypeInBrackets);

    }
}
