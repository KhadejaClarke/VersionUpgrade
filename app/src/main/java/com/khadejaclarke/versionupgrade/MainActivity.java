package com.khadejaclarke.versionupgrade;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        progressBar = findViewById(R.id.progressBar);
        showUpdateDialog();
    }

    private void showUpdateDialog(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Software version update")
                .setMessage("Would you like to update now or later?")
                .setPositiveButton("Now", (dialog, which) -> progressBar.setVisibility(View.VISIBLE))
                .setNegativeButton("Later", (dialog, which) -> textView.setVisibility(View.VISIBLE))
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
