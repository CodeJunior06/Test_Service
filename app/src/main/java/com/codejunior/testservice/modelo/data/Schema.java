package com.codejunior.testservice.modelo.data;

import android.provider.BaseColumns;

public final class Schema {

    public static class Utilities implements BaseColumns {
        public  static  final String TABLE_VIDEO_JUEGOS = "video_juego";
        public  static  final String COLUMN_VIDEO_ID = "vid_id";
        public  static  final String COLUMN_VIDEO_TITULO = "vid_titulo";
        public  static  final String COLUMN_VIDEO_ANIO = "vid_anio";
        public  static  final String COLUMN_VIDEO_PROTAGONISTAS = "vid_protagonista";
        public  static  final String COLUMN_VIDEO_DIRECTOR = "vid_director";
        public  static  final String COLUMN_VIDEO_PRODUCTOR = "vid_productor";
        public  static  final String COLUMN_VIDEO_TECNOLOGIA = "vid_tecnologia";
        public  static  final String COLUMN_VIDEO_CATEGORIA = "vid_cat_id";


        public  static  final String TABLE_CLIENTE = "cliente";
        public  static  final String COLUMN_CLIENTE_ID = "cli_id";
        public  static  final String COLUMN_CLIENTE_CEDULA = "cli_cedula";
        public  static  final String COLUMN_CLIENTE_NOMBRE = "cli_nombre";
        public  static  final String COLUMN_CLIENTE_SEXO = "cli_sexo";

        public  static  final String TABLE_FACTURA = "factura";
        public  static  final String COLUMN_FACTURA_ID = "fac_id";
        public  static  final String COLUMN_FACTURA_FECHA = "fac_fecha";
        public  static  final String COLUMN_FACTURA_DIAS_ALQUILADOS = "fac_dias";
        public  static  final String COLUMN_FACTURA_VIDEO = "fac_vid_id";
        public  static  final String COLUMN_FACTURA_CLIENTE = "fac_cli_id";

        public  static  final String TABLE_CATEGORIA = "categoria";
        public  static  final String COLUMN_CATEGORIA_ID = "cat_id";
        public  static  final String COLUMN_CATEGORIA_NOMBRE = "cat_nombre";

        public  static  final String DB = "test.db";
        public  static  final int VERSION = 1;

        public static final String SQL_CREATE_CATEGORIAS =
                "CREATE TABLE " + TABLE_CATEGORIA + " (" +
                        COLUMN_CATEGORIA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUMN_CATEGORIA_NOMBRE + " TEXT)";

        public static final String SQL_DELETE_CATEGORIAS =
                "DROP TABLE IF EXISTS " + TABLE_CATEGORIA;


        public static final String SQL_CREATE_VIDEO_JUEGOS =
                "CREATE TABLE " + TABLE_VIDEO_JUEGOS + " (" +
                        COLUMN_VIDEO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUMN_VIDEO_TITULO + " TEXT," +
                        COLUMN_VIDEO_ANIO + " TEXT,"+
                        COLUMN_VIDEO_PROTAGONISTAS + " TEXT,"+
                        COLUMN_VIDEO_DIRECTOR + " TEXT," +
                        COLUMN_VIDEO_PRODUCTOR + " TEXT," +
                        COLUMN_VIDEO_TECNOLOGIA + " TEXT,"+
                        COLUMN_VIDEO_CATEGORIA + " INTEGER," +
                        " FOREIGN KEY ("+COLUMN_VIDEO_CATEGORIA+") REFERENCES " +TABLE_CATEGORIA+"("+COLUMN_CATEGORIA_ID+")" +
                        "ON UPDATE CASCADE ON DELETE CASCADE);";

        public static final String SQL_DELETE_VIDEO_JUEGOS =
                "DROP TABLE IF EXISTS " + TABLE_VIDEO_JUEGOS;


        public static final String SQL_CREATE_CLIENTES =
                "CREATE TABLE " + TABLE_CLIENTE + " (" +
                        COLUMN_CLIENTE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUMN_CLIENTE_CEDULA + " TEXT," +
                        COLUMN_CLIENTE_NOMBRE + " TEXT,"+
                        COLUMN_CLIENTE_SEXO + " TEXT)";


        public static final String SQL_DELETE_CLIENTES =
                "DROP TABLE IF EXISTS " + TABLE_CLIENTE;



        public static final String SQL_CREATE_FACTURAS =
                "CREATE TABLE " + TABLE_FACTURA + " (" +
                        COLUMN_FACTURA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUMN_FACTURA_FECHA + " TEXT NOT NULL," +
                        COLUMN_FACTURA_DIAS_ALQUILADOS + "INTEGER,"+
                        COLUMN_FACTURA_CLIENTE+ " INTEGER,"+
                        COLUMN_FACTURA_VIDEO+ " INTEGER,"+
                        " FOREIGN KEY ("+COLUMN_FACTURA_VIDEO+") REFERENCES " +TABLE_VIDEO_JUEGOS+"("+COLUMN_VIDEO_ID+"),"+
                        " FOREIGN KEY ("+COLUMN_FACTURA_CLIENTE+") REFERENCES " +TABLE_CLIENTE+"("+COLUMN_CLIENTE_ID+")"+
                        "ON UPDATE CASCADE ON DELETE CASCADE);";


        public static final String SQL_DELETE_FACTURAS =
                "DROP TABLE IF EXISTS " + TABLE_FACTURA;
    }
}