package javademo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tm on 16/8/24.
 */
@WebServlet("/FileDownload")
public class FileDownload extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException {
        try {
            download(response);
        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
        }

    }

    private void download(HttpServletResponse response) throws FileNotFoundException,IOException {
        String realPath = this.getServletContext().getRealPath("/download/1.jpg");
        String fileName = "en.jpg";
        response.setHeader("content-disposition", "attachment;filename="+fileName);
        InputStream in = new FileInputStream(realPath);
        int len = 0;
        byte[] buffer = new byte[1024];

        OutputStream out = response.getOutputStream();
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer,0,len);
        }

        in.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            download(response);
        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
        }

    }
}
