package appewtc.masterung.testsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 12/18/2016 AD.
 */

public class MyOpenHelper extends SQLiteOpenHelper{

    private Context context;
    public static final String database_name = "test.db";
    private static final int database_version = 1;
    public static final String testTABLE = "testTABLE";
    public static final String column_id = "_id";
    public static final String column_Name = "Name";
    public static final String column_Surname = "Surname";
    private static final String create_table = "create table testTABLE (" +
            "_id integer primary key," +
            "Name text," +
            "Surname text);";

    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
