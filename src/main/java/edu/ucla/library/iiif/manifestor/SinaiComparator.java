package edu.ucla.library.iiif.manifestor;

import java.util.Comparator;

/**
 * Comparator that sorts by file name except when one of the file names ends
 * with _color.tiff, then that's given preference.
 *
 * @author Kevin S. Clarke
 *         <a href="mailto:ksclarke@ksclarke.io">ksclarke@ksclarke.io</a>
 */
public class SinaiComparator implements Comparator<String[]> {

	public int compare(final String[] a1stSource, final String[] a2ndSource) {
        //LOGGER.info("***Comparator: {} {}", a1stSource[1], a2ndSource[1]);
		final String[] splits1 = a1stSource[1].split("/");
		final String[] splits2 = a2ndSource[1].split("/");
		final String fileName1 = splits1[splits1.length - 1];
		final String fileName2 = splits2[splits2.length - 1];
		final String colorTIFF = "_color.tif";
        final int comparisonResult;

		String dirName1 = splits1[splits1.length - 2];
		String dirName2 = splits2[splits2.length - 2];

		// check if this tif CSV uses the 'default_includes' scheme
        //LOGGER.info("{} {}", dirName1, dirName2);
		if (dirName1.equals("default_includes")) {
			dirName1 = splits1[splits1.length - 3];
		}
		if (dirName2.equals("default_includes")) {
			dirName2 = splits2[splits2.length - 3];
		}

		if (dirName1.equals(dirName2)) {
			if (fileName1.endsWith(colorTIFF)) {
                //LOGGER.info("***            {} before {}", a1stSource[1], a2ndSource[1]);
				return -1;
			} else if (fileName2.endsWith(colorTIFF)) {
                //LOGGER.info("***            {} after {}", a1stSource[1], a2ndSource[1]);
				return 1;
			} else {
				comparisonResult = fileName1.compareToIgnoreCase(fileName2);
                //LOGGER.info("***            {}" + (comparisonResult < 0 ? " before " : (comparisonResult == 0 ? " same " : " after ")) + "{}", fileName1, fileName2);
                return comparisonResult;
			}
		} else {
	        comparisonResult = dirName1.compareToIgnoreCase(dirName2);
            //LOGGER.info("***Comparator: {} {}", a1stSource[1], a2ndSource[1]);
            //LOGGER.info("***            {}" + (comparisonResult < 0 ? " before " : (comparisonResult == 0 ? " same " : " after ")) + "{}", a1stSource[1], a2ndSource[1]);
			return comparisonResult;
		}
	}
}