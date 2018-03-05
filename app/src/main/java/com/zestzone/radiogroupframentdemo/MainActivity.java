package com.zestzone.radiogroupframentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.zestzone.radiogroupframentdemo.fragment.AFragment;
import com.zestzone.radiogroupframentdemo.fragment.BFragment;
import com.zestzone.radiogroupframentdemo.fragment.CFragment;
import com.zestzone.radiogroupframentdemo.fragment.DFragment;
import com.zestzone.radiogroupframentdemo.fragment.EFragment;
import com.zestzone.radiogroupframentdemo.fragment.FFragment;

public class MainActivity extends AppCompatActivity {
    RadioGroup tabRadioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabRadioGroup = findViewById(R.id.tab_radio_group);
        tabRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (group.getCheckedRadioButtonId()){
                    case R.id.home_radio:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new AFragment()).commit();
                    }
                    break;
                    case R.id.category_radio:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BFragment()).commit();

                    }
                    break;
                    case R.id.shopping_cart_radio:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new CFragment()).commit();

                    }
                    break;
                    case R.id.news_radio:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new DFragment()).commit();

                    }
                    break;
                    case R.id.business_radio:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new EFragment()).commit();

                    }
                    break;
                    case R.id.user_radio:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FFragment()).commit();

                    }
                    break;
                }
            }
        });
    }
}
