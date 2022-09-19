public record Point(int x, int y) {

  public double distance(Point orthoPoint) {
    return Math.sqrt(((orthoPoint.x - 0) * (orthoPoint.x - 0)) + ((orthoPoint.y - 0) * (orthoPoint.y - 0)));
  }
}

