import math

gradua = input("Sartu gradu sexagesimalak: ")
gradua = float(gradua)

konbertsioa = gradua * math.pi / 180

print("Celsius graduak = ", round(konbertsioa, 6))