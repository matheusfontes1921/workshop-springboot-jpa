package resources;

import entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    /*responseentity é um tipo específico do spring
    para retornar requisições web
     */
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1921L, "Matheus", "matheus@gmail.com", "31998604412", "1921");
        return ResponseEntity.ok().body(u);
    }
}
