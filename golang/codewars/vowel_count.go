package codewars

func GetCount(str string) (count int) {
	m := map[rune]int{'a': 1, 'e': 1, 'i': 1, 'o': 1, 'u': 1}
	for _, c := range str {
		if _, ok := m[c]; ok {
			count++
		}
	}
	return count
}
