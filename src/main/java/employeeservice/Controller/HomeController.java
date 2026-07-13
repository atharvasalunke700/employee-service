package employeeservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Employee Service!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Azure DevOps 🚀 CI";
    }
}