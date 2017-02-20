/* Richard Wright                                  */
/* Lab 5                                           */
/* Figure the area and circumference of a cylinder */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define FILE_IN  "lab5.dat"
//#define FILE_IN  "lab5sample.dat"
#define FILE_OUT "lab5.out"

int main(void)
{
	int count = 1;
	double radius, height, area, vol;
	FILE * input_file = fopen(FILE_IN, "r");
	FILE * output_file = fopen(FILE_OUT, "w");

	if(input_file == NULL)
	{
		printf("\nError on opening the input file \n\n");
		exit(EXIT_FAILURE);
	}	

	if(output_file == NULL)
	{
		printf("\nError on opening the output file \n\n");
		exit(EXIT_FAILURE);
		
	}

	printf("\nRichard Wright. Lab 5.\n\n");	

	while((fscanf(input_file, "%lf%lf", &radius, &height)) == 2)
	{

		area = M_PI * radius * radius;
		vol = area * height;

		fprintf(output_file, "\nCylinder %1d", count);
		fprintf(output_file, "\nThe radius is:    %9.3f", radius);
		fprintf(output_file, "\nThe height is:    %9.3f", height);
		fprintf(output_file, "\nThe top area is:  %9.3f", area);
		fprintf(output_file, "\nThe volume is:    %9.3f\n\n", vol);
			
		count++;

	}
	
	fclose(input_file);
	fclose(output_file);

	return EXIT_SUCCESS;
}
