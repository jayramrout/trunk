package jrout.tutorial.webservice;
import static spark.Spark.*;
/**
 * Created by jrout on 1/3/2017.
 * After running this program, open up a browser and access
 * http://localhost:4567/rest
 */

public class TestRest {
    public static void main(String ...arg) {
        get("/rest",(request, response) -> "Hello Rest");
    }
}
