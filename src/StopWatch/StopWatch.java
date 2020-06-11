package StopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;


    public long start() {
        return this.startTime = new Date().getTime();
    }

    public long stop() {
        return this.endTime = new Date().getTime();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
