package com.mrt.todolist.db;

import android.provider.BaseColumns;


public class Task {

    public static final String DB_NAME = "com.mrt.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns{
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }
}