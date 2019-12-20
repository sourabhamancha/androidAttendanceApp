package com.delaroystudios.teacherassistant;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Sourabh Amancha on 2/5/2017.
 */

public class staff_db extends AppCompatActivity {

    public static final String KEY_ROWID = "_id";
    public static final String KEY_NAME = "_name";
    public static final String KEY_AGE = "_age";
    public static final String KEY_UNAME = "_uname";
    public static final String KEY_PASS = "_pass";

    private static final String DATABASE_NAME = "staffDB";
    private static final String DATABASE_TABLE = "staffTABLE";
    private static final int DATABASE_VERSION = 1;

    private DbHelper ourHelper;
    private final Context ourContext;
    private SQLiteDatabase ourDatabase;

    public long creatEntry(String name, String age, String uname, String pass) {

        ContentValues cv = new ContentValues();
        cv.put(KEY_NAME, name);
        cv.put(KEY_AGE, age);
        cv.put(KEY_UNAME, uname);
        cv.put(KEY_PASS, pass);
        return ourDatabase.insert(DATABASE_TABLE, null, cv);

    }

    public String getData() {

        String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_AGE, KEY_UNAME, KEY_PASS};
        Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
        String result = "";

        int iRow = c.getColumnIndex(KEY_ROWID);
        int iName = c.getColumnIndex(KEY_NAME);
        int iAge = c.getColumnIndex(KEY_AGE);
        int iUname = c.getColumnIndex(KEY_UNAME);
        int iPass= c.getColumnIndex(KEY_PASS);

        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
            result = result + c.getString(iRow) + " " + c.getString(iName) + "          " + c.getString(iAge) + "               " + c.getString(iUname) + "               " + c.getString(iPass) + "\n";
        }
        return result;
    }

    public String searchPass(String str) {

        ourDatabase = this.ourHelper.getReadableDatabase();
        String query = "select uname, pass from " + DATABASE_TABLE;
        Cursor cursor = ourDatabase.rawQuery(query, null);
        String a, b;
        b = "not found";
        if(cursor.moveToFirst()){

            do{
                a =cursor.getString(0);

                if(a.equals(str))
                {
                    b=cursor.getString(1);
                    break;
                }
            }while (cursor.moveToNext());
        }return b;

    }




    private static class DbHelper extends SQLiteOpenHelper{

        public DbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            db.execSQL("CREATE TABLE " + DATABASE_TABLE + " (" + KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_NAME + " TEXT NOT NULL, " + KEY_AGE + " TEXT NOT NULL, " + KEY_UNAME + " TEXT NOT NULL, " + KEY_PASS + " TEXT NOT NULL);"
            );
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
            onCreate(db);
        }
    }



    public staff_db(Context c) {
        ourContext = c;
    }

    public staff_db open() throws SQLException {
        ourHelper = new DbHelper(ourContext);
        ourDatabase = ourHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        ourHelper.close();
    }


}
