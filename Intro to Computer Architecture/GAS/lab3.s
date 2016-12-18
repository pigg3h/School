#Lab 3
#Vending Machine change calculator
#Richard Wright
#October 6 2016

.data
change:                      #money spent input string
   .ascii "Enter change due in pennies:\n\0"

quarters:
   .ascii " quarters\n\0"

dimes:
   .ascii " dimes\n\0"

nickels:
   .ascii " nickels\n\0"

pennys:
   .ascii " pennies\n\0"

.text
.global _start

_start:
   mov $change, %eax
   call PrintStringC
   call ScanInt
   
   mov $25, %ebx                #move 25 (value of quarter) to ebx
   div %ebx                     #divide eax by ebx, store quotient in eax, remainder in edx
   call PrintInt                #print quotient (number of quarters)
   mov $quarters, %eax          #move quarters to eax
   call PrintStringC            #print quarters

   mov $10, %ebx                
   mov %edx, %eax               #move edx (remainder) to eax
   mov $0, %edx                 #clear edx
   div %ebx                     
   call PrintInt                #print quotient (number of dimes)
   mov %eax, %ebx   
   mov $dimes, %eax
   call PrintStringC

   mov $5, %ebx
   mov %edx, %eax              #same as above
   mov $0, %edx              
   div %ebx
   call PrintInt
   mov %eax, %ebx
   mov $nickels, %eax
   call PrintStringC

   mov %edx, %eax             
   call PrintInt               #print remainder (number of pennies)
   mov $pennys, %eax          
   call PrintStringC

   call EndProgram
