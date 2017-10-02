package demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="users/{userId}")
public class RecommendationController {

    @RequestMapping(value="/movies",method=RequestMethod.GET)
    public String getMovies() {
        return "Frozen";
    }
}
