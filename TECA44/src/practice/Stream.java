package practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class Stream 
{
  public static void main(String[] args) 
  {
	ArrayList nums= new ArrayList();
	Stream s1=(Stream) ((Collection<Integer>) nums).stream();
	java.util.stream.Stream<Integer> s2 =((java.util.stream.Stream<Integer>) s1).filter(n ->n%2==0);
	java.util.stream.Stream<Object> s3=s2.map(n ->n*2);
	s3.forEach(n ->System.out.println(n));
  }
}
