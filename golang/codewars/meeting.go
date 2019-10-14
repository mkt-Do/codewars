package codewars

import "strings"

type Person struct {
	FirstName string
	LastName  string
}

func Meeting(s string) string {
	strs := strings.Split(strings.ToUpper(s), ";")
	persons := []Person{}
	for _, str := range strs {
		names := strings.Split(str, ":")
		p := Person{}
		p.LastName = names[1]
		p.FirstName = names[0]
		persons = append(persons, p)
	}
	persons = sort(persons)
	res := []string{}
	for _, person := range persons {
		res = append(res, "("+person.LastName+", "+person.FirstName+")")
	}
	return strings.Join(res, "")
}

func sort(persons []Person) []Person {
	for i := 0; i < len(persons); i++ {
		for j := i + 1; j < len(persons); j++ {
			if persons[i].LastName == persons[j].LastName {
				if persons[i].FirstName >= persons[j].FirstName {
					tmp := persons[j]
					persons[j] = persons[i]
					persons[i] = tmp
				}
			} else if persons[i].LastName > persons[j].LastName {
				tmp := persons[j]
				persons[j] = persons[i]
				persons[i] = tmp
			}
		}
	}
	return persons
}
