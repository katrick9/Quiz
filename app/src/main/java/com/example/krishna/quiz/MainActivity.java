package com.example.krishna.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import static android.R.string.no;

public class MainActivity extends AppCompatActivity {

    int Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        CheckBox A = (CheckBox) findViewById(R.id.A);
        Boolean a = A.isChecked();
        CheckBox B = (CheckBox) findViewById(R.id.B);
        Boolean b = B.isChecked();
        CheckBox C = (CheckBox) findViewById(R.id.C);
        Boolean c = C.isChecked();
        CheckBox D = (CheckBox) findViewById(R.id.D);
        Boolean d = D.isChecked();
        CheckBox E = (CheckBox) findViewById(R.id.E);
        Boolean e = E.isChecked();
        CheckBox F = (CheckBox) findViewById(R.id.F);
        Boolean f = F.isChecked();
        CheckBox G = (CheckBox) findViewById(R.id.G);
        Boolean g = G.isChecked();
        CheckBox H = (CheckBox) findViewById(R.id.H);
        Boolean h = H.isChecked();
        CheckBox I = (CheckBox) findViewById(R.id.I);
        Boolean i = I.isChecked();
        CheckBox J = (CheckBox) findViewById(R.id.J);
        Boolean j = J.isChecked();
        CheckBox K = (CheckBox) findViewById(R.id.K);
        Boolean k = K.isChecked();
        CheckBox L = (CheckBox) findViewById(R.id.L);
        Boolean l = L.isChecked();
        int score = calculateScore(Score, a, b, c, d,e,f,g,h,i,j,k,l);
        Toast toast = Toast.makeText(this,"U have scored: "+score+" out of 3",Toast.LENGTH_SHORT );
        toast.show();

    }

    public int calculateScore(int Score, Boolean a, Boolean b, Boolean c, Boolean d, Boolean e,Boolean f,Boolean g,Boolean h,Boolean i,Boolean j,Boolean k,Boolean l) {
        if (a && b == false && c==false && d==false && Score>0) {
            Score = Score - 1;
        } else if (a==false && b && c==false && d==false) {
            Score = Score + 1;
        } else if (a==false && b == false && c && d==false && Score>0) {
            Score = Score - 1;
        } else if (a==false && b == false && c==false && d && Score>0) {
            Score = Score - 1;
        }else if(a && b && c && d && Score>0){
            Score = Score - 1;
        }if (e && f==false && g==false && h==false && Score>0) {
            Score = Score - 1;
        } else if (e==false && f && g==false && h==false && Score>0) {
            Score = Score - 1;
        } else if (e==false && f==false && g && h==false) {
            Score = Score + 1;
        } else if (e==false && f==false && g==false && h && Score>0 ) {
            Score = Score - 1;
        }else if(e && f && g && h && Score>0){
            Score = Score - 1;
        }
        if (i && j==false && k==false && l==false) {
            Score = Score + 1;
        } else if (i==false && j && k==false && l==false && Score>0) {
            Score = Score - 1;
        } else if (i==false && j==false && k && l==false && Score>0) {
            Score = Score - 1;
        } else if (i==false && j==false && k==false && l && Score>0) {
            Score = Score - 1;
        }else if(i && j && k && l && Score>0){
            Score = Score - 1;
        }
        else {
            Score = 0;
        }
        return Score;
    }
}
