package dev.jocey.test_randomusers.presenter.rvutil;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import dev.jocey.test_randomusers.R;
import dev.jocey.test_randomusers.model.entities.User;
import dev.jocey.test_randomusers.presenter.util.OpenerDetailedActivity;

public class RVAdapter extends RecyclerView.Adapter<VH> {
    private List<User> data = new ArrayList<>();
    private OpenerDetailedActivity opener;

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.bind(data.get(position));
        ((TextView) holder.itemView.findViewById(R.id.full_name))
                .setText(data.get(position).getName().getFirst()+" "+data.get(position).getName().getLast());
        Glide.with(holder.itemView.getContext())
                .load(data.get(position).getPicture().getThumbnail())
                .into((ImageView) holder.itemView.findViewById(R.id.image_list));
        holder.itemView.setOnClickListener(view -> opener.open(data.get(position)));
    }

    public void setData(List<User> list) {
        data.clear();
        data = list;
        notifyDataSetChanged();

    }

    public void setOpener(OpenerDetailedActivity opener) {
        this.opener = opener;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
