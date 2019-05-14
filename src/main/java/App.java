import static spark.Spark.*;

public class App {

    public static void main(String[] args) {

        staticFiles.location("/public"); // Static files
        get("/greet", (req, res) -> "Hello");
        get("/greet/:username", (req, res) -> "Hello, " + req.params("username"));
        get("/greet/:username/language/:language", (req, res) ->
             "Hello, lunga " + req.params(":language"));
    }
}