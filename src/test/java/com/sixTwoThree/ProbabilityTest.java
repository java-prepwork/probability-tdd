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
}
