import math

a = input("Sartu ekuazio koadratikoaren a koefizientea: ")
b = input("Sartu ekuazio koadratikoaren b koefizientea: ")
c = input("Sartu ekuazio koadratikoaren c koefizientea: ")

a = float (a)
b = float (b) 
c = float (c)

x1 = ((-b)+(math.sqrt((b*b)-(4*a*c))))/(2*a)
x2 = ((-b)-(math.sqrt((b*b)-(4*a*c))))/(2*a)

print("x1 = %.6f" %(x1))
print("x2 = %.6f" %(x2))