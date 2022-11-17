import math

erradioa = input("Sartu esferaren erradioa: ")

erradioa = float(erradioa)

azalera = (erradioa * erradioa * math.pi * 4)
bolumena = (erradioa * erradioa * erradioa * math.pi * 4) / 3

print("Azalera = ", round(azalera, 6))
print("bolumena = ", round(bolumena, 6))
