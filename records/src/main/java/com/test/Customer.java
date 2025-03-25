package com.test;

import java.util.List;

public record Customer(String name,String country,List<String> ordres,Address adr)

{

}
