package com.example.a3homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    SearchView mySearchView;
    ListView myList;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mySearchView=(SearchView) findViewById(R.id.searchView);
        myList=(ListView) findViewById(R.id.myList);

        list=new ArrayList<String>();

        list.add("Bibhuti Bhusan Dash  ");
        list.add("Chinmaya Misra   ");
        list.add("Jnyana Ranjan Mohanty    ");
        list.add("Kamakhya Narain Singh    ");
        list.add("Manas Kumar Rath ");
        list.add("Manas Mukul  ");
        list.add("Manoj Ranjan Mishra  ");
        list.add("Parthasarathi Pattnayak  ");
        list.add("Prachi Vijayeeta ");
        list.add("Rabindra Kumar Barik ");
        list.add("Sadhna Sudershana    ");
        list.add("Satya Ranjan Dash    ");
        list.add("Sudhansu Shekhar Patra   ");
        list.add("Utpal Chandra De ");
        list.add("Veena Goswami    ");
        list.add("Amit Kumar Das   ");
        list.add("Aparupa Pani ");
        list.add("Asish Kumar Pani ");
        list.add("Bandita Paikaray ");
        list.add("Benu Gopal Mohapatra ");
        list.add("Bhagabata Jena   ");
        list.add("Bhagyashree Panda    ");
        list.add("Bitanjaya Das    ");
        list.add("Brundaban Beriha ");
        list.add("Chinmay Kumar Kundu  ");
        list.add("Dillip Kumar Bera    ");
        list.add("Dipti Ranjan Biswal  ");
        list.add("Dudam Bharath Kumar  ");
        list.add("Gaurav Udgata    ");
        list.add("Ipsita Mohanty   ");
        list.add("Ipsita Panda ");
        list.add("Jyotiprakash Padhi   ");
        list.add("Kalpana Sahoo    ");
        list.add("Kirtikanta Sahoo ");
        list.add("Kshyana Prava Samal  ");
        list.add("Kundan Samal ");
        list.add("Madhu Lisha Pattanaik    ");
        list.add("Malaya Mohanty   ");
        list.add("Mohibullah   ");
        list.add("Alivarani Mohapatra  ");
        list.add("Ankit Kumar Soni ");
        list.add("Arjyadhara Pradhan   ");
        list.add("Babita Panda ");
        list.add("Banishree Misra  ");
        list.add("Byamakesh Nayak  ");
        list.add("Chinmoy Kumar Panigrahi  ");
        list.add("Chitralekha Jena ");
        list.add("Deepak Kumar Gupta   ");
        list.add("Geetanjali Dei   ");
        list.add("K.V.V.S.R.Chowdary   ");
        list.add("Lipika Nanda ");
        list.add("Lipsa Subhadarshini  ");
        list.add("Manoj K. Maharana    ");
        list.add("Padarbinda Samal ");
        list.add("Pampa sinha  ");
        list.add("Pradeep Kumar Sahu   ");
        list.add("Ranjeeta Patel   ");
        list.add("Rudra Narayan Dash   ");
        list.add("Rudranarayan Senapati    ");
        list.add("Samita Rani Pani ");
        list.add("Sanhita Mishra   ");
        list.add("Sarat Chandra Swain  ");
        list.add("Sarita Samal ");
        list.add("Satyabrata sahoo ");
        list.add("Satyaranjan Jena ");
        list.add("Shubhasri Kundu  ");
        list.add("Snehalika    ");
        list.add("Srikanta Mohapatra   ");
        list.add("Sriparna Roy Ghatak  ");
        list.add("Subhendu Bikash Santra   ");
        list.add("Subhra Debdas    ");
        list.add("Subodh Kumar Mohanty ");
        list.add("Subrat Behera    ");
        list.add("Subrat Kumar Barik   ");
        list.add("Suchismita Roy   ");
        list.add("Swagat Das   ");
        list.add("Tanmoy Roy Choudhury ");
        list.add("Tapas Roy    ");
        list.add("Tapaswini Biswal ");
        list.add("Abhik Gorai  ");
        list.add("Abu Nasar Ghazali    ");
        list.add("Akshaya Kumar Pati   ");
        list.add("Amit Bakshi  ");


        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        myList.setAdapter(adapter);

        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String s) {
                adapter.getFilter().filter(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }
}
