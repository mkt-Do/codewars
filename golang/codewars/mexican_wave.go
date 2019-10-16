package codewars

import "strings"

func wave(words string) []string {
	res := []string{}
	for i := 0; i < len(words); i++ {
		if words[i] >= 97 && words[i] <= 122 {
			res = append(res, words[:i]+strings.ToUpper(string(words[i:i+1]))+words[i+1:])
		}
	}
	return res
}
