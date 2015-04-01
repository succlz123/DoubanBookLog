package org.succlz123.doubanbooklog.bean.BookInfo;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by fashi on 2015/4/1.
 */
public class MyRating {

    private int max;//������� Ĭ��5
    private int value;//�������
    private int min;//��С���� Ĭ��0

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public static MyRating parseJson(JSONObject object) {
        try {
            MyRating myRating=new MyRating();

            Integer max=object.getInt("max");
            Integer value=object.getInt("value");
            Integer min=object.getInt("min");

            myRating.setMax(max);
            myRating.setValue(value);
            myRating.setMin(min);

            return myRating;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
