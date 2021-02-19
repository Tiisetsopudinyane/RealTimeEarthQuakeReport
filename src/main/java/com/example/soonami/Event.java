package com.example.soonami;

public class Event {
    public final long time;
    public final String title;
    public final int tsunamiAlert;

    public Event(String title, long time, int tsunamiAlert) {
        this.title = title;
        this.time = time;
        this.tsunamiAlert = tsunamiAlert;
    }
}
