package app.coderecationn.com.kaksha;

/**
 * Created by root on 1/9/18.
 */

public class Messages {


    private String message,type,from;
    //    private Date time;


    public Messages()
    {

    }



    public Messages(String message, String type, String from) {
        this.message = message;
        this.type = type;
        this.from = from;


    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrom() {

        return from;
    }


    public void setFrom(String from) {
        this.from = from;
    }
}


