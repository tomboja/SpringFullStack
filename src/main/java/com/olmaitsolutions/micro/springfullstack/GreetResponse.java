package com.olmaitsolutions.micro.springfullstack;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: SpringFullStack
 * @Author: Temesgen D.
 * @Date: 6/11/23
 */

public record GreetResponse(String greet, Integer id, List<String> languages, Person person, double salary) {

}
