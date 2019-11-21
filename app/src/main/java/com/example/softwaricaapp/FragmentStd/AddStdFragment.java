package com.example.softwaricaapp.FragmentStd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.softwaricaapp.R;

public class AddStdFragment extends Fragment {
    EditText name, age, address;
    RadioGroup rdoGender;
    Button btnSave;
    RadioButton btnGender;

    public  AddStdFragment(){
        //Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.add_std_details, container, false);
        name = view.findViewById(R.id.ET_FullName);
        age = view.findViewById(R.id.ET_Age);
        rdoGender = view.findViewById(R.id.RG_Gender);
        address = view.findViewById(R.id.ET_Address);
        btnSave = view.findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectGender = rdoGender.getCheckedRadioButtonId();
                btnGender = view.findViewById(selectGender);
                Toast toast = Toast.makeText(getContext(), "Student Details Save", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        return view;
    }



    }



