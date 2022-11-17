import math

gradua = input("Sartu gradu sexagesimalak: ")
gradua = float(gradua)
gradua = math.radians(gradua)

konbertsioa = math.sin(gradua)

print("Celsius graduak = ", round(konbertsioa, 6))