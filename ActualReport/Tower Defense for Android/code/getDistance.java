public static double getDistance(Coordinate c1, Coordinate c2) {
    double tx = c1.getX();
    double ty = c1.getY();
    double mx = c2.getX();
    double my = c2.getY();
    return Math.sqrt((tx - mx)*(tx - mx) + (ty - my)*(ty - my));
}