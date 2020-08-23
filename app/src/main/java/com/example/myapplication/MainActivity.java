package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private LocationAdapter adapter;
    private ArrayList<Location> locationList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.location_list);
        locationList = new ArrayList<>();

        locationList.add(new Location("Ho Tay", R.drawable.ho_tay, "Hồ Tây trước đây còn có các tên gọi khác như Đầm Xác Cáo, Hồ Kim Ngưu, Lãng Bạc, Dâm Đàm, Đoài Hồ, là một hồ nước tự nhiên lớn nhất ở nội thành thủ đô Hà Nội, nằm ở quận Tây Hồ. Hồ có diện tích hơn 500 ha với chu vi là khoảng 14,8 km"));
        locationList.add(new Location("Lang Bac", R.drawable.lang_bac, "Lăng Chủ tịch Hồ Chí Minh, hay còn gọi là Lăng Hồ Chủ tịch, Lăng Bác, là nơi đặt thi hài Hồ Chí Minh. Lăng Chủ tịch Hồ Chí Minh được chính thức khởi công ngày 2 tháng 9 năm 1973, tại vị trí của lễ đài cũ giữa Quảng trường Ba Đình"));
        locationList.add(new Location("Pho di bo", R.drawable.pho_di_bo, "Phố đi bộ Hà Nội hay Phố đi bộ Hồ Gươm là khu vực không gian đi bộ bao gồm 16 tuyến phố xung quanh Hồ Gươm, cấm các phương tiện xe cộ lưu thông"));
        locationList.add(new Location("Aeon Ha dong", R.drawable.aeon, "Tọa lạc tại vị trí giao thông chiến lược phía Tây Nam Thủ đô, AEON MALL Hà Đông là trung tâm thương mai Nhật Bản thứ hai tại Hà Nội với diện tích gần 10 hecta, sức chứa lên tới 2,100 xe ô tô và hơn 9,000 xe máy, là một trong những trung tâm thương mại lớn nhất cả nước. "));
        locationList.add(new Location("Chua Mot Cot", R.drawable.chua, "Chùa Một Cột hay Chùa Mật, còn có tên khác là Diên Hựu tự hoặc Liên Hoa Đài, là một ngôi chùa nằm giữa lòng thủ đô Hà Nội. Đây là ngôi chùa có kiến trúc độc đáo ở Việt Nam"));


        adapter = new LocationAdapter(this, R.layout.show_item, locationList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in = new Intent(MainActivity.this, ItemActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", locationList.get(i).getName());
                bundle.putInt("image", locationList.get(i).getImage());
                bundle.putString("desc", locationList.get(i).getDesc());
                in.putExtra("data", bundle);
                startActivity(in);
            }
        });
    }
}
