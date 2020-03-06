package kr.co.loosie.foody.interfaces;

import kr.co.loosie.foody.application.RestaurantService;
import kr.co.loosie.foody.domain.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@CrossOrigin
@RestController
public class RestaurantController {



    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> list(){

        List<Restaurant> restaurants = restaurantService.getRestaurants();

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){

           Restaurant restaurant = restaurantService.getRestaurant(id);
//      기본 메뉴 + 메뉴 정보
         return restaurant;
    }



}
