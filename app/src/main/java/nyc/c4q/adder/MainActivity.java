package nyc.c4q.adder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View v) {
        Intent intent = new Intent(MainActivity.this, Empty.class);

        EditText editText1 = findViewById(R.id.firstinput);
        EditText editText2 = findViewById(R.id.secondinput);

        int first = Integer.parseInt(editText1.getText().toString());
        int second = Integer.parseInt(editText2.getText().toString());

        String sum = String.valueOf(first + second);
        intent.putExtra("sum", sum);
        startActivity(intent);
    }
}