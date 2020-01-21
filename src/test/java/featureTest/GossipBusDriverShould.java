package featureTest;

import gossipingbussdriver.GossipBusDriverKata;
import java.lang.reflect.Array;
import org.junit.*;
import org.hamcrest.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class GossipBusDriverShould {

  private GossipBusDriverKata kata;

  @Before
  public void prepare(){
    kata = new GossipBusDriverKata();
  }

  @Test
  public void itShouldReturnAtLeastAString() {


    String result = kata.run();

    assertThat(result,instanceOf(String.class));
  }

  @Test
  public void itShouldReturnOneIfOnlyOneBusDriverRoute() {

    String result = kata.run();

    assertThat(result,is("1"));
  }
  
  @Test
  public void itShouldReturnOneIfTwoBusDriversStartingAtTheSameStop() {

    int[][] routes = new int[][]{{1},{1}};

    kata = new GossipBusDriverKata(routes);

    String result = kata.run();

    assertThat(result,is("1"));
  }

  @Test
  public void itShouldReturnOneIfTwoBusDriversStartingAtTheSecondStop() {

    int[][] routes = new int[][]{{1},{6,1}};

    GossipBusDriverKata kata = new GossipBusDriverKata(routes);

    String result = kata.run();

    assertThat(result,is("2"));
  }
}
