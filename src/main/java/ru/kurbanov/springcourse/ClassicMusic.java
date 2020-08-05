package ru.kurbanov.springcourse;

public class ClassicMusic implements Music {

    private ClassicMusic() {
    }

    public static ClassicMusic getClassicalMusic() {
        return new ClassicMusic();
    }

    public void init() {
        System.out.println("Doing init");
    }

    public void destroy() {
        System.out.println("Doing destroy");
    }

    @Override
    public String getSong() {
        return "Classic";
    }
}
