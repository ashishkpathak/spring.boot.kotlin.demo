package au.com.pathak.springboot.kotlin.demo.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class CustomerController {

    @GetMapping("/customer/{name}")
    fun getCustomer(@PathVariable("name") name: String): String {


        return String.format("Hello %s!!%n", name);
    }
}