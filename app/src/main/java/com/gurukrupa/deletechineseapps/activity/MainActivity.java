package com.gurukrupa.deletechineseapps.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.gurukrupa.deletechineseapps.R;

public class MainActivity extends AppCompatActivity {

    TextView clickToDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context=getApplicationContext();
        String[] listOfApp = context.getResources().getStringArray(R.array.listOfChineseApp);

        for (int i = 0; i < listOfApp.length; i++) {
            System.out.print(listOfApp[i]);
            Log.d("AppName",  listOfApp[i]);
        }

        clickToDelete = (TextView)findViewById(R.id.click_to_delete);
        clickToDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
               /* Intent intent = new Intent(Intent.ACTION_DELETE);
                intent.setData(Uri.parse("package:com.gurukrupa.hellotoddler"));
                startActivity(intent);*/

                //Uri packageURI = Uri.parse("package:"+"com.gurukrupa.deletechineseapps");
                //Uri packageURI = Uri.parse("package:"+"com.chinaappsremover");
                //Uri packageURI = Uri.parse("package:"+"com.mvmaster.videomaker");
                //Uri packageURI = Uri.parse("package:"+"com.newbiz.mvmaster");
                Uri packageURI = Uri.parse("package:"+"app.buzz.share");
                Intent uninstallIntent = new Intent(Intent.ACTION_DELETE, packageURI);
                startActivity(uninstallIntent);


            }
        });
    }
}
