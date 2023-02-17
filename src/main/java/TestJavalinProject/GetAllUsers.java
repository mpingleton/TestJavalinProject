package TestJavalinProject;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class GetAllUsers implements Handler {
    
    int i = 0;
    
    public GetAllUsers(int l) {
        i = l;
    }

    @Override
    public void handle(Context cntxt) throws Exception {
        cntxt.result("i = " + i);
    }
}
