package android.example.contactintent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


import androidx.fragment.app.Fragment;


public class ContactFragment extends Fragment{
    private Contact mContact;
    private EditText 

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate((savedInstanceState));
        mContact = new Contact();


    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState){
        View v = inflater.inflate(
                R.layout.fragment_contact,
                container,
                false);
        return v;

    }

}
