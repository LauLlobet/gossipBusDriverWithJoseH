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
    int gossips = routes.length;
    int time = 0;
    while (time < 480 && gossips < routes.length * routes.length) {
      if (getStopForRouteAtTime(time, 0) == getStopForRouteAtTime(time, 1)) {
        gossips += 2;
      }
      time++;
    }
    return String.valueOf(time);
  }

  private int getStopForRouteAtTime(int time, int i) {
    if(finnishLine(time, routes[i]))
      time = nextStop(time, routes[i]);
    return routes[i][time];
  }

  private int nextStop(int time, int[] route) {
    return time - route.length;
  }

  private boolean finnishLine(int time, int[] route) {
    return time > route.length;
  }
}
