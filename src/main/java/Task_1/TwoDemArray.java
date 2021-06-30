package Task_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static java.lang.Math.*;

public class TwoDemArray {

    private static final double sinSinC = sin(sin(-1.49));
    private static final double lnLn4D = 4 * log(log(23.4));
    private static final double infinity = 1 / 0d;
    private final boolean withOutInfinity;
    private final double[][] twoDemArr;

    public TwoDemArray(int firstSize, int secondSize, boolean withOutInfinity) throws IllegalArgumentException {
        if (firstSize <= 0 || secondSize <= 0) throw new IllegalArgumentException("Array can't be created!");
        this.withOutInfinity = withOutInfinity;
        this.twoDemArr = new double[firstSize][secondSize];
    }

    /* There are two ways to fill the given array (with Infinity and without it)
    Given function is descending therefore max value will be Infinity or 2.3308338696153656 */
    public TwoDemArray fillIn() {
        for (int i = 0; i < twoDemArr.length; i++) {
            for (int j = 0; j < twoDemArr[i].length; j++) {
                twoDemArr[i][j] = function(i, j);
            }
        }
        return this;
    }

    public double[][] getTwoDemArr() {
        return twoDemArr;
    }

    private double function(int i, int j) {
        return withOutInfinity ? sqrt(abs(sinSinC - lnLn4D / pow(i + 1, j + 1))) : sqrt(abs(sinSinC - lnLn4D / pow(i, j)));
    }

    // if array can't contain infinity max value will be 2.3308338696153656
    public double max() {
       return withOutInfinity || getTwoDemArr()[0].length == 1 ? 2.3308338696153656 : infinity;//
    }

}
