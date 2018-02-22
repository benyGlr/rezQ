package com.example.rezqflex.rezq;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by danielg on 2018-02-20.
 */

public class RecentListFragment extends Fragment {
    private RecyclerView mRecentsListRecyclerView;
    private FloatingActionButton mAddItemFab;
    private Callbacks mCallbacks;



    public interface Callbacks{
        void onItemSelected(Item item);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recent_list,container,false);

        mAddItemFab = (FloatingActionButton) view.findViewById(R.id.recent_list_fab);
        mAddItemFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Item item = new Item();
                ItemLab.get(getActivity()).addItem(item);
                uiRefresh();
                mCallbacks.onItemSelected(item);



            }
        });

                mRecentsListRecyclerView = (RecyclerView) view.findViewById(R.id.recent_list_recycler_view);


        return view;
    }

    private void uiRefresh() {
        ItemLab itemLab = ItemLab.get(getActivity());
        List<Item> items = itemLab.getItems();
    }
}
