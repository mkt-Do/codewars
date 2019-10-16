package codewars

import "strings"

func solve(str string) int {
	max := 0
	tmp := 0
	for _, r := range strings.ToLower(str) {
		if r >= 'a' && r <= 'z' {
			if r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u' {
				if max < tmp {
					max = tmp
				}
				tmp = 0
			} else {
				tmp += int(r) - 96
			}
		}
	}
	if max < tmp {
		max = tmp
	}
	return max
}
