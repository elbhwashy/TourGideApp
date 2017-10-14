package com.example.elbhwashy.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by elbhwashy on 9/29/2017.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    private int mColorResourceId;
    public AttractionAdapter(Context context, ArrayList<Attraction> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        /* Get the  object located at this position in the list */
        Attraction currentattraction = getItem(position);

        /* find the text view in the list item */
        TextView attractionName = (TextView) listItemView.findViewById(R.id.attraction_name_text_view);

        /* get attraection  */
        attractionName.setText(currentattraction.getmAttractionname());


        /* find the text view in the list item */
        TextView attractionClassification = (TextView) listItemView.findViewById(R.id.class_text_view);

        /* get attraection  */
        attractionClassification.setText(currentattraction.getmClassification());

        TextView attractionRatingText = (TextView) listItemView.findViewById(R.id.rating_text_view);

        /* get attraection  */
        attractionRatingText.setText(currentattraction.getmRatingText());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);

        if (currentattraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentattraction.getmImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        ImageView rateImageView = (ImageView) listItemView.findViewById(R.id.rate_image_view);

       /* if (currentattraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            rateImageView.setImageResource(currentattraction.getmRateImageResourceId());
            // Make sure the view is visible
            rateImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            rateImageView.setVisibility(View.GONE);
        }*/

// Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        return listItemView;


    }

}
