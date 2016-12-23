package ru.mail.park.model.User;

import ru.mail.park.model.Id;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UserProfile {
    private final String login;
    private long score;
    @NotNull
    private final Id<UserProfile> id;

    public UserProfile(Integer id, String login, long score) {
        this.login = login;
        this.id = Id.of(id);
        this.score = score;
    }

    public String getLogin() {
        return login;
    }


    @NotNull
    public Id<UserProfile> getId() {
        return id;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }
}

