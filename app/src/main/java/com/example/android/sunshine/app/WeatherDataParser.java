package com.example.android.sunshine.app;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * Created by mrlong on 12/30/15.
 */
public class WeatherDataParser {
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        // TODO: add parsing code here
        JSONObject resultJSON = new JSONObject(weatherJsonStr);
        JSONArray listDays = resultJSON.getJSONArray("list");
        JSONObject dayData = listDays.getJSONObject(dayIndex);
        JSONObject tempData = dayData.getJSONObject("temp");
        double dMax = tempData.getDouble("max");
        return dMax;
    }
}
