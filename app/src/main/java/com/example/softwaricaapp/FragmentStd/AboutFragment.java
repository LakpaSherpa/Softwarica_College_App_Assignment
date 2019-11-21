package com.example.softwaricaapp.FragmentStd;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.softwaricaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment  extends Fragment {
   public WebView website;

//    public AboutFragment(){
//
////Requirement empty this constructor
//}
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =inflater.inflate(R.layout.about_us, container, false);

        website=v.findViewById(R.id.WV_Website);
        website.loadUrl("https://softwarica.edu.np/");
        website.setWebViewClient(new WebViewClient());
        return v;
    }

}

