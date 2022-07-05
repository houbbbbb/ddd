package com.ddd.ddd.myddd.domain.model.user;

import com.ddd.ddd.myddd.domain.shared.ValueObject;

import java.util.Objects;

/**
 * @author hbw
 */
public class TenantId
        implements ValueObject<TenantId> {

    private Long id;

    @Override
    public boolean sameValueAs(
            TenantId other) {

        return null != other
                && this.id.equals(other.id);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        TenantId tenantId = (TenantId) o;
        return Objects.equals(id, tenantId.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {

        return "TenantId{" +
                "id=" + id +
                '}';
    }

    public String idString() {

        return String.valueOf(this.id);
    }
}
