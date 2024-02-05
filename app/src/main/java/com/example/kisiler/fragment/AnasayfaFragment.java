package com.example.kisiler.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.kisiler.R;
import com.example.kisiler.adapter.KisilerAdapter;
import com.example.kisiler.data.Kisiler;
import com.example.kisiler.databinding.FragmentAnasayfaBinding;

import java.util.ArrayList;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =FragmentAnasayfaBinding.inflate(inflater,container,false);

        binding.toolbar.setTitle("Kisiler");


        binding.rv.setLayoutManager(new LinearLayoutManager(requireContext()));
        ArrayList<Kisiler> kisilerListesi=new ArrayList<>();

        Kisiler k1=new Kisiler(1,"Hasan ","542 338 65 23");
        Kisiler k2=new Kisiler(2,"Gamze","567 345 23 48");
        Kisiler k3=new Kisiler(3,"Ali","569 221 23 45");

        kisilerListesi.add(k1);
        kisilerListesi.add(k2);
        kisilerListesi.add(k3);

        KisilerAdapter kisilerAdapter=new KisilerAdapter(requireContext(),kisilerListesi);
        binding.rv.setAdapter(kisilerAdapter);






        binding.fab.setOnClickListener(view ->{
            Navigation.findNavController(view).navigate(R.id.kisikayitgecis);

        });

        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                // klavye arama butonunda çalışan metot
                ara(s);

                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                ara(s);

                return true;
            }
        });
        return binding.getRoot();





    }
    public void ara(String aramaKelimesi){
        Log.e("Kisi ara",aramaKelimesi);

    }
}