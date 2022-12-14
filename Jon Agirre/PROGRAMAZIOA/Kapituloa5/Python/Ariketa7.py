a = input("Sartu 1. zenbakia: ")
b = input("Sartu 2. zenbakia: ")
c = input("Sartu 3. zenbakia: ")

if(a < b and c < b):
    print(f"Zenbaki handiena {b} da")
elif(a > c):
    print(f"Zenbaki handiena {a} da")
else:
    print(f"Zenbaki handiena {c} da")