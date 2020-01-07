package com.wangzs.panellistlibrary.defaultcontent;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author:  wangzs
 * @Version:
 * @Email    wangzs@yuntongxun.com
 */

public class ContentData {

    private List<List<String>> contentDataList = new ArrayList<>();

    private int itemSize;

    public ContentData() {

    }

    public List<String> getItem(int position){
        return contentDataList.get(position);
    }

}
