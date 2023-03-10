/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TestJavalinProject;

import io.javalin.Javalin;
import static io.javalin.apibuilder.ApiBuilder.*;

public class App {

    public static void main(String[] args) {
        int i = 12;
        
        // Create a Javalin instance.
        var app = Javalin.create();
        
        // Set up the Javalin handlers.
        app.routes(() -> {
            path("users", () -> {
                get(new GetAllUsers(i));
                put(new CreateUser());
            });
        });
        
        // Start the Javalin server.
        app.start(7070);
    }
}
