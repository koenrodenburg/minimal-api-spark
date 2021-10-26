import static spark.Spark.*;

public class MinimalApi {
    public static void main(String[] args) {
        get("/hello", (request, response) -> "Hello world!");
    }
}