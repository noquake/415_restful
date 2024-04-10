package com.kwaku.restful.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FibonacciController {

    @RequestMapping(value = "/fib", method = RequestMethod.GET)
    public List<Long> generateFibonacci(@RequestParam("length") int length) {
        List<Long> fibonacciSequence = new ArrayList<>();

        long prev = 0;
        long curr = 1;
        fibonacciSequence.add(prev);
        if (length > 1) {
            fibonacciSequence.add(curr);
        }

        for (int i = 2; i < length; i++) {
            long next = prev + curr;
            fibonacciSequence.add(next);
            prev = curr;
            curr = next;
        }

        return fibonacciSequence;
    }
}
