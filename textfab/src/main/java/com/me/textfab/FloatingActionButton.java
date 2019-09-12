package com.me.textfab;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

import java.nio.channels.Selector;

public class FloatingActionButton extends FrameLayout {

    private CardView container;
    private TextView titleView;

    private String title;
    private int titleColor;
    private int background;

    GradientDrawable gradientDrawable;
    
    public FloatingActionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateLayout(context);
        initAttributes(attrs);
        initView();
    }


    public void setTitle(String newTitle) {
        title = newTitle;

        if (newTitle == null || newTitle.isEmpty()) {
            titleView.setVisibility(View.GONE);
        } else {
            titleView.setVisibility(View.VISIBLE);
        }

        titleView.setText(newTitle);
    }

    public String getTitle() {
        return title;
    }

    public void setTitleColor(@ColorInt int color) {
        titleColor = color;
        titleView.setTextColor(color);
    }

    public @ColorInt int getTitleColor() {
        return titleColor;
    }

    public void setBackgroundColor(@ColorInt int color) {
        background = color;
        container.setCardBackgroundColor(color);

    }

    public @ColorInt int getBackgroundColor() {
        return background;
    }


    @Override
    public void setOnClickListener(OnClickListener listener) {
        container.setOnClickListener(listener);
    }

    @Override
    public boolean hasOnClickListeners() {
        return container.hasOnClickListeners();
    }

    @Override
    public void setOnLongClickListener(OnLongClickListener listener) {
        container.setOnLongClickListener(listener);
    }

    private void inflateLayout(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.widget_floating_text_button, this, true);

        container = view.findViewById(R.id.layout_button_container);
        titleView = view.findViewById(R.id.layout_button_text);

      /*  GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(R.drawable.circle).getCurrent().mutate();
        gradientDrawable.setColor(Color.RED);*/


    }

    private void initAttributes(AttributeSet attrs) {
        TypedArray styleable = getContext().obtainStyledAttributes(
                attrs,
                R.styleable.FloatingTextButton,
                0,
                0
        );

        title = styleable.getString(R.styleable.FloatingTextButton_floating_title);
        titleColor = styleable.getColor(R.styleable.FloatingTextButton_floating_title_color, Color.BLACK);
        background = styleable.getColor(R.styleable.FloatingTextButton_floating_background_color, Color.WHITE);

        styleable.recycle();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void initView() {
        setTitle(title);
        setTitleColor(titleColor);
        setBackgroundColor(background);
        container.setBackgroundResource(R.drawable.circle);
        gradientDrawable = (GradientDrawable) container.getBackground().getCurrent().mutate();
        gradientDrawable.setColor(background);
    }

}
