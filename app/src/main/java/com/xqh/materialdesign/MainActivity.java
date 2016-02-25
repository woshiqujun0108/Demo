package com.xqh.materialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gc.materialdesign.views.ButtonFlat;
import com.gc.materialdesign.views.ButtonFloat;
import com.gc.materialdesign.views.ButtonRectangle;
import com.gc.materialdesign.views.CheckBox;
import com.gc.materialdesign.views.ProgressBarCircularIndeterminate;
import com.gc.materialdesign.views.ProgressBarDeterminate;
import com.gc.materialdesign.views.ProgressBarIndeterminate;
import com.gc.materialdesign.views.ProgressBarIndeterminateDeterminate;
import com.gc.materialdesign.views.Slider;
import com.gc.materialdesign.views.Switch;
import com.gc.materialdesign.widgets.ColorSelector;
import com.gc.materialdesign.widgets.Dialog;
import com.gc.materialdesign.widgets.SnackBar;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.buttonflat)
    ButtonFlat buttonflat;
    @InjectView(R.id.button)
    ButtonRectangle button;
    @InjectView(R.id.buttonFloat)
    ButtonFloat buttonFloat;
    @InjectView(R.id.checkBox)
    CheckBox checkBox;
    @InjectView(R.id.switchView)
    Switch switchView;
    @InjectView(R.id.progressBarCircularIndeterminate)
    ProgressBarCircularIndeterminate progressBarCircularIndeterminate;
    @InjectView(R.id.progressBarIndeterminate)
    ProgressBarIndeterminate progressBarIndeterminate;
    @InjectView(R.id.progressBarIndeterminateDeterminate)
    ProgressBarIndeterminateDeterminate progressBarIndeterminateDeterminate;
    @InjectView(R.id.progressDeterminate)
    ProgressBarDeterminate progressDeterminate;
    @InjectView(R.id.slider)
    Slider slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        buttonflat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SnackBar snackbar = new SnackBar(MainActivity.this, "Do you understand ?", "Yes", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                snackbar.show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this, "Hello", "Where are you ?");
                dialog.show();
            }
        });

        buttonFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorSelector colorSelector = new ColorSelector(MainActivity.this, getResources().getColor(R.color.green), new ColorSelector.OnColorSelectedListener() {
                    @Override
                    public void onColorSelected(int color) {

                    }
                });
                colorSelector.show();
            }
        });
    }
}
