import math

a = input("Sartu ekuazio koadratikoaren a koefizientea: ")
b = input("Sartu ekuazio koadratikoaren b koefizientea: ")
c = input("Sartu ekuazio koadratikoaren c koefizientea: ")
a = float(a)
b = float(b)
c = float(c)

egiaztapena = (b*b)-(4*a*c)/(2*a)

if(egiaztapena < 0):
    print("Ekuazioak ez du erro errealik")
else:
    x1 = ((-b)+(math.sqrt((b*b)-(4*a*c))))/(2*a)
    x2 = ((-b)-(math.sqrt((b*b)-(4*a*c))))/(2*a)
    print(f"x1 = {x1}")
    print(f"x2 = {x2}")