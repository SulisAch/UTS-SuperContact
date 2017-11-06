package sulisach.supercontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    KontakAdapter adapter;
    List<KontakModel> kontakModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv);
        adapter = new KontakAdapter(this, kontakModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        isiData();
    }
    private void isiData(){
        KontakModel model = new KontakModel("Sulis Achmad", "sulisachmad31@gmail.com", "08964235");
        kontakModels.add(model);

        model = new KontakModel("Jalaludin", "jalaludin_200397@yahoo.com", "0812345683");
        kontakModels.add(model);

        model = new KontakModel("Jusuf Effandi", "jusufkalla@gmail.com", "08733573");
        kontakModels.add(model);

        adapter.notifyDataSetChanged();
    }
}
