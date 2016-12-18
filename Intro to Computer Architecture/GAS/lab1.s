#Lab 1
#Richard Wright
#Sept 22 2016

.data

Hello:
   .ascii "Hello!\n"

Melon:
   .ascii "I AM MELON LORD!\n"

Spock:
   .ascii "Live long and prosper.\n"

.text
.global _start

_start:
   mov $4, %eax		#4 = write
   mov $1, %ebx		#1 = screen
   mov $Hello, %ecx
   mov $7, %edx
   int $0x80            #interrupt OS

   mov $4, %eax
   mov $1, %ebx
   mov $Melon, %ecx	
   mov $17, %edx
   int $0x80

   mov $4, %eax
   mov $1, %ebx
   mov $Spock, %ecx
   mov $23, %edx
   int $0x80

   mov $1, %eax		#1 = kill
   int $0x80
