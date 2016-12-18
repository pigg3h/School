;Richard Wright
;CSc 35

;This program takes two characters and adds their ascii values together, then prints the resulting character

.model small
.stack 4096

.data
firstCharacter db "Please input first character: ", 10, 13, '$'

secondCharacter db "Please input second character: ", 10, 13, '$'

result db "Resulting character is: ", 10, 13, '$'

charRes db ?

.code
Main	proc
	mov ax, @data
	mov ds, ax

	mov ah, 9
	lea dx, firstCharacter
	int 21h
	
	mov ah, 01h
	int 21h
	mov dh, al

	mov ah, 9
	lea dx, secondCharacter
	int 21h

	mov ah, 01h
	int 21h
	add dh, al
	mov charRes, dh
	
	mov ah, 9
	lea dx, result
	int 21h

	mov ah, 2
	mov dl, charRes
	int 21h

	mov ax, 4c00h
	int 21h

Main	endp
	end main

;getInput
	