package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java";
        System.out.println(idea);
        String newbie = "But I am a newbie. ";
        String sep = ", ";
        idea = idea + sep + newbie;
        int year = 2021;
        idea = idea + year;
        System.out.println(idea);
    }
}
