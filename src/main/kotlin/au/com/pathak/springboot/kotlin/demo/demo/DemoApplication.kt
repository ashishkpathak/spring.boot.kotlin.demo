package au.com.pathak.springboot.kotlin.demo.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication


fun print(number: Integer) {
    print("Hello")
}
fun main(args: Array<String>) {
//    runApplication<DemoApplication>(*args)
    SpringApplication.run(DemoApplication::class.java,*args);

}
