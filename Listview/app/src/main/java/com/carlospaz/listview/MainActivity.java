package com.carlospaz.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlospaz on 30/6/16.
 */
public class MainActivity extends Activity {
    private ListView lvProducts;

    private ProductsListAdapter Adapter;
    private List<Products> mProductsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_main);

        lvProducts = (ListView)findViewById(R.id.listview_product);
        mProductsList = new ArrayList<>();

        // agregar datos a la list

        mProductsList.add(new Products(1, "Galaxy J", 200, "Samsung Galaxy J 16GB" ));
        mProductsList.add(new Products(3, "Galaxy K", 250, "Samsung Galaxy K 16GB" ));
        mProductsList.add(new Products(4, "Galaxy X", 300, "Samsung Galaxy X 16GB" ));
        mProductsList.add(new Products(5, "Galaxy A", 100, "Samsung Galaxy A 16GB" ));
        mProductsList.add(new Products(6, "Galaxy B", 200, "Samsung Galaxy B 16GB" ));
        mProductsList.add(new Products(7, "Galaxy C", 400, "Samsung Galaxy C 16GB" ));
        mProductsList.add(new Products(8, "Galaxy D", 250, "Samsung Galaxy D 256GB" ));
        mProductsList.add(new Products(9, "Galaxy E", 500, "Samsung Galaxy E 64GB" ));
        mProductsList.add(new Products(10, "Galaxy F", 450, "Samsung Galaxy F 128GB" ));
        mProductsList.add(new Products(11, "Galaxy G", 200, "Samsung Galaxy G 36GB" ));
        mProductsList.add(new Products(12, "Galaxy H", 600, "Samsung Galaxy h 160GB" ));

        // iniciar adaprter

        Adapter = new ProductsListAdapter(getApplicationContext(), mProductsList);
        lvProducts.setAdapter(Adapter);

        lvProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Producto Clicleado id =" +view.getTag(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
