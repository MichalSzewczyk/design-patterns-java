package com.szewczyk.learning.patterns.lazyinit;

import java.math.BigDecimal;
import java.util.Collection;

import static java.math.BigDecimal.ZERO;
import static java.util.Arrays.asList;
import static java.util.Objects.isNull;

/**
 * Lazy initialization pattern combined with double-check idiom.
 * Since new memory model introduced in Java 1.5, we can safely use volatile to ensure
 * consistent view of variable between different threads.
 */
public final class SumCalculation implements Calculation {
    private final Collection<BigDecimal> arguments;
    private final Object lock = new Object();
    private volatile BigDecimal result;

    public SumCalculation(BigDecimal... arguments) {
        this.arguments = asList(arguments);
    }

    /**
     * Local variable is used to improve performance - ensure that the value is read only in single context
     */
    @Override
    public final BigDecimal calculate() {
        BigDecimal localResult = result;
        if (isNull(localResult)) {
            synchronized (lock) {
                localResult = result;
                if (isNull(localResult)) {
                    result = localResult = sumArguments();
                }
            }
        }
        return localResult;
    }

    private BigDecimal sumArguments() {
        return arguments.stream().reduce(BigDecimal::add).orElse(ZERO);
    }
}
