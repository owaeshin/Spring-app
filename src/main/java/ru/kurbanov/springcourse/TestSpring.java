package ru.kurbanov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicMusic classicMusic = context.getBean("musicBean", ClassicMusic.class);

        System.out.println(classicMusic.getSong());
        System.out.println(classicMusic.getSong());

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer1.playMusic();
//
//        System.out.println(musicPlayer1 == musicPlayer2);

        context.close();
    }
}
