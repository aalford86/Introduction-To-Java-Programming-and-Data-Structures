package chapter_04;

/**
 * Exercise *4.3
 *
 * (Geography: Estimate Areas) Use the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the
 * figure in Section 4.1 to compute the estimated area enclosed by these four
 * cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the
 * distance between two cities. Divide the polygon into two triangles and use
 * the formula in Programming Exercise 2.19 to compute the area of a triangle.)
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_03 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.3 - Geography: Estimate Areas\n");

		/*
		 * Set the latitude and longitude for Atlanta, Georgia; Orlando, Florida;
		 * Savannah, Georgia; and Charlotte, North Carolina.
		 */
		final double ATLANTA_X = 33.7489954;
		final double ATLANTA_Y = -84.3879824;
		final double ORLANDO_X = 28.5383355;
		final double ORLANDO_Y = -81.37922365;
		final double SAVANNAH_X = 32.0835407;
		final double SAVANNAH_Y = -81.0998342;
		final double CHARLOTTE_X = 35.2270869;
		final double CHARLOTTE_Y = -80.8431267;

		/*
		 * Radius of the earth in km.
		 */
		final double RADIUS = 6371.01;

		/*
		 * Compute distance from Atlanta, Georgia to Orlando, Florida.
		 */
		double atlantaToOrlando = RADIUS * Math.acos(Math.sin(ATLANTA_X) * Math.sin(ORLANDO_X)
				+ Math.cos(ATLANTA_X) * Math.cos(ORLANDO_X) * Math.cos(ATLANTA_Y - ORLANDO_Y));

		/*
		 * Compute distance from Orlando, Florida to Savannah, Georgia.
		 */
		double orlandoToSavannah = RADIUS * Math.acos(Math.sin(ORLANDO_X) * Math.sin(SAVANNAH_X)
				+ Math.cos(ORLANDO_X) * Math.cos(SAVANNAH_X) * Math.cos(ORLANDO_Y - SAVANNAH_Y));

		/*
		 * Compute distance from Savannah, Georgia to Charlotte, North Carolina.
		 */
		double savannahToCharlotte = RADIUS * Math.acos(Math.sin(SAVANNAH_X) * Math.sin(CHARLOTTE_X)
				+ Math.cos(SAVANNAH_X) * Math.cos(CHARLOTTE_X) * Math.cos(SAVANNAH_Y - CHARLOTTE_Y));

		/*
		 * Compute distance from Charlotte, North Carolina to Atlanta, Georgia.
		 */
		double charlotteToAtlanta = RADIUS * Math.acos(Math.sin(CHARLOTTE_X) * Math.sin(ATLANTA_X)
				+ Math.cos(CHARLOTTE_X) * Math.cos(ATLANTA_X) * Math.cos(CHARLOTTE_Y - ATLANTA_Y));

		/*
		 * Compute distance from Atlanta, Georgia to Savannah, Georgia.
		 */
		double atlantaToSavannah = RADIUS * Math.acos(Math.sin(ATLANTA_X) * Math.sin(SAVANNAH_X)
				+ Math.cos(ATLANTA_X) * Math.cos(SAVANNAH_X) * Math.cos(ATLANTA_Y - SAVANNAH_Y));
		;

		/*
		 * Split the polygon into two triangles.
		 *
		 * Formula for area of a triangle:
		 *
		 * area = sqrt(s (s - side1)(s - side2)(s - side3))
		 *
		 * s = (side1 + side2 + side3) / 2
		 *
		 */
		double s = 0.0;

		/*
		 * Compute the area for triangle 1.
		 */
		s = (atlantaToOrlando + orlandoToSavannah + atlantaToSavannah) / 2;
		double areaForTriangle1 = Math
				.sqrt(s * (s - atlantaToOrlando) * (s - orlandoToSavannah) * (s - atlantaToSavannah));

		/*
		 * Compute the area for triangle 2.
		 */
		s = (atlantaToSavannah + savannahToCharlotte + charlotteToAtlanta) / 2;
		double areaForTriangle2 = Math
				.sqrt(s * (s - atlantaToSavannah) * (s - savannahToCharlotte) * (s - charlotteToAtlanta));

		/*
		 * Compute area of polygon by summing the area of the triangles.
		 */
		double areaOfPolygon = areaForTriangle1 + areaForTriangle2;

		/*
		 * Display result to console.
		 */
		System.out.printf(
				"The estimated area enclosed by Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina is %,.2f km^2.",
				areaOfPolygon);
	}

}
