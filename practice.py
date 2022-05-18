# def AreaofRectangle(width,heigth):
#     Area=width*height
#     print("Area of the rectangle is  %.2f"%Area)
# def AreaofSquare(side):
#     Area2=side*side
#     print("Area of square: %.2f"%Area2)
# width=float(input ("enter the width of the rectangle"))
# height=float(input("enter the height of the rectangle"))
# AreaofRectangle(width,height)
# side=float(input("enter the side of the square"))
# AreaofSquare(side)

# def maximum(Str,length):
#     max=0
#     count=0
#     for i in range (0,length):
#         for j in range(i+1,length):
#             if(Str[i]==Str[j] and Str[i]!=" "):
#                 count=count+1
#         if(max<count):
#             maxChar=Str[i]
#             max=count
#         elif max ==0:
#             print("no max char")
#     print("the maximum occuring char is: "+maxChar)
#     return max
# def minimum(max,Str,length):
#     fact=0
#     for i in range(0,length):
#         for j in range(i+1,length):
#             if max==0:
#                 print("all char are minimum")
#                 break
#             elif Str[i]==Str[j] and Str[i]!=" ":
#                 fact=fact+1
#         if(max<fact):
#             minChar=Str[i]
#             max=fact
#     print("minimum char is: "+minChar)
# Str = "hi yash"
# length=0
# for c in Str:
#     length=length+1
# max=maximum(Str,length)
# minimum(max,Str,length)



# disk = {'top-l':'','top-m':'','top-r':'','mid-l':'','mid-m':'','mid-r':'','bottom-l':'','bottom-m':'','bottom-r':''}
# def place(disk):
#     print(disk['top-l']+"| "+disk['top-m']+"| "+disk['top-r'])
#     print("-+-+-")
#     print(disk['mid-l']+"| "+disk['mid-m']+"| "+disk['mid-r'])
#     print("-+-+-")
#     print(disk['bottom-l']+"| "+disk['bottom-m']+"| "+disk['bottom-r'])
#     print("-+-+-")
# turn='x'
# for i in range(9):
#     print('turn for '+turn+" move on which space")
#     move =input()
#     disk[move]=turn
#     if turn =='x':
#         turn = "0"
#     else:
#         turn = "x"
#     place(disk)
# if((disk['top-l'] and disk['top-m'] and disk['top-l']) == 'x' ):
#         print("x is winner")


print("yash")


