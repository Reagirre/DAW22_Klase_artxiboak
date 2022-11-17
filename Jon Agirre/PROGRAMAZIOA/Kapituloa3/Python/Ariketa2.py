print("Tenperaturak\n\n1.Celsius -> Fahrenheit\n\n2.Fahrenheit -> Celsius\n\n")

aukera = input("Aukeratu bihurketa: ")
aukera = int(aukera)

if aukera == 1:
    gradua = input("Sartu Celsius graduak: ")
    gradua = float(gradua)
    bihurketa = (9/5*gradua) + 32
    print(f"Celsius graduak = {bihurketa}")

if aukera == 2:
    gradua = input("Sartu Fahrenheit graduak: ")
    gradua = float(gradua)
    bihurketa = 5/9*(gradua - 32)
    print(f"Fahrenheit graduak = {bihurketa}")