package com.example.kisiler.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kisiler.R;
import com.example.kisiler.databinding.FragmentAnasayfaBinding;
import com.example.kisiler.databinding.FragmentKisiKayitBinding;

public class KisiKayitFragment extends Fragment {


    private FragmentKisiKayitBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =FragmentKisiKayitBinding.inflate(inflater,container,false);

        binding.toolbarkisikayit.setTitle("Kisi Kayıt ");

        binding.kaydet.setOnClickListener(view -> {
            String kisi_ad=binding.editTextKisiAd.getText().toString();
            String kisi_tel=binding.editTextKisiTel.getText().toString();

            kaydet(kisi_ad,kisi_tel);



        });
        return binding.getRoot();



    }

    public void kaydet(String kisi_ad, String kisi_tel){

        Log.e("Kisi Kaydet" ,kisi_ad+" - " +kisi_tel);


    }
}