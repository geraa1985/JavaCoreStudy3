package Lesson_5;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Car implements Runnable {
    private static int CARS_COUNT;

    static {
        CARS_COUNT = 0;
    }

    private final Race race;
    private final int speed;
    private final String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }


    private static final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static final AtomicBoolean win = new AtomicBoolean(true);
    private static String winner;

    public static String getWinner() {
        return winner;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            MainClass.cdlReady.countDown();
            MainClass.cbReady.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        readWriteLock.writeLock().lock();
        if (win.get()) {
            winner = this.getName();
            win.set(false);
        }
        readWriteLock.writeLock().unlock();

        MainClass.cdlFinish.countDown();
    }
}
