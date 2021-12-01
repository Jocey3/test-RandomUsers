package dev.jocey.test_randomusers.ui.activity_interfaces;

import dev.jocey.test_randomusers.presenter.rvutil.RVAdapter;

public interface ListViews {
    void prepareList(RVAdapter adapter);
    void showProgress();
    void hideProgress();

}
