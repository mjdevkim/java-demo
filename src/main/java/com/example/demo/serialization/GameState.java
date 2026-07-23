package com.example.demo.serialization;

import java.io.*;
import java.time.LocalDateTime;

public class GameState implements Serializable {
    private static final long serialVersionUID = 1L;

    private String playerName;
    private int level;
    private int experience;
    private int gold;
    private LocalDateTime saveTime;

    private transient boolean isPaused;
    private transient int fps;


    public GameState(String playerName) {
        this.playerName = playerName;
        this.level = 1;
        this.experience = 0;
        this.gold = 100;
        this.saveTime = LocalDateTime.now();
    }

    public static void save(GameState state, String filename) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            objectOutputStream.writeObject(state);
            System.out.println("GameState 직렬화 완료: " + filename);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static GameState load(String filename) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (GameState) objectInputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
