interface FeeProfile {
    currency: string;
    fixed: number;
    percentage: number;
    minimum: number;
}

const feeRules: FeeProfile[] = [
    {
        currency: 'USD',
        fixed: 1.45,
        percentage: 0.4,
        minimum: 1,
    },
    {
        currency: 'EU',
        fixed: 1.45,
        percentage: 0.2,
        minimum: 0,
    },
    {
        currency: 'USD',
        fixed: 1.85,
        percentage: 0.25,
        minimum: 0,
    },
];

const findFeeProfile = 
    (feeRules: FeeProfile[], currency: string, fixed: number, percentage: number): FeeProfile | undefined => 
        feeRules
            .filter(feeRule => feeRule.currency === currency)
            .filter(feeRule => feeRule.minimum === 0)
            .filter(feeRule => feeRule.fixed === fixed)
            .filter(feeRule => feeRule.percentage === percentage)
            .find(feeRule => feeRule);
