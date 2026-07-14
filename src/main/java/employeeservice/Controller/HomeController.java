package employeeservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = "text/html")
    public String home() {

        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Employee Service</title>
            </head>

            <body style="font-family:Arial;text-align:center;margin-top:60px;background:#f5f5f5;">

                <h1>🚀 Welcome to Employee Service 🚀</h1>

                <h2>Azure DevOps CI/CD Demo</h2>

                <p>This application is automatically deployed using Azure DevOps Pipeline.</p>

                <br>

                <a href="https://www.youtube.com/" target="_blank"
                   style="font-size:22px;text-decoration:none;">
                    ▶ Open YouTube
                </a>

            </body>
            </html>
            """;
    }
}