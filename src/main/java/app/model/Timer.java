package app.model;

import org.springframework.stereotype.Component;

public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
