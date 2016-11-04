package com.dsz.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.dsz.adapter.GuideFragmentAdapter;


/**
 * Created by Administrator on 2016/10/17.
 */

public class MonitorAcitivty extends FragmentActivity implements View.OnClickListener {
    public static final int TAB_KETING=0;
    public static final int TAB_ZHUWO=1;
    public static final int TAB_CEWO=2;
    public static final int TAB_CHUWEI=3;
//    public static final int TAB_QITA=4;
//    private TextView textTitle;
    private ViewPager viewPager;
    private RadioButton monitor_one, monitor_tow, monitor_three, monitor_four;
    private ImageView monitor_back_iv;
    private TextView monitor_main_btn;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);
        context = MonitorAcitivty.this;
        initView();
        addListener();
    }
    private void initView() {

        monitor_back_iv = (ImageView) findViewById(R.id.monitor_back_iv);
        monitor_main_btn = (TextView) findViewById(R.id.monitor_main_btn);


//        textTitle=(TextView)findViewById(R.id.title_txt);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        monitor_one = (RadioButton) findViewById(R.id.monitor_one_radiobutton);
        monitor_tow = (RadioButton) findViewById(R.id.monitor_tow_radiobutton);
        monitor_three = (RadioButton) findViewById(R.id.monitor_three_radiobutton);
        monitor_four =(RadioButton)findViewById(R.id.monitor_four_radiobutton);
//        qita=(RadioButton)findViewById(R.id.monitor_other_radiobutton);
//        textTitle.setText("居家");
        monitor_four.setOnClickListener(this);
//        qita.setOnClickListener(this);
        monitor_one.setOnClickListener(this);
        monitor_tow.setOnClickListener(this);
        monitor_three.setOnClickListener(this);
//        monitor_one.setChecked(true);

        monitor_back_iv.setOnClickListener(this);
        monitor_main_btn.setOnClickListener(this);

        GuideFragmentAdapter adapter = new GuideFragmentAdapter(
                getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
    private void addListener() {
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {




//            @SuppressLint("NewApi")
            @Override
            public void onPageSelected(int id) {
                switch (id) {
                    case TAB_KETING:
                        monitor_one.setChecked(true);
                        monitor_tow.setChecked(false);
                        monitor_three.setChecked(false);
                        monitor_three.setChecked(false);
//                        monitor_one.setBackground(context.getDrawable(R.mipmap.blue_down));
//                        monitor_tow.setBackground(context.getDrawable(R.mipmap.empty));
//                        monitor_three.setBackground(context.getDrawable(R.mipmap.empty));
//                        monitor_three.setBackground(context.getDrawable(R.mipmap.empty));
////                        qita.setBackground(context.getDrawable(R.drawable.empty));
//                        monitor_one.setTextColor(context.getResources().getColor(R.color.text_on));
//                        monitor_tow.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_three.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_four.setTextColor(context.getResources().getColor(R.color.text_off));
//                        qita.setTextColor(context.getResources().getColor(R.color.text_off));
                        break;
                    case TAB_ZHUWO:
                        monitor_one.setChecked(false);
                        monitor_tow.setChecked(true);
                        monitor_three.setChecked(false);
                        monitor_four.setChecked(false);
//                        monitor_one.setBackground(context.getDrawable(R.mipmap.empty));
//                        monitor_tow.setBackground(context.getDrawable(R.mipmap.blue_down));
//                        monitor_three.setBackground(context.getDrawable(R.mipmap.empty));
//                        monitor_four.setBackground(context.getDrawable(R.mipmap.empty));
////                        qita.setBackground(context.getDrawable(R.drawable.empty));
//                        monitor_one.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_tow.setTextColor(context.getResources().getColor(R.color.text_on));
//                        monitor_three.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_four.setTextColor(context.getResources().getColor(R.color.text_off));
//                        qita.setTextColor(context.getResources().getColor(R.color.text_off));
                        break;
                    case TAB_CEWO:
                        monitor_one.setChecked(false);
                        monitor_tow.setChecked(false);
                        monitor_three.setChecked(true);
                        monitor_four.setChecked(false);
//                        monitor_one.setBackground(context.getDrawable(R.mipmap.empty));
//                        monitor_tow.setBackground(context.getDrawable(R.mipmap.empty));
//                        monitor_three.setBackground(context.getDrawable(R.mipmap.blue_down));
//                        monitor_four.setBackground(context.getDrawable(R.mipmap.empty));
////                        qita.setBackground(context.getDrawable(R.drawable.empty));
//                        monitor_one.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_tow.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_three.setTextColor(context.getResources().getColor(R.color.text_on));
//                        monitor_four.setTextColor(context.getResources().getColor(R.color.text_off));
//                        qita.setTextColor(context.getResources().getColor(R.color.text_off));
                        break;
                    case TAB_CHUWEI:
                        monitor_one.setChecked(false);
                        monitor_tow.setChecked(false);
                        monitor_three.setChecked(false);
                        monitor_four.setChecked(true);
//                        monitor_one.setBackground(context.getDrawable(R.mipmap.empty));
//                        monitor_tow.setBackground(context.getDrawable(R.mipmap.empty));
//                        monitor_three.setBackground(context.getDrawable(R.mipmap.empty));
//                        monitor_four.setBackground(context.getDrawable(R.mipmap.blue_down));
////                        qita.setBackground(context.getDrawable(R.drawable.empty));
//                        monitor_one.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_tow.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_three.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_four.setTextColor(context.getResources().getColor(R.color.text_on));
////                        qita.setTextColor(context.getResources().getColor(R.color.text_off));
                        break;
//                    case TAB_QITA:
////                        qita.setChecked(true);
//                        monitor_one.setBackground(context.getDrawable(R.drawable.empty));
//                        monitor_tow.setBackground(context.getDrawable(R.drawable.empty));
//                        monitor_three.setBackground(context.getDrawable(R.drawable.empty));
//                        monitor_four.setBackground(context.getDrawable(R.drawable.empty));
//                        qita.setBackground(context.getDrawable(R.drawable.blue_down));
//                         monitor_one.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_tow.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_three.setTextColor(context.getResources().getColor(R.color.text_off));
//                        monitor_four.setTextColor(context.getResources().getColor(R.color.text_off));
//                        qita.setTextColor(context.getResources().getColor(R.color.text_on));
//                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.monitor_one_radiobutton:
                viewPager.setCurrentItem(TAB_KETING);
                break;
            case R.id.monitor_tow_radiobutton:
                viewPager.setCurrentItem(TAB_ZHUWO);
                break;
            case R.id.monitor_three_radiobutton:
                viewPager.setCurrentItem(TAB_CEWO);
                break;
            case R.id.monitor_four_radiobutton:
                viewPager.setCurrentItem(TAB_CHUWEI);
                break;
//            case R.id.monitor_other_radiobutton:
//                viewPager.setCurrentItem(TAB_QITA);
//                break;


            case R.id.monitor_back_iv:
                finish();
                break;

            case R.id.monitor_main_btn:
                Intent intent=new Intent(MonitorAcitivty.this,MainActivity.class);
                startActivity(intent);
                finish();
                break;

            default:
                break;
        }
    }
}