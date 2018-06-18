# No need to reinvent the wheel
#from datetime import datetime
# Using datetime will require several workarounds

# return_date = datetime.date(return_date, '%d %m %Y')
# due_date = datetime.strptime(due_date, '%d %m %Y')

return_date = str(input())
due_date = str(input())

RD, RM, RY = return_date.split(" ")
DD, DM, DY = due_date.split(" ")

RD, RM, RY = int(RD), int(RM), int(RY)
DD, DM, DY = int(DD), int(DM), int(DY)

fine =0 

if RY > DY:
    fine = 10000
elif RY == DY:
    if RM > DM:
        fine = 500 * (RM - DM)
    elif(RM == DM and RD > DD):
        fine = 15 * (RD-DD)

print(fine)