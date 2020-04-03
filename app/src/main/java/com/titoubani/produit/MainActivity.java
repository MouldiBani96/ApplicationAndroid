package com.titoubani.produit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import com.titoubani.produit.Model.Produit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Produit> list;
    ListView listView;
    EditText rechercheEdit;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initcontent();
        additem();
        RechercheEdit();


    }
    public void RechercheItem(String recherche){
        for(Produit item:list){
            if(!item.getTitle().equals(recherche)){
                list.remove(1);
                System.out.println("mouldi"+item.getTitle());
                System.out.println("tito "+recherche);

            }else{
                adapter.notifyDataSetChanged();
            }
        }
    }
    public void initcontent(){
        rechercheEdit=findViewById(R.id.recherche);
         listView = findViewById(R.id.listview);

    }
    public void RechercheEdit(){


    }
    public void additem(){

        list = new ArrayList<>();
        list.add(new Produit("azer","1400","1400","1400"));
        list.add(new Produit("قنارية حمراة","1400 ","1400","1400"));
        list.add(new Produit("سلق","140","210","280"));
        list.add(new Produit("سفنارية","980","1560","1950"));
        list.add(new Produit("كرنب","420","560","560"));
        list.add(new Produit("بروكلو","1120","1400","1400"));
        list.add(new Produit("بسباس","1120","1120","1120"));
        list.add(new Produit("فول أخضر","1120","1560","1950"));
        list.add(new Produit("لفت","980","1400","1400"));
        list.add(new Produit("بصل","1400","1690","1690"));
        list.add(new Produit("معدنوس","280","420","560"));
        list.add(new Produit("جلبانة","2600","3250","3250"));
        list.add(new Produit("فلفل حلو","2340","2860","3510"));
        list.add(new Produit("فلفل حار","2340","2860","3250"));
        list.add(new Produit("بطاطة","1400","1560","1820"));
        list.add(new Produit("طماطم","1400","1690","1690"));
        list.add(new Produit("دقلة فراك","5070","5200","5850"));
        list.add(new Produit("دقلة عروشات","13000","13000","13000"));
        list.add(new Produit("فراولة","2600","3900","5200"));
        list.add(new Produit("تفاح","1690","2340","3250"));
        list.add(new Produit("قارص","2210","2600","3250"));
        list.add(new Produit("برتقال مالطي","2340","2600","2860"));
        list.add(new Produit("برتقال مسكي","1690","3640","4160"));
        list.add(new Produit("برتقال طمسن","2600","3640","4550"));
        list.add(new Produit("سردينة ","6500","6500","6500"));
        list.add(new Produit("مرجان","6500","7800","9100"));
        adapter = new CustomAdapter(this,R.layout.news_items,list);
        listView.setAdapter(adapter);

        rechercheEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                MainActivity.this.adapter.getFilter().filter(s);

                adapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

}
