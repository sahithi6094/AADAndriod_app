package brau.collegeofeng.tabnavigation1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mainfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mainfragment extends Fragment {
    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        textView =textView.findViewById(R.id.text1);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mainfragment, container, false);
    }
}