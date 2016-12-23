package ru.mail.park.model.game;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Room extends Deck{
    private final Set<Long> users = new HashSet<>();
    private final Stack<Long> place = new Stack<>();
    private final Stack<Long> lose = new Stack<>();
    private boolean full = false;
    private long bank = 0;
    private final Stack<Long> reward =new Stack<>();

    public int addUser(long user_id){
        if (full) return -1;
        users.add(user_id);
        full=(users.size()==5);
        return users.size();
    }

    public boolean checkFullRoom(){
        return full;
    }

    public Stack<Long> getPlace() {
        return place;
    }

    public Set<Long> getUsers() {
        return users;
    }

    public Stack<Long> getLose() {
        return lose;
    }

    public long getBank() {
        return bank;
    }

    public Stack<Long> getReward() {
        return reward;
    }

    public void setBank(long bank) {
        this.bank = bank;
    }
}
