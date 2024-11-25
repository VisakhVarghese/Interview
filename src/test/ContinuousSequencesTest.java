package test;


import String.*;
import org.junit.Test;

import java.util.logging.Logger;

public class ContinuousSequencesTest {
    static Logger logger = Logger.getLogger(String.valueOf(ContinuousSequencesTest.class));

    @Test
    public void printSequencestest1(){
        logger.info("Start Sequence test 1...");
        String input = "1,2,3,5,9,a,6,7,8,4,@,-5,-7,-3,-2,-1";
        ContinuousSequences.printSequences(input);
        logger.info("End Sequence test 1...");

    }

}
