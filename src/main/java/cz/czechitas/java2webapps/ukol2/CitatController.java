package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class CitatController {
    private final Random random;

    public CitatController() {

        random = new Random();
    }

    @GetMapping("/")
    public ModelAndView vyberCitat() {
        ModelAndView result = new ModelAndView("citatySObrazkem");
        List<String> citaty = Arrays.asList("Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.", "A user interface is like a joke. If you have to explain it, it's not that good.", "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.", "I have a joke on programming but it only works on my computer", "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…", "When I wrote this code, only God & I understood what it did. Now… Only God knows.", "Programmer (noun.): A machine that turns coffee into code.", "Real programmers count from 0.");
        int cisloCitatu = random.nextInt(citaty.size());
        String nahodnyCitat = citaty.get(cisloCitatu);

        int nahodnyObrazek = random.nextInt(8) + 1;

        result.addObject("citat", nahodnyCitat);
        result.addObject("obrazek", nahodnyObrazek);
        return result;
    }
}
