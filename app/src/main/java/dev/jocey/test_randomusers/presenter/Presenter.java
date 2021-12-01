package dev.jocey.test_randomusers.presenter;

import android.util.Log;

import dev.jocey.test_randomusers.model.Fetcher;
import dev.jocey.test_randomusers.presenter.rvutil.RVAdapter;
import dev.jocey.test_randomusers.presenter.util.OpenerDetailedActivity;
import dev.jocey.test_randomusers.ui.activity_interfaces.ListViews;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Response;

public class Presenter {
    Fetcher fetcher;
    ListViews view;

    public Presenter(ListViews view) {
        fetcher = new Fetcher();
        this.view = view;
    }

    public void prepareAdapter(Integer amount, OpenerDetailedActivity opener) {
        RVAdapter adapter = new RVAdapter();
        view.prepareList(adapter);
        adapter.setOpener(opener);
        fetcher.getUsers(amount)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(disposable -> {
                    view.showProgress();
                })
                .doAfterTerminate(() -> {
                    view.hideProgress();

                })
                .subscribe((users) -> {
                    adapter.setData(users);
                    Log.d("myLog", "users: " + users.size());
                }, throwable -> {
                    throwable.printStackTrace();
                    Log.d("myLog", "Exception: " );
                });
    }
}
