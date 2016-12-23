package ru.mail.park.pinger;

public class TimingData {
    private final long clientPing;
    private final long clientTimeshift;

    public TimingData(long clientPing, long clientTimeshift) {
        this.clientPing = clientPing;
        this.clientTimeshift = clientTimeshift;
    }

    public long getClientTimeshift() {
        return clientTimeshift;
    }

    public long getClientPing() {
        return clientPing;
    }
}
