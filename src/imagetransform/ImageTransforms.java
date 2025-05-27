package imagetransform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Color;

public class ImageTransforms {
	private static int getRowCount(Color[][] pixelMatrix) {
		return pixelMatrix.length;
	}

	private static int getColCount(Color[][] pixelMatrix) {
		if(pixelMatrix.length>0) {
			return pixelMatrix[0].length;
		} else {
			return 0;
		}
	}

	public static Color[][] copy(Color[][] source) {
		int rowCount = getRowCount(source);
		int colCount = getColCount(source);
		Color[][] destination = new Color[rowCount][colCount];
		// TODO: replace null with a new rowCount X colCount matrix (2D array)
		
		//destination[0][0] = source[0][0];
		//destination[0][1] = source[0][1]; 
		
		for (int i = 0; i < destination.length; i++)
		{
			destination[i] = source[i];
			
			for (int j = 0; j < destination[i].length; j++)
			{
				destination[i][j] = source[i][j];
			}
		}
			// NOTE: do NOT mutate (change) the values of the passed in source

			// TODO:
			// fill destination with values from source
			
		return destination;
	}

	public static Color[][] flipHorizontal(Color[][] source) {
		int rowCount = getRowCount(source);
		int colCount = getColCount(source);
		Color[][] destination = new Color[rowCount][colCount]; 
		// TODO: replace null with a new rowCount X colCount matrix (2D array)
		

			// NOTE: do NOT mutate (change) the values of the passed in source
		//destination[0][0] = source[0][1]; 
		//destination[0][1] = source[0][0]; 
		
		for (int j = 0; j < destination[0].length; j++)
		{
			for (int i = 0; i < destination.length; i++)
			{
			//Color t = destination[i][j];
			destination[i][j] = source[i][colCount - j - 1];
			//destination[destination.length - i - 1][j] = t;
			
			//destination[j][i] = source[i][j];
			//destination[i][j] = source[j][i];
//			destination[0][0] = source[0][1]; 
//			destination[0][1] = source[0][0]; 
			}
		}
		
		

			// TODO:
			// fill destination with values from source
			// but flipped horizontally

			
		return destination;
	}

	public static Color[][] flipVertical(Color[][] source) {
		int rowCount = getRowCount(source);
		int colCount = getColCount(source);
		Color[][] destination = new Color[rowCount][colCount];
		// TODO: replace null with a new rowCount X colCount matrix (2D array)
		
			// NOTE: do NOT mutate (change) the values of the passed in source
		//destination[0][0] = Color.WHITE;
		//destination[1][0] = Color.BLACK;
		
		for (int i = 0; i < destination.length; i++)
		{
			for (int j = 0; j < destination[0].length; j++)
			{
			destination[i][j] = source[rowCount - i - 1][j];
			}
		}

			// TODO:
			// fill destination with values from source
			// but flipped vertically

			
		return destination;
	}

	public static Color[][] mirrorLeftOntoRight(Color[][] source) {
		int rowCount = getRowCount(source);
		int colCount = getColCount(source);
		Color[][] destination = new Color[rowCount][colCount]; 
		// TODO: replace null with a new rowCount X colCount matrix (2D array)
		

			// NOTE: do NOT mutate (change) the values of the passed in source

		for (int i = 0; i < rowCount; i++)
		{
			for (int j = 0; j <= (colCount - 1) / 2; j++) //takes half, goes back one
			{
				destination[i][j] = source[i][j];
				destination[i][colCount - j - 1] = source[i][j];
			}
		}

			// TODO:
			// fill destination with values from source
			// but mirror the left pixels onto the right side

			
		return destination;
	}
	
	public static Color[][] rotateRight(Color[][] source) {
		int srcRowCount = getRowCount(source);
		int srcColCount = getColCount(source);
		int dstRowCount = -1; // TODO: replace -1 to the correct (rotated) value for destination
		int dstColCount = -1; // TODO: replace -1 to the correct (rotated) value for destination
		Color[][] destination = new Color[srcColCount][srcRowCount]; 
		// TODO: replace null with a new dstRowCount X dstColCount matrix (2D array)
	
		
	
			// NOTE: do NOT mutate (change) the values of the passed in source
		//destination[0][0] = Color.BLACK;
		//destination[0][1] = Color.WHITE;
	
		for (int i = 0; i < srcRowCount; i++)
		{
			for (int j = 0; j < srcColCount; j++)
			{
				destination[j][srcRowCount - 1 - i] = source[i][j];//source stays the same, change expected
			}//row 0 in source becomes last column in destination
		}
			// TODO:
			// fill destination with values from source
			// but rotate each pixel to the right
	
			
		return destination;
	}
}
	
