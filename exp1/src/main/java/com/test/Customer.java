package com.test;

import java.util.List;

public record Customer(String name,String Country,List<String>orders,Address adr)

{

}
