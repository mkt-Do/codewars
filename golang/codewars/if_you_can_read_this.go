package codewars

import "strings"

func ToNato(words string) string {
	nato := []string{"Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliett", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-ray", "Yankee", "Zulu"}
	natoMap := map[string]string{}
	for _, str := range nato {
		natoMap[strings.ToLower(str[:1])] = str
	}
	results := []string{}
	trimWords := strings.ReplaceAll(words, " ", "")
	for _, c := range trimWords {
		wordStr := strings.ToLower(string(c))
		v, ok := natoMap[wordStr]
		if !ok {
			v = wordStr
		}
		results = append(results, v)
	}
	return strings.Join(results, " ")
}
