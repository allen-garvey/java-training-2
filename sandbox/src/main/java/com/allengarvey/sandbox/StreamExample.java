package com.allengarvey.sandbox;

import java.util.Arrays;
import java.util.Optional;

public class StreamExample {
    FeeProfile[] feeProfiles = {
            new FeeProfile("USD", 1.01, 0.45, 1),
            new FeeProfile("EUR", 1.01, 0.25, 1),
            new FeeProfile("USD", 1.00, 0.20, 0),
    };

    public static Optional<FeeProfile> feeProfileStreamExample(
            FeeProfile[] feeProfiles, String currency, double fixed, double percentage) {
        return Arrays.stream(feeProfiles)
                .filter(feeProfile -> feeProfile.getCurrency().equals(currency))
                .filter(feeProfile -> feeProfile.getMinimum() == 0)
                .filter(feeProfile -> feeProfile.getFixed() == fixed)
                .filter(feeProfile -> feeProfile.getPercentage() == percentage)
                .findFirst();
    }
}
