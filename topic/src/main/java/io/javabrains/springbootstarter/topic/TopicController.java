package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/")
    public String  homepage(){
        return "Hello Dunya";
    }
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();

    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic){
    topicService.addTopic(topic);
    }
     @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
    topicService.updateTopic(topic, id);
    }
    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
















//    public HomeController(int year) {
//        this.year = year;
//    }

    //    @GetMapping("/")
//    public String homepage(){
//        return "Homepage ???";
//    }
//    @RequestMapping("home")
//    public String home(HttpServletRequest req, HttpServletResponse res) {
//        HttpSession session = req.getSession();
//        String name = req.getParameter("name");
//        System.out.println("hi" + name);
//        session.setAttribute("name", name);
//        return "home";
//    }


//    @GetMapping("/")
//    public ResponseEntity<String> retrieveHello() {
//
//        return new ResponseEntity<>("My God, this was dry and abstract! ", HttpStatus.OK);
//    }

//    @PostMapping
//    public ResponseEntity<String> saveObject() {
//        return new ResponseEntity<>("object saved", HttpStatus.OK);
//    }
//
//    @GetMapping("/age1")
//    public ResponseEntity<String> showAge() {
//        return new ResponseEntity<>("My God, this part about age does work!", HttpStatus.OK);
//    }
//
//    @GetMapping("/about")
//    public String aboutPage() {
//        return "About this brilliant Java developer:";
//    }
//
//    @GetMapping("/number")
//    ResponseEntity<Integer> number() {
//        return new ResponseEntity<>(3453453, HttpStatus.OK);
//    }
//
//    @GetMapping("/age")
//    ResponseEntity<String> age(
//            @RequestParam("yearOfBirth") int yearOfBirth) {
////        this.yearOfBirth = yearOfBirth;
//        if (isInFuture(yearOfBirth)) {
//            return new ResponseEntity<>(
//                    "Year of birth cannot be in the future",
//                    HttpStatus.BAD_REQUEST);
//        }
//
//        return new ResponseEntity<>(
//
//                "Your age is " + calculateAge(yearOfBirth),
//                HttpStatus.OK);
//    }
//
//    private String calculateAge(int yearOfBirth) {
//        int year = Year.now().getValue();
//        return Integer.toString(year - yearOfBirth);
//    }
//
//    private boolean isInFuture(int yearOfBirth) {
//        int year = Year.now().getValue();
//
//        return yearOfBirth > year;
//
//    }
}

