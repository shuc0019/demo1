import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Hej verden";
    }
    // hello world

    public static void main(String[] args) {
        System.out.println("allo allo");
    }
2eofkdoåxf åodsmjgå
            kdsfxmkåpg
}
