package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity extends AppCompatActivity() {

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView istVien;
    private Button button;

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView findViewById (R.id.ListView);
        button findViewById (R.id.button);
        button.setOnClickListener(new View . OnClickListener () {

            @Override

            public void onClick(View view) {

                addItem(view);
            }
        });

        items = new ArrayList <> ();
        itensAdapter = new ArrayAdapter < > (context: this, android.R.layout.simple list iten 1, itens);
        listView.setAdapter(itemsAdapter);
        setUpListVienListener();


        private void setUpListViewListener() {
            listView.setOnItemLongClickListener(new AdapterView . OnItemlongClickListener () {

                @Override
                public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long 1) {
                    Context context -getApplicationContext();
                    Toast.makeText(content, text: "item removed", Toast.LENGTH_LONG).
                }
            });
        }

            private void addItem(View view) (
                Edit Text input = findViewById(R.id.editText2);
                String itemText =  input.getText().toString();

                if(1(itemText.equals("")))(
                ItemsAdapter.add(itenText);
                input.setText("");

                    else{

             Toast.makeText (getApplicationContext(), text: "Please enter text..", Toast.LENGTH LONG).show();

        }
    }}