package com.example.vazquez.credits;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by vazquez on 18/04/2018.
 */

public class CreditsDhActivity extends AppCompatActivity {

    public CreditsActivity[] credits = {
            new CreditsActivity("Android Studio Tutorial - UBER Car animation", "EDMT Dev", "https://www.youtube.com/watch?v=mAotyuaOAb0&t=1159s"),
            new CreditsActivity("Android Studio Tutorial - Cover Flow Item Click", "EDMT Dev", "https://www.youtube.com/watch?v=wI9LWO6hKCc&t=1634s"),
            new CreditsActivity("Android Studio Tutorial - Cover Flow", "EDMT Dev", "https://www.youtube.com/watch?v=CtXDhaqbTZQ&t=25s"),
            new CreditsActivity("Android Studio Tutorial 1.8.1 Español | Juego adivina el Pokemon | Creacion de menu", "HearTom", "https://www.youtube.com/watch?v=jvPhFqQuV3k"),
            new CreditsActivity("Android Studio Tutorial - Circle Menu", "EDMT Dev", "https://www.youtube.com/watch?v=baKdWSn-z2I"),
            new CreditsActivity("How to Build a Basic 2D-puzzle in Android Studio", "Dave Park", "https://www.youtube.com/watch?v=YKbFx8PDTIo"),
            new CreditsActivity("Android Studio Tutorial - Carousel Picker", "EDMT Dev", "https://www.youtube.com/watch?v=sTJm1Ys9jMI&t=10s"),
            new CreditsActivity("Crear Un Chat En Menos De Una Hora | Firebase y Android Studio", "KAD", "https://www.youtube.com/watch?v=DFnxY_PEnYY"),
            new CreditsActivity("Compartir en redes sociales en Android Studio", "Miguel Angel CV", "https://www.youtube.com/watch?v=U5FoBHigFtg"),
            new CreditsActivity("How to create Custom Ratings bar in Android", "Stack Overflow", "https://stackoverflow.com/questions/5800657/how-to-create-custom-ratings-bar-in-android"),
            new CreditsActivity("Programación Android 02 -- Quiz: Pregunta de Test", "Pau Fernández", "https://www.youtube.com/watch?v=bmNptYpIiSQ"),

    };

    private ListView lsvCredits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_dh);
        lsvCredits = (ListView) findViewById(R.id.lsv_credits);
        CreditAdapter adapter = new CreditAdapter(this, credits);
        lsvCredits.setAdapter(adapter);
    }

    static class ViewHolder{
        TextView txvName;
        TextView txvCanal;
        TextView txvLink;

    }


    class CreditAdapter extends ArrayAdapter<CreditsActivity> {
        public CreditAdapter(@NonNull Context context, CreditsActivity[] data) {
            super(context, R.layout.activity_credit, data);
        }

        public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
            View cell = convertView;
            CreditsDhActivity.ViewHolder holder;
            if (cell == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                cell = inflater.inflate(R.layout.activity_credit, null);

                holder = new CreditsDhActivity.ViewHolder();
                holder.txvName = cell.findViewById(R.id.txv_name_parking);
                holder.txvCanal = cell.findViewById(R.id.txv_direcction);
                holder.txvLink = cell.findViewById(R.id.txv_price);

                cell.setTag(holder);
            } else {
                holder = (CreditsDhActivity.ViewHolder) cell.getTag();
            }

            holder.txvName.setText(credits[position].getName());
            holder.txvCanal.setText(credits[position].getCanal());
            holder.txvLink.setText(credits[position].getLink());
            return cell;
        }
    }
}
