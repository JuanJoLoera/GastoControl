package com.gastoid.juanjo_android.gastocontrol;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by JuanJo - Maricela on 29/05/2015.
 */
public class GastoControlSQLiteOpenHelper extends SQLiteOpenHelper {


    //public GastoControlSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
    //    super(context, name, factory, version);
    //}

    // Información de la tabla
    public static final String TABLE_MEMBER = "miembros";
    public static final String ID = "_id";
    public static final String NOMBRE = "nombre";
    public static final String DESCRIPCION = "descripcion";
    public static final String COSTO    = "costo";

    // información del a base de datos
    static final String DB_NAME = "DBGASTO";
    static final int DB_VERSION = 1;

    // Información de la base de datos
    private static final String CREATE_TABLE = "create table "
            + TABLE_MEMBER + "(" + ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NOMBRE + " TEXT NOT NULL, "
            + COSTO + " TEXT NOT NULL, "
            + DESCRIPCION + " TEXT NOT NULL);";

    public GastoControlSQLiteOpenHelper(Context context) {
        super(context, DB_NAME, null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i2){

    }

}
