package com.ddd.ddd.demo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author hbw
 */
public final class DemoId
        implements Serializable {

    public DemoId(Long id) {

        setId(id);
    }

    private Long id;

    private void setId(Long id) {

        if (id == null) {

            throw new IllegalArgumentException("id不能为空");
        }

        this.id = id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        DemoId demoId = (DemoId) o;
        return Objects.equals(id, demoId.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
