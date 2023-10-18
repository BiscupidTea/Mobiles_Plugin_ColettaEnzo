package com.coletta.colettalogger;

public class Logger {
    static final String LOGTAG = "ColettaLog";
    static Logger _instance = null;
    public static Logger getInstance(){
        if (_instance == null)
            _instance = new Logger();
        return  _instance;
    }
    public String getLogTag(){
        return LOGTAG;
    }
}
