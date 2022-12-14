a = input("Sartu 1. zenbakia: ")
b = input("Sartu 2. zenbakia: ")
c = input("Sartu 3. zenbakia: ")

if(a < b and c < b):
    if(a > c):
        print(f"Zenbaki handiena {b} da")
        print(f"Zenbaki txikiena {c} da")
    else:
        print(f"Zenbaki handiena {b} da")
        print(f"Zenbaki txikiena {a} da")
else:
    if(a > c):
        print(f"Zenbaki handiena {a} da")
        if(b > c):
            print(f"Zenbaki txikiena {c} da")
        else:
            print(f"Zenbaki txikiena {b} da")
    else:
        print(f"Zenbaki handiena {c} da")
        if(b > a):
            print(f"Zenbaki txikiena {a} da")
        else:
            print(f"Zenbaki txikiena {b} da")