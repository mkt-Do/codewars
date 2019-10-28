package codewars

import (
	"sort"
	"strings"
)

func Mix(s1, s2 string) string {
	m1 := ConvertMap(s1)
	m2 := ConvertMap(s2)

	DeleteEntry(m1)
	DeleteEntry(m2)

	s := ""
	for _, r1 := range s1 {
		if r1 >= 'a' && r1 <= 'z' && !ContainsRune(r1, s) {
			s += string(r1)
		}
	}
	for _, r2 := range s2 {
		if r2 >= 'a' && r2 <= 'z' && !ContainsRune(r2, s) {
			s += string(r2)
		}
	}

	res := []string{}
	for _, r := range s {
		if v1, ok1 := m1[r]; ok1 {
			if v2, ok2 := m2[r]; ok2 {
				if v1 > v2 {
					res = append(res, "1:"+strings.Repeat(string(r), v1))
				} else if v1 < v2 {
					res = append(res, "2:"+strings.Repeat(string(r), v2))
				} else {
					res = append(res, "=:"+strings.Repeat(string(r), v1))
				}
			} else {
				res = append(res, "1:"+strings.Repeat(string(r), v1))
			}
		} else {
			if v2, ok2 := m2[r]; ok2 {
				res = append(res, "2:"+strings.Repeat(string(r), v2))
			}
		}
	}
	sort.SliceStable(res, func(i, j int) bool {
		s1 := res[i]
		s2 := res[j]
		if len(s1) == len(s2) {
			if s1[0] == s2[0] {
				return s1[2] < s2[2]
			} else {
				return s1[0] < s2[0]
			}
		} else {
			return len(s1) > len(s2)
		}
	})
	return strings.Join(res, "/")
}

func ConvertMap(s string) map[rune]int {
	m := map[rune]int{}
	for _, r := range s {
		if r >= 'a' && r <= 'z' {
			if v, ok := m[r]; ok {
				m[r] = v + 1
			} else {
				m[r] = 1
			}
		}
	}
	return m
}

func DeleteEntry(m map[rune]int) {
	for k, v := range m {
		if v == 1 {
			delete(m, k)
		}
	}
}

func ContainsRune(r rune, str string) bool {
	for _, elm := range str {
		if r == elm {
			return true
		}
	}
	return false
}
