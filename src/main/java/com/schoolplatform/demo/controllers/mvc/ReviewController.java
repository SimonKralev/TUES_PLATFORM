package com.schoolplatform.demo.controllers.mvc;
import com.schoolplatform.demo.entities.Review;
import com.schoolplatform.demo.repository.ReviewRepository;
import com.schoolplatform.demo.services.CourseService;
import com.schoolplatform.demo.services.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;
import java.sql.Timestamp;
import java.util.Date;

@Controller
@RequiredArgsConstructor
public class ReviewController {
    /*

    @GetMapping("/courses/{course_id}")
    public Iterable<Review> getReviewsForCourse(@PathVariable String course_id) {
        return reviewRepository.findReviewsByCourseId(Long.valueOf(course_id));
    }

    @GetMapping("/courses/{course_id}")
    public ModelAndView displayAllReviews(@PathVariable String course_id) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            Iterable<Review> allReviewsForCurrentCourse = reviewRepository.findReviewsByCourseId(Long.valueOf(course_id));
            modelAndView.setViewName("course");
            modelAndView.addObject("allReviewsForCurrentCourse", allReviewsForCurrentCourse);
        } catch (Exception e) {
            e.printStackTrace();
            //modelAndView.setViewName("error");
        }
        return modelAndView;
    }
     */
}
