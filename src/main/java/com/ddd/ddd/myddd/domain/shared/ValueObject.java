package com.ddd.ddd.myddd.domain.shared;

import java.io.Serializable;

/**
 * @author hbw
 */
public interface ValueObject<T>
        extends Serializable {


    /**
     * 值对象通过属性进行比较，值对象没有唯一标识
     * @param other
     * @return
     */
    boolean sameValueAs(
            T other);
}
