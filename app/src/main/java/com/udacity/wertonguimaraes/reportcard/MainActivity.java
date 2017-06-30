package com.udacity.wertonguimaraes.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView reportCardCreated;
    private TextView reportCardEdited;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInitView();
        viewCreatedReportCard();
        viewEditedReportCard();
    }

    private void mInitView() {
        reportCardCreated = (TextView) findViewById(R.id.report_card_created);
        reportCardEdited = (TextView) findViewById(R.id.report_card_edited);
    }

    private void viewCreatedReportCard(){
        ReportCard reportCard = new ReportCard("Werton Guimaraes", 8, 9.3, 7, 7, 9, 8.7777);

        reportCardCreated.setText(reportCard.toString());
    }

    private void viewEditedReportCard(){
        ReportCard reportCard = new ReportCard("Werton Guimaraes", 8, 9.3, 7, 7, 9, 8.7777);

        reportCard.setmStudentName("Vinicius Gomes");
        reportCard.setmPortuguese(10);
        reportCard.setmMath(9);
        reportCard.setmGeography(5);
        reportCard.setmHistory(3.5);
        reportCard.setmChemistry(10);
        reportCard.setmPhysical(8);

        reportCardEdited.setText(reportCard.toString());
    }
}
