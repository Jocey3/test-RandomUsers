package dev.jocey.test_randomusers.ui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import dev.jocey.test_randomusers.R;
import dev.jocey.test_randomusers.model.entities.User;

public class PersonActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        text = findViewById(R.id.names);
        Bundle arg = getIntent().getExtras();
        User user = (User) arg.getSerializable(PersonActivity.class.getSimpleName());
        text.setText(String.valueOf(user.getName().getFirst()));

    }
}
