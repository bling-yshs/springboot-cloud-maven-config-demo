package com.yshs.user;

import com.yshs.comment.utils.UserUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping("/hi")
    public String getHi() {
        return UserUtils.getHi();
    }

}
