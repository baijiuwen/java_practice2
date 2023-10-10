package com.eb.timer;

import org.junit.Test;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author:
 * @date: 2023/10/7
 */
public class Schedule {


    @Test
    public void timer() throws InterruptedException {
        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("运行定时器任务");
//            }
//        },3000);
        // 需要主线程不停止
        timer.schedule(new TimerTaskTmp(), 3000);
        Thread.sleep(5000);
    }

}

class TimerTaskTmp extends TimerTask {

    @Override
    public void run() {
        System.out.println("运行定时器任务");
    }
}
