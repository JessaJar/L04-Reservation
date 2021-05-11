package sg.edu.rp.c346.id20014241.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TextView textViewName;
    EditText editTextName;
    TextView textViewPhone;
    EditText editTextPhone;
    TextView textViewPax;
    EditText editTextPax;
    RadioGroup radioGroupSNSA;
    TextView textViewDate;
    DatePicker datePicker;
    TextView textViewTime;
    TimePicker timePicker;
    Button buttonDone, buttonReset;
    TextView textViewDisplayName;
    TextView textViewDisplayPhone;
    TextView textViewDisplayPax;
    TextView textViewDisplayDate;
    TextView textViewDisplayTime;
    TextView textViewDisplaySNSA;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewName = findViewById(R.id.textViewName);
        editTextName = findViewById(R.id.editTextName);
        textViewPhone = findViewById(R.id.textViewPhone);
        editTextPhone = findViewById(R.id.editTextPhone);
        textViewPax = findViewById(R.id.textViewPax);
        editTextPax = findViewById(R.id.editTextPax);
        radioGroupSNSA = findViewById(R.id.radioGroupSNSA);
        textViewDate = findViewById(R.id.textViewDate);
        datePicker = findViewById(R.id.datePicker);
        textViewTime = findViewById(R.id.textViewTime);
        timePicker = findViewById(R.id.timePicker);
        buttonDone = findViewById(R.id.buttonDone);
        buttonReset = findViewById(R.id.buttonReset);
        textViewDisplayName = findViewById(R.id.textViewDisplayName);
        textViewDisplayPhone = findViewById(R.id.textViewDisplayPhone);
        textViewDisplayPax = findViewById(R.id.textViewDisplayPax);
        textViewDisplayDate = findViewById(R.id.textViewDisplayDate);
        textViewDisplayTime = findViewById(R.id.textViewDisplayTime);
        textViewDisplaySNSA = findViewById(R.id.textViewDisplaySNSA);


        buttonDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String location = " ";
                if(radioGroupSNSA.getCheckedRadioButtonId() == R.id.radioButtonSA)
                    location = "You will be seated at a smoking area";
                else{
                    location = "You will be seated at a non-smoking area";
                }

                String time = timePicker.getCurrentHour() + ":" +  String.format("%02d", timePicker.getCurrentMinute());
                String date = datePicker.getDayOfMonth() + "/" + datePicker.getMonth() + "/" + datePicker.getYear();
                textViewDisplayName.setText("Name: " + editTextName.getText().toString());
                textViewDisplayPhone.setText("Phone Number: " + editTextPhone.getText().toString());
                textViewDisplayPax.setText("Pax: " + editTextPax.getText().toString());
                textViewDisplayDate.setText(date);
                textViewDisplayTime.setText(time);
                textViewDisplaySNSA.setText(location);
            }
        });


        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            datePicker.updateDate(2021, 5,1);
            timePicker.setCurrentHour(19);
            timePicker.setCurrentMinute(30);
            editTextName.setText("");
            editTextPhone.setText("");
            editTextPax.setText("");
            textViewDisplayName.setText("");
            textViewDisplayPhone.setText("");
            textViewDisplayPax.setText("");
            textViewDisplayDate.setText("");
            textViewDisplayTime.setText("");
            textViewDisplaySNSA.setText("");

            }
        });

    }
}