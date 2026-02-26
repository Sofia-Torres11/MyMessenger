package co.edu.mymessenger;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    // 👇 ESTE MÉTODO VA FUERA DEL onCreate
    public void sendMessage(View view) {
        EditText input = findViewById(R.id.message_input);
        String message = "Cliente: " + input.getText().toString();

        Intent intent = new Intent(
                CreateMessageActivity.this,
                ReceiveMessageActivity.class
        );

        intent.putExtra("CHAT_MESSAGE", message);
        startActivity(intent);
    }
}