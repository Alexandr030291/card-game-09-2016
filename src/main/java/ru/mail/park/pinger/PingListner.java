package ru.mail.park.pinger;

import org.jetbrains.annotations.NotNull;

public interface PingListner {

    void notifyUserDisconnect(@NotNull String userName);
}
