package practice.com.bottomnavigationusingnavigationcomponent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        Button nameButton = view.findViewById(R.id.button);
        final EditText nameEditText= view.findViewById(R.id.editText);

        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("nameArgs",name);
                Navigation.findNavController(v).navigate(R.id.navigation_dashboard,bundle);
            }
        });
        return view;
    }

}
