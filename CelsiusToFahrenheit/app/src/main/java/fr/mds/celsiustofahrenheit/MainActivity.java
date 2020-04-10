package fr.mds.celsiustofahrenheit;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "CtoF";

    private EditText et_enter_celsius;
    private Button bt_conversion;
    private TextView tv_fahrenheit_result;

    private String celsiustostring;
    private Double string_to_double;
    private Double result_fahrenheit;
    private String double_to_string;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_enter_celsius = findViewById(R.id.et_enter_celsius);
        bt_conversion = findViewById(R.id.bt_conversion);
        tv_fahrenheit_result = findViewById(R.id.tv_fahrenheit_result);



        bt_conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "MainActivity - bt_conversion - OnClick");
                celsiustostring = et_enter_celsius.getText().toString();
                string_to_double = Double.valueOf(celsiustostring).doubleValue();
                result_fahrenheit = (string_to_double * (9/5)) + 32;
                double_to_string = String.format("%.1f", result_fahrenheit);

                tv_fahrenheit_result.setText(double_to_string);
            }
        });
    }
}
