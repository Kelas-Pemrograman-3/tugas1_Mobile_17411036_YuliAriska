package com.niar.tugasriska;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtnama;
    TextView txtnpm;
    TextView txtalamat;
    TextView txtprogramstudi;
   EditText edtnama;
    EditText edtnpm;
    EditText edtalamat;
    EditText edtprogramstudi;
   Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnama = (TextView) findViewById(R.id.txtnama);
        txtnpm = (TextView) findViewById(R.id.txtnpm);
        txtalamat = (TextView) findViewById(R.id.txtalamat);
        txtprogramstudi = (TextView) findViewById(R.id.txtprogramstudi);
        edtnama = (EditText) findViewById(R.id.edtnama);
        edtnpm = (EditText) findViewById(R.id.edtnpm);
        edtalamat = (EditText) findViewById(R.id.edtalamat);
        edtprogramstudi = (EditText) findViewById(R.id.edtprogramstudi);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strNama = edtnama.getText().toString();
                String strNpm = edtnpm.getText().toString();
                String strAlamat = edtalamat.getText().toString();
                String strprogramstudi = edtprogramstudi.getText().toString();

                txtnama.setText(strNama);
                txtnpm.setText(strNpm);
                txtalamat.setText(strAlamat);
                txtprogramstudi.setText(strprogramstudi);

            }
        });
    }
}
