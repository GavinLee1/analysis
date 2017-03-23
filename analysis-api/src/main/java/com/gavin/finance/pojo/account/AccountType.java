package com.gavin.finance.pojo.account;

/**
 * Created by ligaozhao on 23/03/17.
 */
public enum AccountType {

    CASH("cash", 0),
    DEBIT("debit", 1),
    CREDIT("credit", 2),
    INVEST("invest", 3),
    CARD("card", 4),
    VIRTUAL("virtual", 5);

    private String value;
    private int index;

    AccountType(String value, int index) {
        this.value = value;
        this.index = index;
    }

    public String getValue() {
        return this.value;
    }

    public int getIndex() {
        return index;
    }
}
