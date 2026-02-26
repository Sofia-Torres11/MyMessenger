package co.edu.mymessenger;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        TextView messageView = findViewById(R.id.received_message);

        String message = getIntent().getStringExtra("CHAT_MESSAGE");

        if (message != null) {
            messageView.setText(message);
        }
    }
}