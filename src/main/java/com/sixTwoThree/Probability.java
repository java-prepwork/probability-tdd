package com.sixTwoThree;

class Probability {


    private final double probabilityValue;

    Probability(double probabilityValue)
    {
        this.probabilityValue = probabilityValue;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(this.getClass() != obj.getClass())
        {
            return false;
        }
        return this.probabilityValue == ((Probability)obj).probabilityValue;
    }

    public Object multiply(Probability secondProbability) {
        return this.probabilityValue * ((Probability) secondProbability).probabilityValue;
    }
}

//class CoinToss extends Probability{
//    CoinToss(int favourableOutcome, int totalSampleSpace)
//    {
//        super(favourableOutcome, totalSampleSpace);
//    }
//}
