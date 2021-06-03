package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet

        ArrayList<String> al = new ArrayList<>();

        al.add("apple");
        al.add("banana");
        al.add("cherry");
        al.add("durian");

        al.remove(0);

        al.set((al.size() - 1), "dragon fruit");

        String theFruit = al.get(2);

        System.out.println("Size is: " + al.size());

        String msg = "Fruits\n";
        msg += "=====\n";
        for (int i = 0; i < al.size(); i++) {
            msg += al.get(i) + "\n";
        }

        System.out.println(msg);
        tv.setText(msg);
    }
}