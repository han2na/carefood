package com.nhom12.carefood.ui.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.nhom12.carefood.R;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Statitic extends AppCompatActivity {
    LineChart caloChart;
    PieChart nutritionChart;
    LineChart BMIchart;
    List<String> dates;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statitic);
        caloChart = findViewById(R.id.calo_chart);
        nutritionChart = findViewById(R.id.nutrition_chart);
        BMIchart = findViewById(R.id.Bmi_chart);
        drawCaloChart();
        drawNutritionChart();
        drawBMIChart();

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void drawCaloChart() {
        ArrayList<Entry> Entries = new ArrayList<>();
        Entries.add(new Entry(0, 20f));
        Entries.add(new Entry(1, 400f));
        Entries.add(new Entry(2, 500f));
        Entries.add(new Entry(3, 400));
        Entries.add(new Entry(4, 600));
        LocalDate curentdate = LocalDate.now();
        curentdate.minusDays(2).toString();
        dates = Arrays.asList(curentdate.minusDays(2).toString(), curentdate.minusDays(1).toString(), curentdate.toString(), curentdate.toString(), curentdate.toString());
        XAxis xAxis = caloChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(new IndexAxisValueFormatter(dates));
        xAxis.setLabelCount(4);

        YAxis yAxis = caloChart.getAxisLeft();
        yAxis.setAxisMinimum(0f);
        yAxis.setAxisMaximum(1000f);
        yAxis.setAxisLineWidth(2f);
        yAxis.setLabelCount(10);

        LineDataSet dataSet = new LineDataSet(Entries, "Dinh dưỡng");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        LineData data = new LineData(dataSet);

        caloChart.setData(data);


        Description description = new Description();
        description.setText("");
        caloChart.setDescription(description);

        caloChart.getLegend().setEnabled(false);
        caloChart.invalidate();
    }

    public void drawNutritionChart() {
        ArrayList<PieEntry> pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(20, "Tinh Bột"));
        pieEntries.add(new PieEntry(20, "Chất đạm"));
        pieEntries.add(new PieEntry(20, "Chất béo"));
        pieEntries.add(new PieEntry(20, "Vitamin"));
        PieDataSet pieDataSet = new PieDataSet(pieEntries, "");
        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        PieData pieData = new PieData(pieDataSet);

        nutritionChart.setData(pieData);

        nutritionChart.setTransparentCircleRadius(40);
        nutritionChart.setDrawHoleEnabled(false);
        nutritionChart.setEntryLabelTextSize(5);
        Description description = new Description();
        description.setText("");
        nutritionChart.setDescription(description);
        nutritionChart.setUsePercentValues(true);

        nutritionChart.invalidate();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void drawBMIChart() {
        ArrayList<Entry> Entries = new ArrayList<>();
        Entries.add(new Entry(0, 20f));
        Entries.add(new Entry(1, 100));
        Entries.add(new Entry(2, 70));
        Entries.add(new Entry(3, 80));
        Entries.add(new Entry(4, 90));

        ArrayList<Entry> Entries2 = new ArrayList<>();
        Entries2.add(new Entry(0, 120));
        Entries2.add(new Entry(1, 165));
        Entries2.add(new Entry(2, 210));
        Entries2.add(new Entry(3, 185));
        Entries2.add(new Entry(4, 170));

        LocalDate curentdate = LocalDate.now();
        curentdate.minusDays(2).toString();
        dates = Arrays.asList(curentdate.minusDays(2).toString(), curentdate.minusDays(1).toString(), curentdate.toString(), curentdate.toString(), curentdate.toString());
        XAxis xAxis = BMIchart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisLineColor(Color.BLACK);
        xAxis.setValueFormatter(new IndexAxisValueFormatter(dates));
        xAxis.setLabelCount(4);

        YAxis yAxis = BMIchart.getAxisLeft();
        yAxis.setAxisMinimum(0);
        yAxis.setAxisMaximum(250);
        yAxis.setAxisLineWidth(2f);
        yAxis.setLabelCount(10);

        LineDataSet dataSet = new LineDataSet(Entries, "Cân nặng");
        dataSet.setColors(Color.RED);
        LineDataSet dataSet2 = new LineDataSet(Entries2, "Chiều cao");
        dataSet2.setColors(Color.BLUE);
        LineData data = new LineData(dataSet, dataSet2);
        BMIchart.setData(data);
        Description description = new Description();
        description.setText("");
        BMIchart.setDescription(description);
        BMIchart.getLegend().setXEntrySpace(30);
        BMIchart.invalidate();
    }
}