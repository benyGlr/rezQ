package com.example.rezqflex.rezq;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ben on 2018-02-21.
 */

public class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView mTitleTextView;
    private TextView mLinkTextView;
    private TextView mTimeTextView;
    private TextView mRatingTextView;
    private TextView mGenreTextView;
    private TextView mRelease_DateTextView;
    private TextView mNum_EpisodesTextView;
    private ImageView mPosterCardImageView;



    public ItemHolder(LayoutInflater Inflater, ViewGroup parent) {
        super(Inflater.inflate(R.layout.list_item_card, parent, false));
        mTimeTextView = (TextView) itemView.findViewById(R.id.)
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}