package com.calculator;


       import java.util.ArrayList;
        import java.util.concurrent.atomic.AtomicLong;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    private final AtomicLong counter = new AtomicLong();


@GetMapping ("/calculator")
public Calculator calculator()

{

        int  max = 1000;
        int divisor = 7;
        int limit=0;
        int resultIndex = 0;
                ArrayList<Integer> myArray = new ArrayList<Integer>();
                ArrayList array = new ArrayList();

        for (int i = 1; i < max; i++) {
            if (i % divisor == 0) {
                myArray.add(i);
                limit = myArray.size();
                resultIndex=resultIndex+1;

            }
        }
               for (int n = 1; n < 4; n++) {
                    array.add("I am "+( myArray.get(resultIndex - n)+2));

        }

           return new Calculator (
                 String.format(String.valueOf(array)));
        }

    }