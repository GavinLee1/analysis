package com.gavin.finance.pojo.account;

import java.sql.Timestamp;

/**
 * Created by ligaozhao on 23/03/17.
 */
public class Account {

    private int id;

    private int userId;

    private String name;

    private AccountType accountType;

    private long balance;

    private String note;

    private Timestamp createTime;

    private Timestamp updateTime;

    public Account(int userId, String name, AccountType accountType, long balance, String note, Timestamp createTime, Timestamp updateTime) {
        this.userId = userId;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
        this.note = note;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
