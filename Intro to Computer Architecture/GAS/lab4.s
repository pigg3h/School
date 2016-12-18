#Lab 4
#Richard Wright
#October 13  2016

.data

age:
   .ascii "How old are you (in years)?\n\0"

days:
   .ascii " days old (approx).\n\0" 

point:
   .ascii ".\0"

.text
.global _start

_start:

   mov $age, %eax
   call PrintStringC
   call ScanInt

   imul $365, %eax    #multiply age by days in a year
   mov %eax, %ecx     #store in ecx

   imul $25, %eax     #multiply age in days by .25x100 to account for leap years
   mov $365, %ebx     #divide by 365
   div %ebx
   mov $100, %ebx     #divide by 100
   div %ebx
   add %eax, %ecx     #add to result of age x 365 (total days = age x 365.25)
   
   mov %ecx, %eax
   call PrintInt
   mov $point, %eax
   call PrintStringC
   mov %edx, %eax
   call PrintInt

   mov $days, %eax
   call PrintStringC

   call EndProgram
