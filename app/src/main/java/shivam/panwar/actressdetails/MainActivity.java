package shivam.panwar.actressdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Actress>alist= new ArrayList<>();
    private RecyclerView mRecyclerView;
    private  actressadapter mActressadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mActressadapter=new actressadapter(alist);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mActressadapter);
        prepareactressData();

    }
    private void prepareactressData()
    {
       // Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
       // movieList.add(movie);
        Actress ac =new Actress("Sachin Tendulkar","India");
        alist.add(ac);
        ac =new Actress("Viv Richards","West Indies");
        alist.add(ac);
        ac=new Actress("Ricky Ponting(C)","Australia");
        alist.add(ac);
        ac=new Actress("Adam Gilchrist(WK)","Australia");
        alist.add(ac)
;
        ac=new Actress("Brian Lara","West Indies");
        alist.add(ac);
        ac=new Actress("Sunil Gavaskar","India");
        alist.add(ac);
        ac=new Actress("Imran Khan","Pakistan");
        alist.add(ac);
        ac=new Actress("Wasim Akram","Pakistan");
        alist.add(ac);
        ac=new Actress("Glenn Mcgrath","Australia");
        alist.add(ac);
        ac=new Actress("M. Muralitharan","SriLanka");
        alist.add(ac);
        ac=new Actress("Waqar Younis","Pakistan");
        alist.add(ac);



        mActressadapter.notifyDataSetChanged();


    }
}
