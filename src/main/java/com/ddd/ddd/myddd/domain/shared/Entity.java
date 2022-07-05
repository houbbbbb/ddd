package com.ddd.ddd.myddd.domain.shared;

/**
 * @author hbw
 */
public interface Entity<T> {

    /**
     * 实体通过唯一标识进行比较
     * @param other
     * @return
     */
    boolean sameIdentityAs(
            T other);
}
