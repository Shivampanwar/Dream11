package shivam.panwar.actressdetails;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by panwa on 10/26/2016.
 */
public class Actressfragment extends Fragment {
    private Actress actress;
    private TextView tv1,tv2;
    private ImageView iv1;
    private String value,value1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //actress = new Actress();


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_actress, container, false);
        //return v;
        tv1= (TextView) v.findViewById(R.id.textview);
        tv2= (TextView) v.findViewById(R.id.details);
         value = getActivity().getIntent().getStringExtra(actressadapter.str);
        value1=getActivity().getIntent().getStringExtra(actressadapter.str1);
        tv1.setText(value);
        tv2.setText(value1);
        iv1= (ImageView) v.findViewById(R.id.iv);
        switch (value) {
            case "Sachin Tendulkar":
                iv1.setImageResource(R.drawable.sachintendulkar);
                break;
            case "Adam Gilchrist(WK)":
                iv1.setImageResource(R.drawable.gilchrist);
                break;
            case "Brian Lara":
                iv1.setImageResource(R.drawable.lara);
                 break;
            case "Sunil Gavaskar":
                iv1.setImageResource(R.drawable.gavaskar);
                break;
            case "Imran Khan":
                iv1.setImageResource(R.drawable.imrankhan);
                break;
            case "Wasim Akram":
                iv1.setImageResource(R.drawable.wasimakram);
                break;
            case "Waqar Younis":
                iv1.setImageResource(R.drawable.waqaryounis);
                break;
            case "Ricky Ponting(C)":
                iv1.setImageResource(R.drawable.ponting);
                break;
            case "M. Muralitharan":
                iv1.setImageResource(R.drawable.maralitharan);
                break;
            case "Glenn Mcgrath":
                iv1.setImageResource(R.drawable.mcgrath);
                break;
            case "Viv Richards":
                iv1.setImageResource(R.drawable.vivrichards);
                break;
        }

        return  v;
    }
}
