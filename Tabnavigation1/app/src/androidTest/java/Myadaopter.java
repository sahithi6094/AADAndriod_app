import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class Myadaopter extends FragmentPagerAdapter {
    ArrayList<String>strings=new ArrayList<>();

  public class MyAdaopter extends FragmentPagerAdapter{
      Arr
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Mainfragment m=new Mainfragment();
        Bundle bundle=new Bundle();
        bundle.putString("ID",strings.get(position));
        m.setArguments(bundle);
        return m;

        return null;
    }

    @Override
    public int getCount() {
        return strings.size();
    }
     public void add(){
        strings.add("chats");
        strings.add("status");
        strings.add("calls");
     }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.get(position);
    }
}
