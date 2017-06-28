package eu.long1.spacetablayoutdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;

public class FragmentA extends Fragment {

    boolean isFirstVisible;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (isVisibleToUser&&!isFirstVisible){
            isFirstVisible = true;
            Log.e(TAG, "setUserVisibleHint A: "+isVisibleToUser);
        }
        else if (isVisibleToUser){
            Log.e(TAG, "setUserVisibleHint Second A: "+isVisibleToUser);
        }

        super.setUserVisibleHint(isVisibleToUser);
    }
}
