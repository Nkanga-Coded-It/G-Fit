package com.example.g_fit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {

    Context context ;

    int image  [] = {
            R.drawable.cardio,
            R.drawable.stretching,
            R.drawable.calisthenics,
            R.drawable.weight_lifting,
    };

    int headings [] = {
            R.string.cardio_exercises,
            R.string.Stretching,
            R.string.Calisthenics,
            R.string.Weight,

    };

    int description [] = {
            R.string.desc_one,
            R.string.desc_two,
            R.string.desc_three,
            R.string.desc_four,
    };


    public ViewPagerAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return headings.length;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        //inflates the viewpager every time you scroll
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_layout, container, false);

        ImageView slideTitleImage = (ImageView) view.findViewById(R.id.titleimage);
        TextView slideHeading = (TextView) view.findViewById(R.id.texttitle);
        TextView slideDescription = (TextView) view.findViewById(R.id.textdescription);


        slideTitleImage.setImageResource(image[position]);
        slideHeading.setText(headings[position]);
        slideDescription.setText(description[position]);



        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
