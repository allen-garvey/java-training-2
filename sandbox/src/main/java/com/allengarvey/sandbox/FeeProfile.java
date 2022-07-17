package com.allengarvey.sandbox;

public class FeeProfile {
    private String currency;
    private double fixed;
    private double percentage;
    private int minimum;

    public FeeProfile(String currency, double fixed, double percentage, int minimum) {
        this.currency = currency;
        this.fixed = fixed;
        this.percentage = percentage;
        this.minimum = minimum;
    }

    public String getCurrency() {
        return currency;
    }

    public double getFixed() {
        return fixed;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getMinimum() {
        return minimum;
    }
}
