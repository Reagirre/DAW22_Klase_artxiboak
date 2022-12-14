zenbakia1 = input("Sartu 1.zenbakia:")
zenbakia2 = input("Sartu 2.zenbakia:")
zenbakia3 = input("Sartu 3.zenbakia:")
zenbakia1 = int(zenbakia1)
zenbakia2 = int(zenbakia2)
zenbakia3 = int(zenbakia3)

if(zenbakia3 < zenbakia1):
    print("Zenbakia ez dago tartean\n")
if(zenbakia3 > zenbakia2):
    print("Zenbakia ez dago tartean\n")
if(zenbakia3 >= zenbakia1):
    if(zenbakia3 <= zenbakia2):
        print("Zenbakia tartean dago\n")