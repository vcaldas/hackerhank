if __name__ == '__main__':
    grades = {}
    for _ in range(int(input())):
        name = input()
        score = float(input())
        grades[name] = score
    
    # Sort students by grade
  #  grades = sorted(grades.items(), key=lambda x: x[1])
    lowest_grade = sorted(set(grades.values()))[1]
    
    students = []
    for name, grade in grades.items():

        if grade == lowest_grade:
            students.append(name)

    
    students = sorted(students)
    for s in students: print(s)