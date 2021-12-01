package dev.jocey.test_randomusers.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;

import java.io.Serializable;

import butterknife.BindView;
import dev.jocey.test_randomusers.R;
import dev.jocey.test_randomusers.model.Fetcher;
import dev.jocey.test_randomusers.presenter.Presenter;
import dev.jocey.test_randomusers.ui.activity_interfaces.ListViews;
import dev.jocey.test_randomusers.presenter.rvutil.RVAdapter;

public class ListActivity extends AppCompatActivity implements ListViews {


    RecyclerView rv;
    ProgressBar progressBar;
    Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        rv = findViewById(R.id.rv_list);
        progressBar = findViewById(R.id.list_progress);

        presenter = new Presenter(this);
        presenter.prepareAdapter(50, user -> {
            Intent intent = new Intent(this, PersonActivity.class);
            intent.putExtra(PersonActivity.class.getSimpleName(), (Serializable) user);
            startActivity(intent);
        });

    }


    @Override
    public void prepareList(RVAdapter adapter) {
        rv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        rv.setAdapter(adapter);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }
}