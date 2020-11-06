package lazyboyempires.nmc.baitap05;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView grid;

    String[] titles = {
            "Lucifer",
            "Mammon",
            "Asmodeus",
            "Behemoth",
            "Beelzebub",
            "Leviathan",
            "Belphegor"
    };

    Integer[] instructor = {
            666,
            252433,
            164935,
            100466,
            93932,
            666,
            81762

    };

    Integer[] imgIds = {
            R.drawable.lucifer,
            R.drawable.mammon,
            R.drawable.asmodeus,
            R.drawable.behemoth,
            R.drawable.beelzebub,
            R.drawable.leviathan,
            R.drawable.belphegor

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = (GridView) findViewById(R.id.gridView);

        CustomGridView customGridView = new CustomGridView(MainActivity.this, titles, instructor, imgIds);

        grid.setAdapter(customGridView);
    }
}