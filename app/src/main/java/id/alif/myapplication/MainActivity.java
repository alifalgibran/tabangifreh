package id.alif.myapplication;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7,rg8,rg9,rg10,rg11,rg12,rg13,rg14;
    RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rb11,rb12,rb13,rb14;
    Button kirim;
    int nilai1,nilai2,nilai3,nilai4,nilai5,nilai6,nilai7,nilai8,nilai9,nilai10,nilai11,nilai12,nilai13,nilai14;
    private double [] arrayBobot = {
            0.4,0.3,0.2,0.3,0.2,0.1,0.2,0.3,0.2,0.4,0.5,0.5,0.5,0.5
    };

    private double []  arrayVariabelOrder = {
            1,2,3,4,5,6,7,8, 9,10,11,12,13,14
    };

    private double [] arrayUserValue;

    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14;

    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv_1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Risiko kanker kulit anda lebih tinggi jika orang tua atau saudara kandung telah mengalami atau menderita kanker kulit.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        tv2 = findViewById(R.id.tv_2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Apabila anda sering beraktivitas diluar ruangan maka kulit anda akan lebih sering terpapar sinar matahari dan terpapar sinar UV yang memiliki dampak negatif bagi kesehatan kulit.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        tv3 = findViewById(R.id.tv_3);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Apabila lokasi Terletak di bagian punggung maka risiko terkena kanker nodular melanoma semakin tinggi.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        tv4 = findViewById(R.id.tv_4);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Apabila tahi lalat baru muncul/tidak dari lahir, maka risiko terkena kanker nodular melanoma semakin tinggi.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        tv5 = findViewById(R.id.tv_5);
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Merasa cepat lelah dalam melakukan suatu kegiatan (tidak seperti biasanya) dalam kurun waktu 1 bulan terakhir.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        tv6 = findViewById(R.id.tv_6);
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Merasa gatal yang muncul pada tahi lalat dan area sekitarnya tanpa ada penyebabnya misalnya digigit serangga.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        tv7 = findViewById(R.id.tv_7);
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Dalam banyak kasus usia 45 tahun keatas lebih berrisiko terkena kanker nodular melanoma.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        tv8 = findViewById(R.id.tv_8);
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("tahi lalat Anda mengalami perubahan rasa menjadi nyeri atau sakit bila disentuh maupun dipegang.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        tv9 = findViewById(R.id.tv_9);
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Jika anda berkulit putih seperti di gambar, maka risiko terkena kanker nodular melanoma semakin tinggi.");
                LayoutInflater inflater = getLayoutInflater();
                View dialogLayout = inflater.inflate(R.layout.image_layout, null);
                builder.setPositiveButton("Ok", null);
                builder.setView(dialogLayout);
                builder.show();
               // AlertDialog dialog = builder.create();
              //  dialog.show();
            }
        });

        tv10 = findViewById(R.id.tv_10);
        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Selain gatal atau nyeri, tanda kanker pada tahi lalat biasanya mudah berdarah. Seperti jika terjadi kontak atau tersenggol. Apabila sudah menjadi luka dan mongering namun tidak kunjung sembuh, maka hal ini perlu diwaspadai karena tahi lalat anda berpotensi menjadi kanker kulit.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        kirim = findViewById(R.id.b_check);

            kirim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rg1 = findViewById(R.id.jk_1);
                    int rad1 = rg1.getCheckedRadioButtonId();
                    rb1 = findViewById(rad1);

                    rg2 = findViewById(R.id.jk_2);
                    int rad2 = rg2.getCheckedRadioButtonId();
                    rb2 = findViewById(rad2);

                    rg3 = findViewById(R.id.jk_3);
                    int rad3 = rg3.getCheckedRadioButtonId();
                    rb3 = findViewById(rad3);

                    rg4 = findViewById(R.id.jk_4);
                    int rad4 = rg4.getCheckedRadioButtonId();
                    rb4 = findViewById(rad4);

                    rg5 = findViewById(R.id.jk_5);
                    int rad5 = rg5.getCheckedRadioButtonId();
                    rb5 = findViewById(rad5);

                    rg6 = findViewById(R.id.jk_6);
                    int rad6 = rg6.getCheckedRadioButtonId();
                    rb6 = findViewById(rad6);

                    rg7 = findViewById(R.id.jk_7);
                    int rad7 = rg7.getCheckedRadioButtonId();
                    rb7 = findViewById(rad7);

                    rg8 = findViewById(R.id.jk_8);
                    int rad8 = rg8.getCheckedRadioButtonId();
                    rb8 = findViewById(rad8);

                    rg9 = findViewById(R.id.jk_9);
                    int rad9 = rg9.getCheckedRadioButtonId();
                    rb9 = findViewById(rad9);

                    rg10 = findViewById(R.id.jk_10);
                    int rad10 = rg10.getCheckedRadioButtonId();
                    rb10 = findViewById(rad10);

                    rg11 = findViewById(R.id.jk_11);
                    int rad11 = rg11.getCheckedRadioButtonId();
                    rb11 = findViewById(rad11);

                    rg12 = findViewById(R.id.jk_12);
                    int rad12 = rg12.getCheckedRadioButtonId();
                    rb12 = findViewById(rad12);

                    rg13 = findViewById(R.id.jk_13);
                    int rad13 = rg13.getCheckedRadioButtonId();
                    rb13 = findViewById(rad13);

                    rg14 = findViewById(R.id.jk_14);
                    int rad14 = rg14.getCheckedRadioButtonId();
                    rb14 = findViewById(rad14);

                    if (rb1.getText().toString().equals("Ya")){
                        nilai1 = 1;
                    }else{
                        nilai1 = 0;
                    }

                    Log.d("tag3", rb1.getText().toString());

                    if (rb2.getText().toString().equals("Ya")){
                        nilai2 = 1;
                    }else{
                        nilai2 = 0;
                    }

                    if (rb3.getText().toString().equals("Ya")){
                        nilai3 = 1;
                    }else{
                        nilai3 = 0;
                    }

                    if (rb4.getText().toString().equals("Ya")){
                        nilai4 = 1;
                    }else{
                        nilai4 = 0;
                    }

                    if (rb5.getText().toString().equals("Ya")){
                        nilai5 = 1;
                    }else{
                        nilai5 = 0;
                    }

                    if (rb6.getText().toString().equals("Ya")){
                        nilai6 = 1;
                    }else{
                        nilai6 = 0;
                    }

                    if (rb7.getText().toString().equals("Ya")){
                        nilai7 = 1;
                    }else{
                        nilai7 = 0;
                    }

                    if (rb8.getText().toString().equals("Ya")){
                        nilai8 = 1;
                    }else{
                        nilai8 = 0;
                    }

                    if (rb9.getText().toString().equals("Ya")){
                        nilai9 = 1;
                    }else{
                        nilai9 = 0;
                    }

                    if (rb10.getText().toString().equals("Ya")){
                        nilai10 = 1;
                    }else{
                        nilai10 = 0;
                    }

                    if (rb12.getText().toString().equals("Ya")){
                        nilai11 = 1;
                    }else{
                        nilai11 = 0;
                    }

                    if (rb12.getText().toString().equals("Ya")){
                        nilai12 = 1;
                    }else{
                        nilai12 = 0;
                    }

                    if (rb13.getText().toString().equals("Ya")){
                        nilai13 = 1;
                    }else{
                        nilai13 = 0;
                    }

                    if (rb14.getText().toString().equals("Ya")){
                        nilai14 = 1;
                    }else{
                        nilai14 = 0;
                    }

                    arrayUserValue = new double[]{
                            nilai1, nilai2, nilai3, nilai4, nilai5, nilai6, nilai7, nilai8,
                            nilai9,nilai10, nilai11, nilai12, nilai13, nilai14
                    };

                    checkButton(arrayUserValue,MainActivity.this);

                    Log.d("TAG2", String.valueOf(nilai1) + " " + String.valueOf(nilai3) + " " + String.valueOf(nilai4)
                            + " " + String.valueOf(nilai5)  + " " + String.valueOf(nilai6)  + " " + String.valueOf(nilai7)
                            + " " + String.valueOf(nilai8)  + " " + String.valueOf(nilai9)  + " " + String.valueOf(nilai10)
                            + " " + String.valueOf(nilai11)  + " " + String.valueOf(nilai12)  + " " + String.valueOf(nilai13)
                            + " " + String.valueOf(nilai14));
                }
            });
        }


    public void checkButton(double userValue[], Context context){

        double nur = 0.0;

        double [] vur  ={
                1 * (1*arrayVariabelOrder[0]/14),1 * (1*arrayVariabelOrder[1]/14),1 * (1*arrayVariabelOrder[2]/14),
                1 * (1*arrayVariabelOrder[3]/14),1 * (1*arrayVariabelOrder[4]/14),1 * (1*arrayVariabelOrder[5]/14),
                1 * (1*arrayVariabelOrder[6]/14),1 * (1*arrayVariabelOrder[7]/14),1 * (1*arrayVariabelOrder[8]/14),
                1 * (1*arrayVariabelOrder[9]/14),1 * (1*arrayVariabelOrder[10]/14),1 * (1*arrayVariabelOrder[11]/14),
                1 * (1*arrayVariabelOrder[12]/14),1 * (1*arrayVariabelOrder[13]/14)
        };

        for (int i = 0 ; i <vur.length ; i++){
            nur += vur[i];
        }

        nur = nur/14;

        double rur = nur/1;

        double [] cfValue = {
                userValue[0] * arrayBobot[0], userValue[1] * arrayBobot[1], userValue[2] * arrayBobot[2],
                userValue[3] * arrayBobot[3], userValue[4] * arrayBobot[4], userValue[5] * arrayBobot[5],
                userValue[6] * arrayBobot[6], userValue[7] * arrayBobot[7], userValue[8] * arrayBobot[8],
                userValue[9] * arrayBobot[9], userValue[10] * arrayBobot[10], userValue[11] * arrayBobot[11],
                userValue[12] * arrayBobot[12], userValue[13] * arrayBobot[13]
        };

        double [] cfrValue = {
                cfValue[0]*rur, cfValue[1]*rur,cfValue[2]*rur,
                cfValue[3]*rur, cfValue[4]*rur,cfValue[5]*rur,
                cfValue[6]*rur, cfValue[7]*rur,cfValue[8]*rur,
                cfValue[9]*rur, cfValue[10]*rur,
                cfValue[11]*rur, cfValue[12]*rur,cfValue[13]*rur,
        };

        double cfCom0 = cfrValue[0]+cfrValue[1]*(1-cfrValue[0]);
        double cfCom1 = cfCom0+cfrValue[2]*(1-cfCom0);
        double cfCom2 = cfCom1+cfrValue[3]*(1-cfCom1);
        double cfCom3 = cfCom2+cfrValue[4]*(1-cfCom2);
        double cfCom4 = cfCom3+cfrValue[5]*(1-cfCom3);
        double cfCom5 = cfCom4+cfrValue[6]*(1-cfCom4);
        double cfCom6 = cfCom5+cfrValue[7]*(1-cfCom5);
        double cfCom7 = cfCom6+cfrValue[8]*(1-cfCom6);
        double cfCom8 = cfCom7+cfrValue[9]*(1-cfCom7);
        double cfCom9 = cfCom8+cfrValue[10]*(1-cfCom8);
        double cfCom10 = cfCom9+cfrValue[11]*(1-cfCom9);
        double cfCom11 = cfCom10+cfrValue[12]*(1-cfCom10);
        double cfCom12 = cfCom11+cfrValue[13]*(1-cfCom11);

        double [] cfCom = {
                cfCom0,cfCom1, cfCom2, cfCom3, cfCom4, cfCom5,cfCom6,cfCom7,
                cfCom8,cfCom9,cfCom10,cfCom11,cfCom12
        };

        double presentase = cfCom12 * 100;


        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (presentase >= 71){
            builder.setTitle("Kemungkinan " + Double.toString(presentase) + " %");
            builder.setMessage("Anda Berpotensi terkena kanker kulit Nodular Melanoma");
        }else {
            builder.setTitle("Kemungkinan " + Double.toString(presentase) + " %");
            builder.setMessage("Anda Tidak Berpotensi terkena kanker kulit Nodular Melanoma");
        }

        AlertDialog dialog = builder.create();

        dialog.show();

        Log.d("VUR", Arrays.toString(vur));
        Log.d("NUR", Double.toString(nur));
        Log.d("RUR", Double.toString(rur));
        Log.d("cfValue", Arrays.toString(cfValue));
        Log.d("cfrValue", Arrays.toString(cfrValue));
        Log.d("cfCom", Arrays.toString(cfCom));
        Log.d("total", Double.toString(presentase) + " %");
    }

}
