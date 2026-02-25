package cz.ivosahlik.interview.task.mull_it_over_03;

import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;
import static java.util.regex.Pattern.compile;

public class MullItOver {

    // only parent mul(X,Y)
    private static final Pattern MUL_PATTERN = compile("mul\\((\\d{1,3}),(\\d{1,3})\\)");

    public static int sumMultiplications(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Put input dataset!!");
        }
        return MUL_PATTERN.matcher(input)
                .results()
                .mapToInt(value -> parseInt(value.group(1)) * parseInt(value.group(2)))
                .sum();
    }

    static void main(String[] args) {
        String input = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";

        System.out.println(sumMultiplications(input)); // 161
    }
}