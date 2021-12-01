package dev.jocey.test_randomusers.presenter.rvutil;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import dev.jocey.test_randomusers.model.entities.User;

public class VH extends RecyclerView.ViewHolder {
    private User user;

    public VH(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(User user) {
        this.user = user;
    }
}
