package com.example.criminalintent;

import android.util.Log;

import androidx.fragment.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        //Log.d("hello","12");
        return new CrimeListFragment();
    }
}
