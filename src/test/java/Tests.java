import Task_1.TwoDemArray;

import static org.junit.Assert.*;

import Task_2.RandomArray;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

@Slf4j
public class Tests {

    @Test
    public void task1() {
        log.info("======================= Task 1 =======================\n");
        TwoDemArray twoDemArray;
        int sqrtIter = 10;
        for (int i = 1; i < sqrtIter; i++) {
            for (int j = sqrtIter - 1; j > 0; j--) {

                // half of results will contain Infinity
                boolean containsInfinity = i % 2 == 0;

                twoDemArray = new TwoDemArray(i, j, containsInfinity).fillIn();
                log.info("Current array : {}", Arrays.deepToString(twoDemArray.getTwoDemArr()));
                double result = twoDemArray.max();
                double expected = Collections.max(Arrays.stream(twoDemArray.getTwoDemArr()).flatMap(x -> Arrays.stream(x).boxed()).collect(Collectors.toList()));
                log.info("Max value is: {}", result);
                assertEquals(expected, result, 10);
            }
        }
    }

    @Test
    public void task2() {
        log.info("======================= Task 2 =======================\n");
        RandomArray randomArray;
        int size = 100;
        int iter = 100;
        for (int i = 0; i < iter; i++) {
            randomArray = new RandomArray(size);
            int[] expectedArray = randomArray.getArray().clone();
            int[] sortedArray = randomArray.quickSortArray().getArray();
            if (size <= 100) log.info("Sorted array: {}", Arrays.toString(sortedArray));
            Arrays.sort(expectedArray);
            assertArrayEquals(expectedArray, sortedArray);
        }
    }
}
