;Richard Wright
;CSc 35
;Integer to character converter
;Take four numbers, multiplies them by what place they are (1s, 10s, etc), adds them together, prints out character
.model small
.stack 4096

.data
	input db "Please input four numbers:" , 10, 13, '$'

	result db "The resulting character is:" , 10, 13, '$'

	paragraph db " ", 10, 13, '$'

	sum dw ?

.code

Main	proc
	mov ax, @data
	mov ds, ax

	mov ah, 09h		;display input message
	lea dx, input
	int 21h

	mov cx, 4		;loop counter

	alphaLoop:		;start loop
		mov ah, 01h	;get input
		int 21h	
		
		sub al, 48d	

		mov bx, 0
		mov bl, al

		mov ax, 10
		mul si

		add ax, bx
		mov si, ax

		loop alphaLoop

	mov ah, 09h
	lea dx, paragraph
	int 21h

	mov ah, 09h		;print result message
	lea dx, result
	int 21h

	mov ah, 02h
	mov dx, si
	int 21h
				
	mov ax, 4c00h
	int 21h

Main	endp
	end main