package sg.edu.rp.c346.id19036308.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColorBox;
    ArrayList<Box> alBoxList;
    CustomAdapter caBox;
    ImageView ivColorbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColorBox = findViewById(R.id.listViewColorBox);
        ivColorbox = findViewById(R.id.imageViewColorBox);
        alBoxList = new ArrayList<>();
        Box item1 = new Box("blue");
        alBoxList.add(item1);
        Box item2 = new Box("orange");
        alBoxList.add(item2);
        Box item3 = new Box("brown");
        alBoxList.add(item3);
        caBox = new CustomAdapter(this, R.layout.row, alBoxList);
        lvColorBox.setAdapter(caBox);
    }
}
