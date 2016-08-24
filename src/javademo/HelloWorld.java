package javademo;

/**
 * Created by tm on 16/8/24.
 */
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        message = "Hello world, this message is from servlet!";
    }
    int i = 1;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        try {
            Thread.sleep(1000*4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i++;
        response.getWriter().write(i+"");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}