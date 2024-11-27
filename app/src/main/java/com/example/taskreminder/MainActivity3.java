package com.example.taskreminder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity3 extends AppCompatActivity {
    private EditText editTextActivityName;
    private Button buttonAdd;
    private TextView textViewActivities;
    private StringBuilder activities;
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main3);
        editTextActivityName = findViewById(R.id.editTextActivityName);
        buttonAdd = findViewById(R.id.buttonAdd);
        textViewActivities = findViewById(R.id.textViewActivities);
        activities = new StringBuilder();
        buttonAdd.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { String activityName = editTextActivityName.getText().toString();
            if (!activityName.isEmpty()) { activities.append(activityName).append("\n");
                textViewActivities.setText(activities.toString());
                editTextActivityName.setText("");
            }
        }
        });
    }

}