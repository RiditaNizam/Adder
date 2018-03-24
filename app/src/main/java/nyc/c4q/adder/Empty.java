package nyc.c4q.adder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Empty extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        String sum = (getIntent().getExtras().getString("sum"));
        TextView addsum = findViewById(R.id.sumofnumbers);
        addsum.setText(sum);

    }
}