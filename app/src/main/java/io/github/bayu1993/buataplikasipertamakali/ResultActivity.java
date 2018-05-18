package io.github.bayu1993.buataplikasipertamakali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    public static final String RESULT_EXTRAS = "result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tvHasil = findViewById(R.id.tv_hasil);
        double hasil = getIntent().getDoubleExtra(RESULT_EXTRAS,0);
        String result = "Hasil : "+hasil;
        tvHasil.setText(result);
    }
}
