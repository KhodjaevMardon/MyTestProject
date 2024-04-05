package uz.mkhodjaev.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.mkhodjaev.dto.MyLittleDto;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class MyController {

    @PostMapping("/hello")
    public void hello(@RequestBody MyLittleDto myLittleDto,
                        HttpServletResponse response) throws IOException {
        System.out.println("Hello, " + myLittleDto.getName());
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("Hello, " + myLittleDto.getName());
        response.getWriter().close();
    }

    @Autowired
    public MyController() {
    }
}
