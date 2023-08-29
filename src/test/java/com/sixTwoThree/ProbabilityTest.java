package com.sixTwoThree;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ProbabilityTest {

    @Test
    void toCheckEqualityWhenProbabilityOfHeadsInCoinTossAndProbabilityOfTailInCoinToss(){
        Probability probabilityOfHeadInACoinToss = new Probability(0.5);
        Probability probabilityOfTailInACoinToss = new Probability(0.5);

        assertThat(probabilityOfHeadInACoinToss,is(equalTo(probabilityOfTailInACoinToss)));
    }


    @Test
    void toReturnOneWhenTwoProbabilitiesAreCertainEventAndAnotherCertainEvent(){
        Probability certainEvent = new Probability(1);
        Probability anotherCertainEvent = new Probability(1);
        assertThat(certainEvent.multiply(anotherCertainEvent), is(equalTo(1.0)));
    }

    @Test
    void toReturnZeroPointOneTwoFiveWhenTwoProbabilitiesAreZeroPointTwoFiveAndZeroPointFive(){
        Probability quarterProbability = new Probability(0.25);
        Probability halfProbability = new Probability(0.5);
        assertThat(quarterProbability.multiply(halfProbability), is(equalTo(0.125)));
    }
}
