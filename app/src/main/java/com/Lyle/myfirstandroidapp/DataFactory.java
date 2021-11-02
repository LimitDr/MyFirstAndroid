package com.Lyle.myfirstandroidapp;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    private static List<String> m_listData;
    private static boolean m_bInit = false;
    public static List<String> getFilterData(String keyword)
    {
        if(!m_bInit) {
            m_listData = new ArrayList<String>();
            for(int i = 0; i < 100; ++i)
                m_listData.add(String.format("这是第%d个数据", i));
            m_bInit = true;
        }
        if(keyword != null) {
            List<String> filteredData = new ArrayList<String>();
            for(String d : m_listData) {
                if (d.contains(keyword))
                    filteredData.add(d);
            }
            return filteredData;
        }
        return m_listData;
    };
}
