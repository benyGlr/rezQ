package com.example.rezqflex.rezq;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by danielg on 2018-02-20.
 */

public class RecentListActivity extends SingleFragmentActivity {



    @Override
    protected Fragment createFragment() {
        return new RecentListFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
