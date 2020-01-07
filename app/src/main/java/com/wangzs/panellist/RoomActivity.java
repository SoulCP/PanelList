package com.wangzs.panellist;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import com.wangzs.panellistlibrary.AbstractPanelListAdapter;
import com.wangzs.panellistlibrary.PanelListLayout;

/**
 * @Description:
 * @Author:  wangzs
 * @Version:
 * @Email    wangzs@yuntongxun.com
 */

public class RoomActivity extends AppCompatActivity {

    private static final String TAG = "wangzs";

    private PanelListLayout pl_root;
    private AbstractPanelListAdapter adapter;
    private ListView lv_content;
    private List<Room> roomList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        pl_root = findViewById(R.id.id_pl_root);
        lv_content =  findViewById(R.id.id_lv_content);
        initRoomData();

        adapter = new RoomPanelListAdapter(this, pl_root, lv_content, roomList, R.layout.item_room);
        adapter.setRowDataList(generateRowData());
        adapter.setColumnDataList(generateColumnData());
        adapter.setTitle("week/room");
        adapter.setRowColor("#0288d1");
        adapter.setColumnColor("#81d4fa");
        pl_root.setAdapter(adapter);

    }

    /**
     * 初始化房间列表和房间信息
     */
    private void initRoomData() {
        for (int i = 201;i<221;i++){
            Room room = new Room(i);
            room.setRoomDetail(Utility.generateRandomRoomDetail());
            roomList.add(room);
        }
    }

    private List<String> generateRowData(){
        List<String> rowDataList = new ArrayList<>();
        rowDataList.add("周一");
        rowDataList.add("周二");
        rowDataList.add("周三");
        rowDataList.add("周四");
        rowDataList.add("周五");
        rowDataList.add("周六");
        rowDataList.add("周日");
        return rowDataList;
    }

    private List<String> generateColumnData(){
        List<String> columnDataList = new ArrayList<>();
        for (Room room : roomList){
            columnDataList.add(String.valueOf(room.getRoomNo()));
        }
        return columnDataList;
    }
}
