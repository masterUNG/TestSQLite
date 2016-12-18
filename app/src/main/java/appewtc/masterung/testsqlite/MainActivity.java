package appewtc.masterung.testsqlite;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;
    private EditText editText, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

        myOpenHelper = new MyOpenHelper(MainActivity.this);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();

        //Insert
        //insertValue("testName", "testSurname");

    }   // Main Method

    public void clickAddData(View view) {
        String s = editText.getText().toString().trim();
        String s1 = editText2.getText().toString().trim();

        insertValue(s, s1);

    }

    private void insertValue(String strName, String strSurname) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(MyOpenHelper.column_Name, strName);
        contentValues.put(MyOpenHelper.column_Surname, strSurname);
        sqLiteDatabase.insert(MyOpenHelper.testTABLE, null, contentValues);

    }
}   // Main Class
