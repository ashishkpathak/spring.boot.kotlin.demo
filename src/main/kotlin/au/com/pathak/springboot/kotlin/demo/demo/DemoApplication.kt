package au.com.pathak.springboot.kotlin.demo.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
//@Controller
class DemoApplication


fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args);

}
