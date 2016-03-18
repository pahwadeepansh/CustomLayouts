package com.example.deepansh.customlayouts.Widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.deepansh.customlayouts.R;

/**
 * Created by deepansh on 3/18/16.
 */
public class CustomLayoutSample extends LinearLayout implements View.OnClickListener {
    CustomLayout customLayoutButton ;

    public void setCustomLayoutButton(CustomLayout customLayoutButton) {
        this.customLayoutButton = customLayoutButton;
    }


    public CustomLayoutSample(Context context) {
        super(context);
        inflateComponents(context, customLayoutButton);
    }

    public CustomLayoutSample(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateComponents(context, customLayoutButton);

    }

    public CustomLayoutSample(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateComponents(context, customLayoutButton);

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomLayoutSample(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        inflateComponents(context,customLayoutButton);

    }

    public void inflateComponents(final Context contexts,CustomLayout customLayoutButton) {
        this.customLayoutButton=customLayoutButton;

        LayoutInflater.from(contexts).inflate(R.layout.custom_layout, this);

        Button button1;
        Button button2;
        Button button3;

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(this);

        button2.setOnClickListener(this);

        button3.setOnClickListener(this);

    }

    public interface CustomLayout {
        void onButtonClicked();
    }

    @Override
    public void onClick(View v) {

        customLayoutButton.onButtonClicked();
    }
}
