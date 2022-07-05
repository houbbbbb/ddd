package com.ddd.ddd.myddd.domain.model.user;

import com.ddd.ddd.myddd.domain.shared.Entity;

/**
 * @author hbw
 */
public class User
        implements Entity<User> {

    private TenantId tenantId;

    @Override
    public boolean sameIdentityAs(
            User other) {

        return null != other
                && this.tenantId.sameValueAs(other.tenantId);
    }
}
