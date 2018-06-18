package project.com.bancoimobiliariointerdisciplinar.Factory;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import project.com.bancoimobiliariointerdisciplinar.Util.BancoStatitcs;

public class DatabaseFactory extends SQLiteOpenHelper {

    public DatabaseFactory(Context context) {
        super(context, BancoStatitcs.NOME_BANCO, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "create table jogador(" +
                "jogid integer primary key autoincrement," +
                "jognome varchar(100)," +
                "jogsenha varchar(100)," +
                "jognick varchar(100)" +
                ");";
        db.execSQL(sql);



        sql = "create table partida (" +
                "parid integer primary key autoincrement," +
                "parnome varchar(100)," +
                "pardata timestamp," +
                "parstatus numeric(5)" +
                ");";
        db.execSQL(sql);



        sql = "create table propriedade(" +
                "proid integer primary key autoincrement," +
                "protipolote numeric(10)," +
                "prolote varchar(200), " +
                "pronumerocasa numeric(5)," +
                "provalorcompra numeric(8,2)," +
                "provaloraluguel1 numeric(8,2)," +
                "provaloraluguel2 numeric(8,2)," +
                "provaloraluguel3 numeric(8,2)," +
                "provaloraluguel4 numeric(8,2)," +
                "provalorhipoteca numeric(8,2)," +
                "provaloraluguelhotel numeric(8,2)" +
                ");";
        db.execSQL(sql);



        sql = "create table pino (" +
                "pinid integer primary key autoincrement," +
                "pindesc varchar(50) " +
                ");";
        db.execSQL(sql);



        sql = "create table operacao (" +
                "opeid integer primary key autoincrement," +
                "opedesc varchar(100)" +
                ")";
        db.execSQL(sql);



        sql = "create table jogadorpartida(" +
                "jpaid integer primary key autoincrement," +
                "jpajogador integer not null," +
                "jpapartida integer not null," +
                "jpapino integer not null" +
                ")";
        db.execSQL(sql);

        sql = "create table jogada(" +
                "jgajogador integer not null ," +
                "jgapartida integer not null," +
                "jgapropriedade integer not null," +
                "jgaoperacao integer not null" +
                ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists jogadorpartida");
        db.execSQL("drop table if exists jogada");
        db.execSQL("drop table if exists jogador");
        db.execSQL("drop table if exists partida");
        db.execSQL("drop table if exists propriedade");
        db.execSQL("drop table if exists pino");
        db.execSQL("drop table if exists operacao");

        onCreate(db);
    }
}
