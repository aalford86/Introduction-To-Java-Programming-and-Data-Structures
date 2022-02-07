package chapter_04;

/**
 * Exercise *4.6
 *
 * (Random Points On A Circle) Write a program that generates three random
 * points on a circle centered at (0, 0) with radius 40 and displays three
 * angles in a triangle formed by these three points, as shown in Figure 4.4a.
 * (Hint: Generate a random angle a in radians between 0 and 2π, as shown in
 * Figure 4.4b and the point determined by this angle is (r^x cos (a), r^x sin
 * (a)).)
 *
 * <pre>
 *
 * (a) A triangle is formed from three random points on the circle.
 *
 * (b) A random point on the circle can be generated using a random angle (a = alpha).
 *
 * (c) A pentagon is centered at (0, 0) with one point at the 0 o’clock position.
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_06 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.6 - Random Points On A Circle\n");

		/*
		 * Set radius of the circle.
		 */
		final double RADIUS = 40.0;

		/*
		 * Declare and initialize variable to hold randomly generated angle.
		 */
		double randomAngle = 0.0;

		/*
		 * Generate random angle for point 1.
		 */
		randomAngle = Math.random() * 2 * Math.PI;
		double pointAx = RADIUS * Math.cos(randomAngle);
		double pointAy = RADIUS * Math.sin(randomAngle);

		/*
		 * Generate random angle for point 2.
		 */
		randomAngle = Math.random() * 2 * Math.PI;
		double pointBx = RADIUS * Math.cos(randomAngle);
		double pointBy = RADIUS * Math.sin(randomAngle);

		/*
		 * Generate random angle for point 3.
		 */
		randomAngle = Math.random() * 2 * Math.PI;
		double pointCx = RADIUS * Math.cos(randomAngle);
		double pointCy = RADIUS * Math.sin(randomAngle);

		/*
		 * Calculate the distance between each pair of points.
		 */
		double distanceAB = Math.sqrt(Math.pow(pointBx - pointAx, 2) + Math.pow(pointBy - pointAy, 2));
		double distanceBC = Math.sqrt(Math.pow(pointCx - pointBx, 2) + Math.pow(pointCy - pointBy, 2));
		double distanceCA = Math.sqrt(Math.pow(pointCx - pointAx, 2) + Math.pow(pointCy - pointAy, 2));

		/*
		 * Calculate the angle for each point.
		 */
		double angleA = Math
				.toDegrees(Math.acos((Math.pow(distanceCA, 2) + Math.pow(distanceAB, 2) - Math.pow(distanceBC, 2))
						/ (2 * distanceCA * distanceAB)));

		double angleB = Math
				.toDegrees(Math.acos((Math.pow(distanceAB, 2) + Math.pow(distanceBC, 2) - Math.pow(distanceCA, 2))
						/ (2 * distanceAB * distanceBC)));

		double angleC = Math
				.toDegrees(Math.acos((Math.pow(distanceBC, 2) + Math.pow(distanceCA, 2) - Math.pow(distanceAB, 2))
						/ (2 * distanceBC * distanceCA)));

		/*
		 * Display results to console.
		 */
		System.out.printf("%nPoint A: (%,.2f , %,.2f) = %,.2f", pointAx, pointAy, angleA);
		System.out.printf("%nPoint B: (%,.2f , %,.2f) = %,.2f", pointBx, pointBy, angleB);
		System.out.printf("%nPoint C: (%,.2f , %,.2f) = %,.2f", pointCx, pointCy, angleC);

	}

}
