package mchehab.com.backnavigation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(e -> {
            Globals.addFragment(getFragmentManager(), new SecondFragment(),
                    R.id.frameLayout);
        });
        return view;
    }
}