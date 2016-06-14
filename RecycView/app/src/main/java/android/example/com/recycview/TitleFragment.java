package android.example.com.recycview;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by tchl on 2016-06-14.
 */
public class TitleFragment extends Fragment {

    private ImageButton mLeftMenu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_title,container,false);
        mLeftMenu = (ImageButton)view.findViewById(R.id.imageButton);
        mLeftMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"i am a imagebutton on TitleFragment!",
                        Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
