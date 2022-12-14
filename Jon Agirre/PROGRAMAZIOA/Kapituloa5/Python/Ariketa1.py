zenbakia1 = input("Sartu 1.zenbakia: ")
zenbakia2 = input("Sartu 2.zenbakia: ")

zenbakia1 = float(zenbakia1)
zenbakia2 = float(zenbakia2)

print("Eragiketak\n1.Batuketa\n2.Kenketa\n3.Biderketa\n4.Zatiketa\n5.Modulua")

aukera = input("Aukeratu eragiketa: ")
aukera = int(aukera)



if aukera == 1:
    batuketa = zenbakia1 + zenbakia2
    print(f"{zenbakia1} + {zenbakia2} = {batuketa}")

if aukera == 2:
    kenketa = zenbakia1 - zenbakia2
    print(f"{zenbakia1} - {zenbakia2} = {kenketa}")

if aukera == 3:
    biderketa = zenbakia1 * zenbakia2
    print(f"{zenbakia1} * {zenbakia2} = {biderketa}")

if aukera == 4:
    zatiketa = zenbakia1 / zenbakia2
    print(f"{zenbakia1} / {zenbakia2} = {zatiketa}")
    
if aukera == 5:
    modulua = zenbakia1 % zenbakia2
    print(f"{zenbakia1} % {zenbakia2} = {modulua}")
