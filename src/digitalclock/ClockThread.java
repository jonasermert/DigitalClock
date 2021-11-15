package digitalclock;

import java.util.Date;

/**
 * author: Jonas Ermert
 * version 1.0
 */

public class ClockThread extends Thread {

    DigitalClock dc;
    String time;

    public ClockThread(DigitalClock dc) {
        this.dc = dc;
        start();
    }

    public void run(){
        while(true){

            time = "" + new Date();
            dc.jlabClock.setText(time);

        }
    }





}
