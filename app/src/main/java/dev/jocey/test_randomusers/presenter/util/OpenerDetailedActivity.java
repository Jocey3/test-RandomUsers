package dev.jocey.test_randomusers.presenter.util;

import dev.jocey.test_randomusers.model.entities.User;

public interface OpenerDetailedActivity<T> {
    void open(T user);
}
