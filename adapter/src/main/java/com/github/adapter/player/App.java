package com.github.adapter.player;

/**
 * Created by zhiyong.bao on 2017/6/1.
 */
public class App {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4", "This is a mp4");
        audioPlayer.play("vlc", "this is a vlc media");
    }
}
