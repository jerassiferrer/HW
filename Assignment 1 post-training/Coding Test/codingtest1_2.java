

public class MainActivity extends AppCompatActivity {

    EditText myeditText1;
    EditText myeditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myeditText1 = (EditText) findViewById(R.id.myeditText1);
        myeditText2 = (EditText) findViewById(R.id.myeditText2);

        final Button mybtn = (Button) findViewById(R.id.btn);


        mybtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                if(myeditText1.getText().toString().length()>0 && myeditText2.getText().toString().length()>0)
                {
                    Toast.makeText(MainActivity.this, "ARE NOT EMPTY", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
    }

   
}