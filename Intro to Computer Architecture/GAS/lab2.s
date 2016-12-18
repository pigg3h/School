#Lab 2
#Calorie counter
#Richard Wright
#Sept 29 2016

.data
cookie:                         #cookie input string
   .ascii "Enter amount of cookies eaten:\n\0"

cCalories:                      #calorie input string
   .ascii "Enter amount of calories per cookie:\n\0"

fin:                            #ending statement
   .ascii " estimated calories consumed\n\0"

.text
.global _start

_start:
   mov $cookie, %eax
   call PrintStringC

   call ScanInt                 #eax gets value
   mov  %eax, %ebx              #backup value to ebx

   mov $cCalories, %eax
   call PrintStringC

   call ScanInt
   imul %ebx, %eax              #multiply ebx (calories) by eax (cookies) and store in eax
   call PrintInt                #print eax

   mov $fin, %eax
   call PrintStringC

   call EndProgram
