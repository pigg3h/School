/*                 */
/* Richard Wright  */
/* Section 1       */
/* Lab 4           */
/* Date: 02/28/17  */
/*                 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define PI 3.14159

int main(void)
{

	printf("\n\nRichard Wright. Lab 4.\n\n");

	double numOne, numTwo;
	char n = 'N';
	char sqrStr[7] = "Squared";
	char rootStr[12] = "Square Root";
	char sinStr[5] = "Sine";

	printf("Enter start number: ");
	scanf("%lf", &numOne);
	printf("\n");

	printf("Enter end number: ");
	scanf("%lf", &numTwo);
	printf("\n");

	printf("  %c     %s    %s       %s\n", n, sqrStr, rootStr, sinStr);	
	printf("-----  ---------  -------------    --------\n");

	//loop through each number, do operations, print formatted, then print new line
	int i;
	for(i = numOne; i <= numTwo; i++)
	{
		double num = i;
		double rad = PI / 180;
		double sqr, root, sine;
		
		sqr = num * num;
		root = sqrt(num);
		sine = sin(num * rad);		

		printf("%3.0f     %6.0f       %6.3f         %06.3lf\n", num, sqr, root, sine);
	}
	
	printf("\n");

}
