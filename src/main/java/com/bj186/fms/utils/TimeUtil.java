package com.bj186.fms.utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeUtil {
    /**
     * 将距离1970年的数字时间转换成正常的字符串格式时间；
     * 比如数字时间："1513345743"
     * 转换后："2017-12-15 21:49:03"
     *
     * @param time
     * @return
     */
    public static String secondToTime(String time) {
        String dateStr = "1970-1-1 08:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (time.equals("0")) {
            return "";
        }
        Date miDate;
        String returnstr = "";
        try {
            miDate = sdf.parse(dateStr);
            Object t1 = miDate.getTime();
            long h1 = Long.parseLong(time.toString()) * 1000 + Long.parseLong(t1.toString());
            returnstr = sdf.format(h1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return returnstr;
    }
}

