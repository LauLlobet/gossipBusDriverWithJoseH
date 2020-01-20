package gossipingbussdriver;

public class GossipBusDriverKata {
  private final int[][] routes;

  public GossipBusDriverKata(int[][] routes) {
    this.routes = routes;
  }

  public GossipBusDriverKata() {
    this(new int[][]{{},{}});
  }

  public String run() {
    if(routes[0][0] == routes [1][0])
      return "1";
    else
      return "2";
  }
}
