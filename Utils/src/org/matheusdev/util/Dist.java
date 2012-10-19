package org.matheusdev.util;

/**
 * @author matheusdev
 *
 */
public final class Dist {

	private Dist() {
	}

	public static double lin(double x0, double y0, double x1, double y1) {
		return Math.abs(x0 - x1) + Math.abs(y0 - y1);
	}

	public static double root(double x0, double y0, double x1, double y1) {
		double dx = Math.abs(x0-x1);
		double dy = Math.abs(y0-y1);
		return Math.sqrt(dx*dx + dy*dy);
	}

}
